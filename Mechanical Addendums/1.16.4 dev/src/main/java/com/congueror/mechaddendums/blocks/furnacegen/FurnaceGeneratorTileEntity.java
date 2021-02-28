package com.congueror.mechaddendums.blocks.furnacegen;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.congueror.mechaddendums.config.Config;
import com.congueror.mechaddendums.init.TileEntityInit;
import com.congueror.mechaddendums.util.energy.ModEnergyStorage;
import com.congueror.mechaddendums.util.enums.FurnaceGenTier;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
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
	public int counter;
	public int counter2 = 0;

	private int energyGeneration, maxEnergyOutput;
	public long energyGenerating;
	public int maxEnergy;

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

		if (counter2 > 0) {
			counter2--;
			if (counter > 0) {
				counter--;
				energyStorage.generateEnergy(energyGeneration);
			} else if (!itemHandler.getStackInSlot(0).isEmpty() && !energyStorage.isFullEnergy() && counter2 == 0) {
				itemHandler.extractItem(0, 1, false);
				counter = ForgeHooks.getBurnTime(stack) / 100;
			}
		} else {
			counter2 = 532;
		}

		BlockState blockState = world.getBlockState(pos);
		if (blockState.get(BlockStateProperties.LIT) != counter2 <= 0) {
			world.setBlockState(pos, blockState.with(BlockStateProperties.LIT, counter2 <= 0),
					Constants.BlockFlags.NOTIFY_NEIGHBORS + Constants.BlockFlags.BLOCK_UPDATE);
		}

		sendOutPower();
	}

	public long currentAmountEnergyProduced() {
		ItemStack stack = itemHandler.getStackInSlot(0);
		long mult = ForgeHooks.getBurnTime(stack) / 100;
		energyGenerating = energyGeneration * mult;
		return energyGenerating;
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

		counter = tag.getInt("counter");
		super.read(state, tag);
	}

	@Override
	public CompoundNBT write(CompoundNBT tag) {
		tag.put("inv", itemHandler.serializeNBT());
		tag.put("energy", energyStorage.serializeNBT());

		tag.putInt("counter", counter);
		return super.write(tag);
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