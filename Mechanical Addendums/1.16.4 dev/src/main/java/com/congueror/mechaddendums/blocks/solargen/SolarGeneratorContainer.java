package com.congueror.mechaddendums.blocks.solargen;

import com.congueror.mechaddendums.init.ContainerInit;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.IWorldPosCallable;

public class SolarGeneratorContainer extends Container{
	
	public final SolarGeneratorTileEntity tile;
    private final PlayerEntity player;

	public SolarGeneratorContainer(int windowId, PlayerEntity player, SolarGeneratorTileEntity tile, SolarGenTier tier) {
		super(ContainerInit.SOLAR_GENERATOR_CONTAINER.get(tier).get(), windowId);
		this.tile = tile;
        this.player = player;
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return isWithinUsableDistance(IWorldPosCallable.of(tile.getWorld(), tile.getPos()), player, tile.getBlockState().getBlock());
	}

}
