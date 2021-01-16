package com.congueror.mechaddendums.init;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.SolarGeneratorBlock;
import com.congueror.mechaddendums.blocks.SolarGeneratorTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {
	public static SolarGeneratorBlock solarGenBlock;
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MechAddendums.MOD_ID);
	
	public static final RegistryObject<TileEntityType<SolarGeneratorTileEntity>> BASIC_SOLAR_GENERATOR_TILE_ENTITY = TILE_ENTITIES.register("basic_solar_generator", () -> TileEntityType.Builder.create(SolarGeneratorTileEntity::new, BlockInit.SOLAR_GENERATOR.get()).build(null));
}
