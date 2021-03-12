package com.congueror.mechaddendums.util;

import java.util.Set;
import java.util.stream.Stream;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.WoodType;
import net.minecraft.client.renderer.model.RenderMaterial;

public class ModWoodType extends WoodType {
	// Credit to RavenUtils
	private static final Set<WoodType> VALUES = new ObjectArraySet<>();

	public static final WoodType RUBBER = register(new ModWoodType("rubber", RenderMaterials.RUBBER_SIGN));

	private final RenderMaterial material;

	public ModWoodType(String nameIn, RenderMaterial materials) {
		super(nameIn);
		material = materials;
	}

	public RenderMaterial getMaterial() {
		return material;
	}

	private static WoodType register(WoodType woodTypeIn) {
		VALUES.add(woodTypeIn);
		return woodTypeIn;
	}

	public static Stream<WoodType> getValues() {
		return VALUES.stream();
	}
}
