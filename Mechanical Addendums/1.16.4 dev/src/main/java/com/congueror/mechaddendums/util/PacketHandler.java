package com.congueror.mechaddendums.util;

import java.util.Optional;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.util.energy.UpdateSolarGenerator;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class PacketHandler {
	private static final String PROTOCOL_VERSION = "1";
    // @formatter:off
	public static SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
								new ResourceLocation(MechAddendums.MOD_ID, "net"), 
								() -> PROTOCOL_VERSION, 
								PROTOCOL_VERSION::equals, 
								PROTOCOL_VERSION::equals);
	// @formatter:on
    public static void init()
    {
        int id = 0;
        INSTANCE.registerMessage(id++, UpdateSolarGenerator.class, UpdateSolarGenerator::toBytes, UpdateSolarGenerator::new, UpdateSolarGenerator::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    };
}
