package com.congueror.mechaddendums.init;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.effects.DamagingEffect;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectInit 
{
	public static final DeferredRegister<Effect> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, MechAddendums.MOD_ID);
	
	public static RegistryObject<Effect> RADIATION = POTIONS.register("radiation", ()-> new DamagingEffect(EffectType.HARMFUL, 5149489));
	public static RegistryObject<Effect> LEAD_POISONING = POTIONS.register("lead_poisoning", ()-> new DamagingEffect(EffectType.HARMFUL, 6062));
}
