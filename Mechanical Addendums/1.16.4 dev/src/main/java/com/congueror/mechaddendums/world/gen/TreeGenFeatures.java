package com.congueror.mechaddendums.world.gen;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.config.WorldConfig;
import com.congueror.mechaddendums.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TreeGenFeatures {
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RUBBER_TREE = Feature.TREE.withConfiguration(configs.RUBBER_TREE_CONFIG);
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COCONUT_TREE = Feature.TREE.withConfiguration(configs.COCONUT_TREE_CONFIG);
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CANDLENUT_TREE = Feature.TREE.withConfiguration(configs.CANDLENUT_TREE_CONFIG);
	
	public static final ConfiguredFeature<?, ?> RUBBER_TREE_FEATURE = configuredTreeFeature("rubber_tree", RUBBER_TREE, WorldConfig.rubberChance.get().floatValue());
	public static final ConfiguredFeature<?, ?> COCONUT_TREE_FEATURE = configuredTreeFeature("coconut_tree", COCONUT_TREE, WorldConfig.coconutChance.get().floatValue());
	public static final ConfiguredFeature<?, ?> CANDLENUT_TREE_FEATURE = configuredTreeFeature("canlenut_tree", CANDLENUT_TREE, WorldConfig.candlenutChance.get().floatValue());

	public static ConfiguredFeature<?, ?> configuredTreeFeature(String nameIn, ConfiguredFeature<BaseTreeFeatureConfig, ?> feature, float extraChanceIn) {
		return createConfiguredFeature(nameIn, feature
				.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, extraChanceIn, 1))));
	}
	
	@SubscribeEvent
	public static void addTrees(BiomeLoadingEvent event) {
		BiomeGenerationSettingsBuilder builder = event.getGeneration();

		if (event.getName().toString().startsWith("minecraft:")) {
			if (doesBiomeMatch(event.getName(), Biomes.FOREST)) {
				builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RUBBER_TREE_FEATURE);
				builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, CANDLENUT_TREE_FEATURE);
			}

			if (doesBiomeMatch(event.getName(), Biomes.JUNGLE)) {
				builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, COCONUT_TREE_FEATURE);
			}
		}
	}

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> createConfiguredFeature(String nameIn,
			ConfiguredFeature<FC, ?> featureIn) {
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, MechAddendums.find(nameIn), featureIn);
	}

	public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, RegistryKey<Biome> biomeIn) {
		return biomeNameIn.getPath().matches(biomeIn.getLocation().getPath());
	}

	public static class configs {
		public static final BaseTreeFeatureConfig RUBBER_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
				new SimpleBlockStateProvider(BlockInit.RUBBER_LOG.get().getDefaultState()),
				new SimpleBlockStateProvider(BlockInit.RUBBER_LEAVES.get().getDefaultState()),
				new FancyFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3),
				new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
		public static final BaseTreeFeatureConfig COCONUT_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
				new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
				new SimpleBlockStateProvider(BlockInit.COCONUT_LEAVES.get().getDefaultState()),
				new AcaciaFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0)),
				new ForkyTrunkPlacer(5, 2, 2), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
		public static final BaseTreeFeatureConfig CANDLENUT_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
				new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
				new SimpleBlockStateProvider(BlockInit.CANDLENUT_LEAVES.get().getDefaultState()),
				new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3),
				new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
	}
}