package com.congueror.mechaddendums.init;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

public class ModLootModifiers {
	public static class DungeonLoot extends LootModifier {
		public final int multiplicationFactor;
		public Random random = new Random();

		public DungeonLoot(final ILootCondition[] conditionsIn, final int multiplicationFactor) {
			super(conditionsIn);
			this.multiplicationFactor = multiplicationFactor;
		}

		public DungeonLoot(final ILootCondition[] conditionsIn) {
			this(conditionsIn, 1);
		}

		@Override
		public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
			if (random.nextDouble() < 0.1) {
				generatedLoot.add(new ItemStack(ItemInit.EMERALD_HORN.get()));
				return generatedLoot.stream().map(ItemStack::copy)
						.peek(stack -> stack.setCount(
								Math.min(stack.getMaxStackSize(), stack.getCount() * this.multiplicationFactor)))
						.collect(Collectors.toList());
			} else {
				return generatedLoot;
			}
		}

		public static class Serializer extends GlobalLootModifierSerializer<DungeonLoot> {
			@Override
			public DungeonLoot read(ResourceLocation location, JsonObject object, ILootCondition[] conditions) {
				final int multiplicationFactor = JSONUtils.getInt(object, "multiplication_factor", 1);
				if (multiplicationFactor <= 0)
					throw new JsonParseException("Unable to set a multiplication factor to a number lower than 1");
				return new DungeonLoot(conditions, multiplicationFactor);
			}

			@Override
			public JsonObject write(DungeonLoot instance) {
				final JsonObject obj = this.makeConditions(instance.conditions);
				obj.addProperty("multiplication_factor", instance.multiplicationFactor);
				return obj;
			}
		}
	}

}
