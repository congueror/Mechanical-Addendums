package com.congueror.mechaddendums.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MAFoods {
	public static final Food LEAD_DUST = new Food.Builder().hunger(0).saturation(0.0F).effect(() -> new EffectInstance(EffectInit.LEAD_POISONING.get(), 400, 0), 1.0f).setAlwaysEdible().fastToEat().build();
	public static final Food URANIUM_DUST = new Food.Builder().hunger(0).saturation(0.0F).setAlwaysEdible().fastToEat().build();
	public static final Food RUM = new Food.Builder().hunger(1).saturation(0.3F).effect(() -> new EffectInstance(Effects.NAUSEA, 200, 0), 1.0f).setAlwaysEdible().build();
	public static final Food PINEAPPLE = new Food.Builder().hunger(2).saturation(0.8F).build();
	public static final Food PINEAPPLE_JUICE = new Food.Builder().hunger(1).saturation(0.3F).setAlwaysEdible().build();
	public static final Food COCONUT = new Food.Builder().hunger(2).saturation(0.8F).build();
	public static final Food COCONUT_MILK = new Food.Builder().hunger(1).saturation(0.3F).build();
	public static final Food PINA_COLADA = new Food.Builder().hunger(1).saturation(0.3F).build();
}
