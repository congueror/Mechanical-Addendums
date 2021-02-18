package com.congueror.mechaddendums.init;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraftforge.common.loot.LootModifier;

public class ModLootModifiers extends LootModifier{

	protected ModLootModifiers(ILootCondition[] conditionsIn) {
		super(conditionsIn);
	}

	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		return null;
	}

//	private static class Serializer extends GlobalLootModifierSerializer<WheatSeedsConverterModifier> {
//		
//	}
}
