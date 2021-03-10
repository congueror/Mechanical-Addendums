package com.congueror.mechaddendums.init;

import com.congueror.mechaddendums.MechAddendums;

import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LootModInit {
	public static final DeferredRegister<GlobalLootModifierSerializer<?>> LOOT_MODIFIER = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, MechAddendums.MOD_ID);
	
	public static final RegistryObject<GlobalLootModifierSerializer<?>> DUNGEON_LOOT = LOOT_MODIFIER.register("dungeon_loot", () -> new ModLootModifiers.DungeonLoot.Serializer());
}