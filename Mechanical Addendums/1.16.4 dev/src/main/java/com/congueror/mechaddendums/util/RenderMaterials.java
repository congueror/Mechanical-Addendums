package com.congueror.mechaddendums.util;

import java.util.ArrayList;
import java.util.List;

import com.congueror.mechaddendums.MechAddendums;

import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.util.ResourceLocation;

public class RenderMaterials {
	// Credit to RavenUtils
	public static final List<RenderMaterial> materials = new ArrayList<>();

	public static final RenderMaterial RUBBER_SIGN = material("entity/signs/rubber");

	@SuppressWarnings("deprecation")
	private static RenderMaterial material(String path) {
		RenderMaterial material = new RenderMaterial(AtlasTexture.LOCATION_BLOCKS_TEXTURE,
				new ResourceLocation(MechAddendums.MOD_ID, path));
		materials.add(material);
		return material;
	}
}
