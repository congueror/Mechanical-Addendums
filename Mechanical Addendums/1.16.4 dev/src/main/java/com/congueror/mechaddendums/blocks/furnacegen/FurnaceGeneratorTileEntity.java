package com.congueror.mechaddendums.blocks.furnacegen;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.congueror.mechaddendums.config.Config;
import com.congueror.mechaddendums.init.TileEntityInit;
import com.congueror.mechaddendums.util.energy.ModEnergyStorage;
import com.congueror.mechaddendums.util.enums.FurnaceGenTier;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class FurnaceGeneratorTileEntity extends TileEntity implements ITickableTileEntity, INamedContainerProvider {

	private ItemStackHandler itemHandler = createHandler();
	private ModEnergyStorage energyStorage = createEnergy();

	private LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);
	private LazyOptional<IEnergyStorage> energy = LazyOptional.of(() -> energyStorage);

	private FurnaceGenTier tier;

	private final NonNullList<ItemStack> items = NonNullList.withSize(1, ItemStack.EMPTY);
	
	private int burnTime;
	private int totalBurnTime;
    public static final int FIELDS_COUNT = 7;

	private int energyGeneration, maxEnergyOutput;
	public int energyGenerating = 0;
	public int maxEnergy;

	protected final IIntArray data = new IIntArray() {

		@Override
		public int get(int index) {
			switch (index) {
			case 0:
				return burnTime;
			case 1:
				return totalBurnTime;
			default:
				return 0;
			}
		}

		@Override
		public void set(int index, int value) {
			switch(index) {
			case 0:
				burnTime = value;
				break;
			case 1:
				totalBurnTime = value;
				break;
			}
		}

		@Override
		public int size() {
			return FIELDS_COUNT;
		}

	};

	public FurnaceGeneratorTileEntity(FurnaceGenTier tier) {
		super(TileEntityInit.FURNACE_GENERATOR_TILE_ENTITY.get(tier).get());
		this.tier = tier;
		energyGeneration = (int) (tier.getNum() * Config.solarGenMultiplier.get());
		maxEnergyOutput = energyGeneration * 2;
		maxEnergy = energyGeneration * 1000;
		this.energyStorage = createEnergy();
	}

	private ModEnergyStorage createEnergy() {
		return new ModEnergyStorage(maxEnergyOutput, maxEnergy);
	}

	@Override
	public void tick() {

		ItemStack stack = itemHandler.getStackInSlot(0);

		if (world.isRemote) {
			return;
		}

		if (energyStorage.getEnergyStored() < energyStorage.getMaxEnergyStored()) {
			if (burnTime <= 0 && isItemValid(stack)) {
				burnTime = ForgeHooks.getBurnTime(stack) / 100;
				if (burnTime > 0) {
					totalBurnTime = burnTime;
					if (stack.hasContainerItem()) {
						setInventorySlotContents(0, stack.getContainerItem());
					} else if (!stack.isEmpty()) {
						stack.shrink(1);
						if (stack.isEmpty()) {
							setInventorySlotContents(0, stack.getContainerItem());
						}
					}
				}
				sendUpdate(getActiveState(), true);
			}
		}

		if (burnTime > 0) {
			--burnTime;
			energyStorage.generateEnergy(energyGeneration);
		} else {
			sendUpdate(getInactiveState(), false);
		}

//		if (counter2 > 0) {
//			counter2--;
//			if (counter > 0) {
//				counter--;
//				energyStorage.generateEnergy(energyGeneration);
//			} else if (!itemHandler.getStackInSlot(0).isEmpty() && !energyStorage.isFullEnergy() && counter2 == 0) {
//				itemHandler.extractItem(0, 1, false);
//				counter = ForgeHooks.getBurnTime(stack) / 100;
//			}
//		} else {
//			counter2 = 532;
//		}

//		BlockState blockState = world.getBlockState(pos);
//		if (blockState.get(BlockStateProperties.LIT) != counter2 <= 0) {
//			world.setBlockState(pos, blockState.with(BlockStateProperties.LIT, counter2 <= 0),
//					Constants.BlockFlags.NOTIFY_NEIGHBORS + Constants.BlockFlags.BLOCK_UPDATE);
//		}

		sendOutPower();
	}

	public void setInventorySlotContents(int index, ItemStack stack) {
		this.items.set(0, stack);
		this.markDirty();
	}

	public int currentAmountEnergyProduced() {
		ItemStack stack = itemHandler.getStackInSlot(0);
		int mult = ForgeHooks.getBurnTime(stack) / 100;
		return (energyGeneration * mult);
	}

	public boolean isItemValid(ItemStack stack) {
		return ForgeHooks.getBurnTime(stack) > 0;
	}

	public int getEnergy() {
		return getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getEnergyStored).orElse(0);
	}

	@Override
	public void remove() {
		super.remove();
		handler.invalidate();
		energy.invalidate();
	}

	/*
	 * Outputs energy from the block
	 */
	private void sendOutPower() {
		AtomicInteger capacity = new AtomicInteger(energyStorage.getEnergyStored());
		if (capacity.get() > 0) {
			for (Direction direction : Direction.values()) {
				TileEntity te = world.getTileEntity(pos.offset(direction));
				if (te != null) {
					boolean doContinue = te.getCapability(CapabilityEnergy.ENERGY, direction).map(handler -> {
						if (handler.canReceive()) {
							int received = handler.receiveEnergy(Math.min(capacity.get(), maxEnergyOutput), false);
							capacity.addAndGet(-received);
							energyStorage.consumeEnergy(received);
							markDirty();
							return capacity.get() > 0;
						} else {
							return true;
						}
					}).orElse(true);
					if (!doContinue) {
						return;
					}
				}
			}
		}
	}

	@Override
	public void read(BlockState state, CompoundNBT tag) {
		itemHandler.deserializeNBT(tag.getCompound("inv"));
		energyStorage.deserializeNBT(tag.getCompound("energy"));

		this.burnTime = tag.getInt("BurnTime");
		this.totalBurnTime = tag.getInt("TotalBurnTime");
		super.read(state, tag);
	}

	@Override
	public CompoundNBT write(CompoundNBT tag) {
		tag.put("inv", itemHandler.serializeNBT());
		tag.put("energy", energyStorage.serializeNBT());
		
		tag.putInt("BurnTime", this.burnTime);
		tag.putInt("TotalBurnTime", this.totalBurnTime);

		return super.write(tag);
	}

	protected void sendUpdate(BlockState newState, boolean force) {
		if (world == null)
			return;
		BlockState oldState = world.getBlockState(pos);
		if (oldState != newState || force) {
			world.setBlockState(pos, newState, 3);
			world.notifyBlockUpdate(pos, oldState, newState, 3);
		}
	}

	protected BlockState getActiveState() {
		return getBlockState().with(AbstractFurnaceBlock.LIT, true);
	}

	protected BlockState getInactiveState() {
		return getBlockState().with(AbstractFurnaceBlock.LIT, false);
	}

	private ItemStackHandler createHandler() {
		return new ItemStackHandler(1) {

			@Override
			protected void onContentsChanged(int slot) {
				// To make sure the TE persists when the chunk is saved later we need to
				// mark it dirty every time the item handler changes
				markDirty();
			}

			@Override
			public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
				return ForgeHooks.getBurnTime(stack) > 0;
			}

			@Nonnull
			@Override
			public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
				if (!(ForgeHooks.getBurnTime(stack) > 0)) {
					return stack;
				}
				return super.insertItem(slot, stack, simulate);
			}
		};
	}

	@Nonnull
	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return handler.cast();
		}
		if (cap == CapabilityEnergy.ENERGY) {
			return energy.cast();
		}
		return super.getCapability(cap, side);
	}

	@Override
	public Container createMenu(int windowId, PlayerInventory playerInventory, PlayerEntity player) {
		return new FurnaceGeneratorContainer(windowId, world, pos, playerInventory, player, this, tier);
	}

	@Override
	public ITextComponent getDisplayName() {
		return new TranslationTextComponent(this.getBlockState().getBlock().getTranslationKey());
	}
}
