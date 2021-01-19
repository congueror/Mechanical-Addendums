package com.congueror.mechaddendums.util.eventbus;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("resource")
@Mod.EventBusSubscriber(Dist.CLIENT)
public class ClientEventBusSub implements IEventBusSub{
	@Override
	public PlayerEntity getClientPlayer()
    {
        return Minecraft.getInstance().player;
    }

	@Override
	public World getClientWorld()
    {
        return Minecraft.getInstance().world;
    }
}
