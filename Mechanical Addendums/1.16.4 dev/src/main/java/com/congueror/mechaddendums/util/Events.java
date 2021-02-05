package com.congueror.mechaddendums.util;

import javax.annotation.Nullable;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristSpawner;

import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {
	
	@Nullable
    private static WanderingFloristSpawner wanderingFloristSpawner = null;
	
	@SubscribeEvent
	  public static void onServerSetUp(FMLServerStartingEvent event) {
	    ServerWorld world = event.getServer().func_241755_D_();
	    wanderingFloristSpawner = new WanderingFloristSpawner(world);
	}
	
	@SubscribeEvent
	public static void onServerTick(TickEvent.ServerTickEvent event) {
	    if (wanderingFloristSpawner != null)
	    	wanderingFloristSpawner.tick(); 
	  }
}
