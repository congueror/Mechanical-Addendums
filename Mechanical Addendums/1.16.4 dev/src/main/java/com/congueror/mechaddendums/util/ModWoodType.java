package com.congueror.mechaddendums.util;

import net.minecraft.block.WoodType;

public class ModWoodType extends WoodType{
	
	public static final WoodType RUBBER = register(new ModWoodType("rubber_"));
	public final String name;

	public ModWoodType(String nameIn) {
		super(nameIn);
		this.name = nameIn;
	}

	public static WoodType register(WoodType woodTypeIn) {
		VALUES.add(woodTypeIn);
		return woodTypeIn;
	}
}
