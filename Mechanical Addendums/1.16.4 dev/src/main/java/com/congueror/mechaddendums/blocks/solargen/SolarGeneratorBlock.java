package com.congueror.mechaddendums.blocks.solargen;

import java.util.List;

import javax.annotation.Nullable;

import com.congueror.mechaddendums.blocks.MachineBlock;
import com.congueror.mechaddendums.util.enums.SolarGenTier;
import com.congueror.mechaddendums.util.helpers.TooltipHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.network.NetworkHooks;

public class SolarGeneratorBlock extends MachineBlock {
	protected final SolarGenTier tier;
	private static final ResourceLocation WRENCH = new ResourceLocation("forge", "wrench");

	public SolarGeneratorBlock(SolarGenTier tier) {
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL)
				.harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool());
		this.tier = tier;
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (!worldIn.isRemote) {

			if (player.isCrouching()) {
				if (player.getHeldItemMainhand().getItem().getTags().contains(WRENCH)) {
					dismantleBlock(worldIn, pos);
					return ActionResultType.SUCCESS;
				}
			}

			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if (tileEntity instanceof INamedContainerProvider) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) tileEntity,
						tileEntity.getPos());
			} else {
				throw new IllegalStateException("Named container provider is missing!");
			}
		}
		return ActionResultType.SUCCESS;
	}

	private void dismantleBlock(World worldIn, BlockPos pos) {
		ItemStack itemStack = new ItemStack(this);

		SolarGeneratorTileEntity localTileEntity = (SolarGeneratorTileEntity) worldIn.getTileEntity(pos);
		int internalEnergy = localTileEntity.getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getEnergyStored)
				.orElse(0);
		if (internalEnergy > 0) {
			CompoundNBT energyValue = new CompoundNBT();
			energyValue.putInt("value", internalEnergy);

			CompoundNBT energy = new CompoundNBT();
			energy.put("energy", energyValue);

			CompoundNBT root = new CompoundNBT();
			root.put("BlockEntityTag", energy);
			itemStack.setTag(root);
		}

		worldIn.removeBlock(pos, false);

		ItemEntity entityItem = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
				itemStack);

		entityItem.setMotion(0, entityItem.getYOffset(), 0);
		worldIn.addEntity(entityItem);
	}

	@Override
	public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player,
			boolean willHarvest, FluidState fluid) {

		return willHarvest || super.removedByPlayer(state, world, pos, player, willHarvest, fluid);
	}

	@Override
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, TileEntity te,
			ItemStack stack) {
		super.harvestBlock(worldIn, player, pos, state, te, stack);
		worldIn.removeBlock(pos, false);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new SolarGeneratorTileEntity(tier);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void addInformation(ItemStack stack, IBlockReader worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {
		CompoundNBT compoundnbt = stack.getChildTag("BlockEntityTag");
		int energy = 0;
		if (compoundnbt != null)
			if (compoundnbt.contains("energy"))
				energy = compoundnbt.getCompound("energy").getInt("value");

		TooltipHelper.showInfoShiftSolarGen(this.tier, tooltip, energy);
	}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
	}
}
