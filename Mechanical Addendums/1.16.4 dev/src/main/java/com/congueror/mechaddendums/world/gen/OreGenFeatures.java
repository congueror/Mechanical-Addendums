package com.congueror.mechaddendums.world.gen;

import com.congueror.mechaddendums.config.OreConfig;
import com.congueror.mechaddendums.config.WorldConfig;
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
		if(OreConfig.enableTin.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountTin.get(), OreConfig.veinSizeTin.get(), OreConfig.minYTin.get(), OreConfig.maxYTin.get(), BlockInit.TIN_ORE.get());}
		if(OreConfig.enableAluminum.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountAluminum.get(), OreConfig.veinSizeAluminum.get(), OreConfig.minYAluminum.get(), OreConfig.maxYAluminum.get(), BlockInit.ALUMINUM_ORE.get());}
		if(OreConfig.enableCopper.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountCopper.get(), OreConfig.veinSizeCopper.get(), OreConfig.minYCopper.get(), OreConfig.maxYCopper.get(), BlockInit.COPPER_ORE.get());}
		if(OreConfig.enableLead.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountLead.get(), OreConfig.veinSizeLead.get(), OreConfig.minYLead.get(), OreConfig.maxYLead.get(), BlockInit.LEAD_ORE.get());}
		if(OreConfig.enableSilver.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountSilver.get(), OreConfig.veinSizeSilver.get(), OreConfig.minYSilver.get(), OreConfig.maxYSilver.get(), BlockInit.SILVER_ORE.get());}
		if(OreConfig.enableNickel.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountNickel.get(), OreConfig.veinSizeNickel.get(), OreConfig.minYNickel.get(), OreConfig.maxYNickel.get(), BlockInit.NICKEL_ORE.get());}
		if(OreConfig.enableSulfur.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountSulfur.get(), OreConfig.veinSizeSulfur.get(), OreConfig.minYSulfur.get(), OreConfig.maxYSulfur.get(), BlockInit.SULFUR_ORE.get());}
		if(OreConfig.enablePlatinum.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountPlatinum.get(), OreConfig.veinSizePlatinum.get(), OreConfig.minYPlatinum.get(), OreConfig.maxYPlatinum.get(), BlockInit.PLATINUM_ORE.get());}
		if(OreConfig.enableTungsten.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountTungsten.get(), OreConfig.veinSizeTungsten.get(), OreConfig.minYTungsten.get(), OreConfig.maxYTungsten.get(), BlockInit.TUNGSTEN_ORE.get());}
		if(OreConfig.enableRuby.get()) {
		registerNetherConfiguredOre(OreConfig.veinCountRuby.get(), OreConfig.veinSizeRuby.get(), OreConfig.minYRuby.get(), OreConfig.maxYRuby.get(), BlockInit.RUBY_ORE.get());}
		if(OreConfig.enableAmethyst.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountAmethyst.get(), OreConfig.veinSizeAmethyst.get(), OreConfig.minYAmethyst.get(), OreConfig.maxYAmethyst.get(), BlockInit.AMETHYST_ORE.get());}
		if(OreConfig.enableSapphire.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountSapphire.get(), OreConfig.veinSizeSapphire.get(), OreConfig.minYSapphire.get(), OreConfig.maxYSapphire.get(), BlockInit.SAPPHIRE_ORE.get());}
		if(OreConfig.enableOpal.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountOpal.get(), OreConfig.veinSizeOpal.get(), OreConfig.minYOpal.get(), OreConfig.maxYOpal.get(), BlockInit.OPAL_ORE.get());}
		if(OreConfig.enableTitanium.get()) {
		registerNetherConfiguredOre(OreConfig.veinCountTitanium.get(), OreConfig.veinSizeTitanium.get(), OreConfig.minYTitanium.get(), OreConfig.maxYTitanium.get(), BlockInit.TITANIUM_ORE.get());}
		if(OreConfig.enableUranium.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountUranium.get(), OreConfig.veinSizeUranium.get(), OreConfig.minYUranium.get(), OreConfig.maxYUranium.get(), BlockInit.URANIUM_ORE.get());}
		if(OreConfig.enableCobalt.get()) {
		registerNetherConfiguredOre(OreConfig.veinCountCobalt.get(), OreConfig.veinSizeCobalt.get(), OreConfig.minYCobalt.get(), OreConfig.maxYCobalt.get(), BlockInit.COBALT_ORE.get());}
		if(OreConfig.enableZinc.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountZinc.get(), OreConfig.veinSizeZinc.get(), OreConfig.minYZinc.get(), OreConfig.maxYZinc.get(), BlockInit.ZINC_ORE.get());}
		if(OreConfig.enableSaltpetre.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountSaltpetre.get(), OreConfig.veinSizeAluminum.get(), OreConfig.minYSaltpetre.get(), OreConfig.maxYSaltpetre.get(), BlockInit.SALTPETRE_ORE.get());}
		if(OreConfig.enableChromium.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountChromium.get(), OreConfig.veinSizeChromium.get(), OreConfig.minYChromium.get(), OreConfig.maxYSaltpetre.get(), BlockInit.CHROMIUM_ORE.get());}
		if(OreConfig.enableThorium.get()) {
		registerOverworldConfiguredOre(OreConfig.veinCountThorium.get(), OreConfig.veinSizeThorium.get(), OreConfig.minYThorium.get(), OreConfig.maxYThorium.get(), BlockInit.THORIUM_ORE.get());}
		
		if(WorldConfig.enableSalt.get()) {
		registerConfiguredDisk(BlockInit.SALT_BLOCK.get());}
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
