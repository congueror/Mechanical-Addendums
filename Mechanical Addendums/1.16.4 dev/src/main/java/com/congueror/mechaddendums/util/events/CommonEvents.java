package com.congueror.mechaddendums.util.events;

import com.congueror.mechaddendums.MechAddendums;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class CommonEvents {

	@EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Bus.MOD)
	public static class ModCommonEvents {
		
	}
	
	@EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Bus.FORGE)
	public static class ForgeCommonEvents {
		
	}
}
