package com.congueror.mechaddendums.util.events;

import com.congueror.mechaddendums.MechAddendums;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class CommonEvents {

	@EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Bus.MOD)
	public static class ModCommonEvents {
		
	}
	
	@EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Bus.FORGE)
	public static class ForgeCommonEvents implements IEventBusSub{

		@Override
		public PlayerEntity getClientPlayer() {
			throw new IllegalStateException("This should only be called from client side");
		}

		@Override
		public World getClientWorld() {
			throw new IllegalStateException("This should only be called from client side");
		}
	}
}
