package com.congueror.mechaddendums.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IEventBusSub {
	PlayerEntity getClientPlayer();
	World getClientWorld();
}
