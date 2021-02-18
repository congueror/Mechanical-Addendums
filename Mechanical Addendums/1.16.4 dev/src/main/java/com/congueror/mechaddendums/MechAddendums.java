package com.congueror.mechaddendums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.congueror.mechaddendums.config.Config;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristEntity;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ContainerInit;
import com.congueror.mechaddendums.init.EffectInit;
import com.congueror.mechaddendums.init.EntityInit;
import com.congueror.mechaddendums.init.ItemInit;
import com.congueror.mechaddendums.init.SoundInit;
import com.congueror.mechaddendums.init.TileEntityInit;
import com.congueror.mechaddendums.network.PacketHandler;
import com.congueror.mechaddendums.util.Strippables;
import com.congueror.mechaddendums.util.events.ClientEvents;
import com.congueror.mechaddendums.util.events.CommonEvents;
import com.congueror.mechaddendums.util.events.IEventBusSub;
import com.congueror.mechaddendums.world.gen.OreGenFeatures;
import com.congueror.mechaddendums.world.gen.TreeGenFeatures;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mechaddendums")
@EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Bus.MOD)
public class MechAddendums
{
    public static final Logger LOGGER;
    public static final String MOD_ID = "mechaddendums";
    public static MechAddendums instance;
        
    public static IEventBusSub eventbussub = DistExecutor.safeRunForDist(() -> ClientEvents.ForgeClientEvents::new, () -> CommonEvents.ForgeCommonEvents::new);
    
    public MechAddendums() {
    	ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
        
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::loadComplete);
        
        MechAddendums.instance = this;
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EffectInit.POTIONS.register(modEventBus);
        TileEntityInit.TILE_ENTITIES.register(modEventBus);
        ContainerInit.CONTAINERS.register(modEventBus);
        EntityInit.ENTITY_TYPES.register(modEventBus);
        SoundInit.SOUNDS.register(modEventBus);
        
        ItemInit.init();
        BlockInit.init();
        ContainerInit.init();
        TileEntityInit.init();
        
        
        PacketHandler.init();
        
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new OreGenFeatures());
        MinecraftForge.EVENT_BUS.register(TreeGenFeatures.class);
    }
    
    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event) {    	
    	TreeGenFeatures.configs.RUBBER_TREE_CONFIG.forcePlacement = false;
    	TreeGenFeatures.configs.COCONUT_TREE_CONFIG.forcePlacement = true;
    	TreeGenFeatures.configs.CANDLENUT_TREE_CONFIG.forcePlacement = false;
    	
        OreGenFeatures.initModFeatures();
    }
    
    @SubscribeEvent
    public void loadComplete(final FMLLoadCompleteEvent event) {
    	Strippables.strippableLogs();
    }
    
    @SubscribeEvent(priority = EventPriority.LOWEST)
	public static void imstuff(final RegistryEvent.Register<EntityType<?>> event) {
        GlobalEntityTypeAttributes.put(EntityInit.WANDERING_FLORIST.get(), WanderingFloristEntity.Attributes().create());
	}
    
    public static String find(String name)
	{
		return MechAddendums.MOD_ID + ":" + name;
	}
    
    static {
        LOGGER = LogManager.getLogger();
    }
    
    public static ResourceLocation location(String path)
    {
        return new ResourceLocation(MOD_ID, path);
    }
    
    public static boolean isCLibLoaded() {
    	return ModList.get().isLoaded("clib");
    }
}
