package com.congueror.mechaddendums.init;

import com.congueror.mechaddendums.MechAddendums;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MechAddendums.MOD_ID);
	
	public static final Lazy<SoundEvent> PINA_COLADA_SONG_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(MechAddendums.MOD_ID, "item.pina_colada_song_disc")));
	public static final RegistryObject<SoundEvent> PINA_COLADA_SONG_DISC = SOUNDS.register("item.pina_colada_song_disc.disc", PINA_COLADA_SONG_LAZY);
	
	public static final Lazy<SoundEvent> HORN_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(MechAddendums.MOD_ID, "item.horn_disc")));
	public static final RegistryObject<SoundEvent> HORN_DISC = SOUNDS.register("item.horn_disc.disc", HORN_LAZY);
}
