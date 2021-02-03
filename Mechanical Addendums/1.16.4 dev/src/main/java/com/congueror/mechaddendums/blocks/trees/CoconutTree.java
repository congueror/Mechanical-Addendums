package com.congueror.mechaddendums.blocks.trees;

import java.util.Random;

import com.congueror.mechaddendums.world.gen.TreeGenFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class CoconutTree extends Tree
{
	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
		return TreeGenFeatures.COCONUT_TREE;
	}
}
