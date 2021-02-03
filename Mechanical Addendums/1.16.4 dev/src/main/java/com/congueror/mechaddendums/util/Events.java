package com.congueror.mechaddendums.util;

import java.util.HashMap;
import java.util.Map;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristSpawner;

import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MechAddendums.MOD_ID)
public class Events {

	private static final Map<ServerWorld, WanderingFloristSpawner> WADNERING_FLORIST_SPAWNER_MAP = new HashMap<>();

    @SubscribeEvent
    public static void worldLoad(WorldEvent.Load evt) {
        if (!evt.getWorld().isRemote() && evt.getWorld() instanceof ServerWorld) {
        	WADNERING_FLORIST_SPAWNER_MAP.put((ServerWorld) evt.getWorld(), new WanderingFloristSpawner((ServerWorld) evt.getWorld()));
        }
    }

    @SubscribeEvent
    public static void worldUnload(WorldEvent.Unload evt) {
        if (!evt.getWorld().isRemote() && evt.getWorld() instanceof ServerWorld) {
        	WADNERING_FLORIST_SPAWNER_MAP.remove(evt.getWorld());
        }
    }

    @SubscribeEvent
    public static void onServerTick(TickEvent.WorldTickEvent tick){
        if(!tick.world.isRemote && tick.world instanceof ServerWorld){
            ServerWorld serverWorld = (ServerWorld)tick.world;
            WanderingFloristSpawner spawner = WADNERING_FLORIST_SPAWNER_MAP.get(serverWorld);
            if (spawner != null) {
                spawner.tick();
            }
        }

    }
}
