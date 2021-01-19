package com.congueror.mechaddendums.init;

import java.util.HashMap;
import java.util.Map;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorBlock;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorTileEntity;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {
	public static SolarGeneratorBlock solarGenBlock;
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MechAddendums.MOD_ID);
	
    public static final Map<SolarGenTier, RegistryObject<TileEntityType<SolarGeneratorTileEntity>>> SOLAR_GENERATOR_TILE_ENTITY = new HashMap<>();
    public static void forLoop() {
    	for(SolarGenTier tier : SolarGenTier.values()) {
    		SOLAR_GENERATOR_TILE_ENTITY.put(tier, TILE_ENTITIES.register(tier.getSolarGenName(), () -> TileEntityType.Builder.create(() -> new SolarGeneratorTileEntity(tier), BlockInit.SOLAR_GENERATOR.get(tier).get()).build(null)));
    	}
    }
}
