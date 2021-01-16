package com.congueror.mechaddendums.init;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.SolarGeneratorContainer;
import com.congueror.mechaddendums.blocks.SolarGeneratorTileEntity;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerInit {

	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MechAddendums.MOD_ID);
	
	public static final RegistryObject<ContainerType<SolarGeneratorContainer>> BASIC_SOLAR_GENERATOR_CONTAINER = CONTAINERS.register("", () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        TileEntity te = inv.player.getEntityWorld().getTileEntity(pos);
        if(!(te instanceof SolarGeneratorTileEntity))
        {
            MechAddendums.LOGGER.error("Wrong type of tile entity (expected TileEntitySolarPanel)!");
            return null;
        }
        SolarGeneratorTileEntity tile = (SolarGeneratorTileEntity) te;
        return new SolarGeneratorContainer(windowId, inv.player, tile);
    }));
}
