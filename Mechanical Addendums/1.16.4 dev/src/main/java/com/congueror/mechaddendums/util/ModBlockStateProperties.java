package com.congueror.mechaddendums.util;

import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;

public class ModBlockStateProperties extends BlockStateProperties{
	public static final IntegerProperty LEVEL_0_10 = IntegerProperty.create("level", 0, 10);
}
