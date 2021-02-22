package com.congueror.mechaddendums.init;

import java.util.HashMap;
import java.util.Map;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.coalgen.CoalGeneratorContainer;
import com.congueror.mechaddendums.blocks.coalgen.CoalGeneratorTileEntity;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorContainer;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorTileEntity;
import com.congueror.mechaddendums.util.enums.CoalGenTier;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerInit {

	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MechAddendums.MOD_ID);
	
    public static final Map<SolarGenTier, RegistryObject<ContainerType<SolarGeneratorContainer>>> SOLAR_GENERATOR_CONTAINER = new HashMap<>();
    public static final Map<CoalGenTier, RegistryObject<ContainerType<CoalGeneratorContainer>>> COAL_GENERATOR_CONTAINER = new HashMap<>();
    public static void init() {
    	for(SolarGenTier tier : SolarGenTier.values()) {
    		SOLAR_GENERATOR_CONTAINER.put(tier, CONTAINERS.register(tier.getSolarGenName(), () -> IForgeContainerType.create((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                TileEntity te = inv.player.getEntityWorld().getTileEntity(pos);
                if(!(te instanceof SolarGeneratorTileEntity))
                {
                    MechAddendums.LOGGER.error("Wrong type of tile entity (expected TileEntitySolarGenerator)!");
                    return null;
                }
                SolarGeneratorTileEntity tile = (SolarGeneratorTileEntity) te;
                return new SolarGeneratorContainer(windowId, inv.player, tile, tier);
            })));
    	}
    	for(CoalGenTier tier : CoalGenTier.values()) {
    		COAL_GENERATOR_CONTAINER.put(tier, CONTAINERS.register(tier.getCoalGenName(), () -> IForgeContainerType.create((windowId, inv, data) -> {
    			BlockPos pos = data.readBlockPos();
                TileEntity te = inv.player.getEntityWorld().getTileEntity(pos);
    	        World world = inv.player.getEntityWorld();
    	        CoalGeneratorTileEntity tile = (CoalGeneratorTileEntity) te;
    	        return new CoalGeneratorContainer(windowId, world, pos, inv, inv.player, tile, tier);
    	    })));
    	}
    }
}
