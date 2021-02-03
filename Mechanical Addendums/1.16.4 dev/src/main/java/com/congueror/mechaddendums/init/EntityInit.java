package com.congueror.mechaddendums.init;


import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MechAddendums.MOD_ID);
	
	public static final RegistryObject<EntityType<WanderingFloristEntity>> WANDERING_FLORIST = 
			ENTITY_TYPES.register("wandering_florist_entity", () -> EntityType.Builder.<WanderingFloristEntity>create(WanderingFloristEntity::new, 
					EntityClassification.CREATURE).size(0.6f, 1.95f).build(new ResourceLocation(MechAddendums.MOD_ID, "wandering_florist_entity").toString()));
}
