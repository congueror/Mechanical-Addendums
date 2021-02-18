package com.congueror.mechaddendums.world.gen;

import com.congueror.mechaddendums.config.Config;
import com.congueror.mechaddendums.init.BlockInit;
import com.google.common.collect.ImmutableList;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class OreGenFeatures {
	
	public static void initModFeatures() {
		//if statements here
		registerOverworldConfiguredOre(Config.veinCountTin.get(), Config.veinSizeTin.get(), Config.minYTin.get(), Config.maxYTin.get(), BlockInit.TIN_ORE.get());
		registerOverworldConfiguredOre(Config.veinCountAluminum.get(), Config.veinSizeAluminum.get(), Config.minYAluminum.get(), Config.maxYAluminum.get(), BlockInit.ALUMINUM_ORE.get());
		registerOverworldConfiguredOre(20, 8, 0, 63, BlockInit.COPPER_ORE.get());
		registerOverworldConfiguredOre(4, 7, 0, 31, BlockInit.LEAD_ORE.get());
		registerOverworldConfiguredOre(3, 7, 0, 16, BlockInit.SILVER_ORE.get());
		registerOverworldConfiguredOre(4, 7, 0, 31, BlockInit.NICKEL_ORE.get());
		registerOverworldConfiguredOre(2, 3, 0, 100, BlockInit.SULFUR_ORE.get());
		registerOverworldConfiguredOre(1, 6, 0, 8, BlockInit.PLATINUM_ORE.get());
		registerOverworldConfiguredOre(2, 6, 0, 16, BlockInit.TUNGSTEN_ORE.get());
		registerNetherConfiguredOre(1, 3, 0, 18, BlockInit.RUBY_ORE.get());
		registerOverworldConfiguredOre(1, 6, 0, 16, BlockInit.AMETHYST_ORE.get());
		registerOverworldConfiguredOre(2, 8, 0, 16, BlockInit.SAPPHIRE_ORE.get());
		registerOverworldConfiguredOre(1, 6, 0, 9, BlockInit.OPAL_ORE.get());
		registerNetherConfiguredOre(1, 7, 0, 7, BlockInit.TITANIUM_ORE.get());
		registerOverworldConfiguredOre(1, 7, 0, 16, BlockInit.URANIUM_ORE.get());
		registerNetherConfiguredOre(2, 7, 0, 8, BlockInit.COBALT_ORE.get());
		registerOverworldConfiguredOre(8, 7, 0, 32, BlockInit.ZINC_ORE.get());
		registerOverworldConfiguredOre(2, 3, 0, 100, BlockInit.SALTPETRE_ORE.get());
		registerOverworldConfiguredOre(6, 7, 0, 22, BlockInit.CHROMIUM_ORE.get());
		registerOverworldConfiguredOre(1, 7, 0, 8, BlockInit.THORIUM_ORE.get());
		
		registerConfiguredDisk(BlockInit.SALT_BLOCK.get());
	}
	
	public static void registerOverworldConfiguredOre(int veinCount, int veinSize, int minY, int maxY, Block ore){
        if(ore.getRegistryName() != null)
         Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getRegistryName(), Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ore.getDefaultState(), veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minY, minY, maxY))).square().func_242731_b(veinCount));
    }
	
	public static void registerNetherConfiguredOre(int veinCount, int veinSize, int minY, int maxY, Block ore){
        if(ore.getRegistryName() != null)
         Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getRegistryName(), Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, ore.getDefaultState(), veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minY, minY, maxY))).square().func_242731_b(veinCount));
    }
	
	public static void registerConfiguredDisk(Block block) {
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, block.getRegistryName(), Feature.DISK
				.withConfiguration(new SphereReplaceConfig(block.getDefaultState(),FeatureSpread.func_242253_a(2, 1), 1,ImmutableList.of(Blocks.DIRT.getDefaultState(), block.getDefaultState())))
				.withPlacement(Features.Placements.SEAGRASS_DISK_PLACEMENT));
	}
	
	@SubscribeEvent
	public void setupOreGenerator(BiomeLoadingEvent event)
    {
		//add if statement here as well
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        ConfiguredFeature<?, ?> salt_feature = WorldGenRegistries.CONFIGURED_FEATURE
				.getOrDefault(BlockInit.SALT_BLOCK.get().getRegistryName());
		generation.withFeature(GenerationStage.Decoration.LAKES , salt_feature);
        
        if (!event.getCategory().equals(Biome.Category.NETHER) && !event.getCategory().equals(Biome.Category.THEEND))
        {        	
        	ConfiguredFeature<?,?> tin_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.TIN_ORE.get().getRegistryName());
            if(tin_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, tin_feature);}
            
            ConfiguredFeature<?,?> aluminum_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.ALUMINUM_ORE.get().getRegistryName());
            if(aluminum_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, aluminum_feature);}
            
            ConfiguredFeature<?,?> amethyst_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.AMETHYST_ORE.get().getRegistryName());
            if(amethyst_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, amethyst_feature);}
            
            ConfiguredFeature<?,?> copper_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.COPPER_ORE.get().getRegistryName());
            if(copper_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, copper_feature);}
        	
            ConfiguredFeature<?,?> lead_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.LEAD_ORE.get().getRegistryName());
            if(lead_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, lead_feature);}
            
            ConfiguredFeature<?,?> nickel_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.NICKEL_ORE.get().getRegistryName());
            if(nickel_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, nickel_feature);}
            
            ConfiguredFeature<?,?> opal_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.OPAL_ORE.get().getRegistryName());
            if(opal_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, opal_feature);}
            
            ConfiguredFeature<?,?> platinum_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.PLATINUM_ORE.get().getRegistryName());
            if(platinum_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, platinum_feature);}
            
            ConfiguredFeature<?,?> saltpetre_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.SALTPETRE_ORE.get().getRegistryName());
            if(saltpetre_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, saltpetre_feature);}
            
            ConfiguredFeature<?,?> sapphire_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.SAPPHIRE_ORE.get().getRegistryName());
            if(sapphire_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, sapphire_feature);}
            
            ConfiguredFeature<?,?> silver_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.SILVER_ORE.get().getRegistryName());
            if(silver_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, silver_feature);}
            
            ConfiguredFeature<?,?> sulfur_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.SULFUR_ORE.get().getRegistryName());
            if(sulfur_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, sulfur_feature);}
            
            ConfiguredFeature<?,?> tungsten_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.TUNGSTEN_ORE.get().getRegistryName());
            if(tungsten_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, tungsten_feature);}
            
            ConfiguredFeature<?,?> uranium_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.URANIUM_ORE.get().getRegistryName());
            if(uranium_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, uranium_feature);}
            
            ConfiguredFeature<?,?> zinc_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.ZINC_ORE.get().getRegistryName());
            if(zinc_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, zinc_feature);}
            
            ConfiguredFeature<?,?> chromium_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.CHROMIUM_ORE.get().getRegistryName());
            if(chromium_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, chromium_feature);}
            
            ConfiguredFeature<?,?> thorium_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.THORIUM_ORE.get().getRegistryName());
            if(thorium_feature != null) {
                generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, thorium_feature);}
         }
            
         if(event.getCategory().equals(Biome.Category.NETHER)) 
         {
        	 
        	 ConfiguredFeature<?,?> cobalt_nether_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.COBALT_ORE.get().getRegistryName());
             if(cobalt_nether_feature != null) {
                 generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, cobalt_nether_feature);}
             
             ConfiguredFeature<?,?> ruby_nether_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.RUBY_ORE.get().getRegistryName());
             if(ruby_nether_feature != null) {
                 generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ruby_nether_feature);}
             
             ConfiguredFeature<?,?> titanium_nether_feature = WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(BlockInit.TITANIUM_ORE.get().getRegistryName());
             if(titanium_nether_feature != null) {
                 generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, titanium_nether_feature);}
         }
    }
}
