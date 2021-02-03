package com.congueror.mechaddendums.entities.wandering_florist;

import com.congueror.mechaddendums.MechAddendums;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.layers.HeadLayer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WanderingFloristRenderer extends MobRenderer<WanderingFloristEntity, VillagerModel<WanderingFloristEntity>> {
	   private static final ResourceLocation field_217780_a = new ResourceLocation(MechAddendums.MOD_ID, "textures/entity/wandering_florist_entity.png");

	   public WanderingFloristRenderer(EntityRendererManager renderManagerIn) {
	      super(renderManagerIn, new VillagerModel<>(0.0F), 0.5F);
	      this.addLayer(new HeadLayer<>(this));
	      this.addLayer(new CrossedArmsItemLayer<>(this));
	   }

	   /**
	    * Returns the location of an entity's texture.
	    */
	   public ResourceLocation getEntityTexture(WanderingFloristEntity entity) {
	      return field_217780_a;
	   }

	   protected void preRenderCallback(WanderingFloristEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
	      @SuppressWarnings("unused")
		float f = 0.9375F;
	      matrixStackIn.scale(0.9375F, 0.9375F, 0.9375F);
	   }
	}