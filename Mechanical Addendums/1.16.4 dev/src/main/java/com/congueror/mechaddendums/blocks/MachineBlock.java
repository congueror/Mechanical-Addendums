package com.congueror.mechaddendums.blocks;

import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

public class MachineBlock extends Block{

	//TODO Finish the abstract class
    private static final ResourceLocation WRENCH = new ResourceLocation("forge", "wrench");
	
	public MachineBlock(Properties properties) {
		super(properties);
	}

	public ActionResultType useWrench(World worldIn, BlockPos pos, PlayerEntity player, TileEntity tile) {
		if(player.isCrouching())
        {
            if(player.getHeldItemMainhand().getItem().getTags().contains(WRENCH))
            {
                dismantleBlock(worldIn, pos, null);
                return ActionResultType.SUCCESS;
            }
        } return ActionResultType.PASS;
	}
	
	public void dismantleBlock(World worldIn, BlockPos pos, TileEntity te)
    {
        ItemStack itemStack = new ItemStack(this);

        SolarGeneratorTileEntity localTileEntity = (SolarGeneratorTileEntity) worldIn.getTileEntity(pos);
        int internalEnergy = localTileEntity.getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getEnergyStored).orElse(0);
        if(internalEnergy > 0)
        {
            CompoundNBT energyValue = new CompoundNBT();
            energyValue.putInt("value", internalEnergy);

            CompoundNBT energy = new CompoundNBT();
            energy.put("energy", energyValue);

            CompoundNBT root = new CompoundNBT();
            root.put("BlockEntityTag", energy);
            itemStack.setTag(root);
        }

        worldIn.removeBlock(pos, false);

        ItemEntity entityItem = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, itemStack);

        entityItem.setMotion(0, entityItem.getYOffset(), 0);
        worldIn.addEntity(entityItem);
    }
	
	@Override
	public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, FluidState fluid)
	{
		
	    return willHarvest || super.removedByPlayer(state, world, pos, player, willHarvest, fluid);
	}

	@Override
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, TileEntity te, ItemStack stack)
	{
	    super.harvestBlock(worldIn, player, pos, state, te, stack);
	    worldIn.removeBlock(pos, false);
	}
}
