package com.congueror.mechaddendums.effects;

import com.congueror.mechaddendums.init.DamageSources;
import com.congueror.mechaddendums.init.EffectInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class DamagingEffect extends Effect
{

	public DamagingEffect(EffectType typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}
	
	@Override
	public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
		if(this == EffectInit.RADIATION.get()) {
			entityLivingBaseIn.attackEntityFrom(DamageSources.RADIATION, 0.8F);
		} else {
			entityLivingBaseIn.attackEntityFrom(DamageSources.LEAD_POISONING, 0.2F);
		}
	}
	
	public static void playSound(PlayerEntity playerIn, SoundEvent soundIn) {
	      playerIn.playSound(soundIn, SoundCategory.PLAYERS, 6.0F, 1.0F);
	}
	
	@Override
	public boolean isReady(int duration, int amplifier) {
		if(this == EffectInit.RADIATION.get()) {
			int j = 15 >> amplifier;
	         if (j > 0) {
	            return duration % j == 0;
	         } else {
	            return true;
	         }
		} else {
			int i = 50 >> amplifier;
	         if (i > 0) {
	            return duration % i == 0;
	         } else {
	            return true;
	         }
		}
	}
}
