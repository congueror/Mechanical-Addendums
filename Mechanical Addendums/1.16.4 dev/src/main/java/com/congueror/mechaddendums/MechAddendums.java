package com.congueror.mechaddendums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorScreen;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristEntity;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristRenderer;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ContainerInit;
import com.congueror.mechaddendums.init.EffectInit;
import com.congueror.mechaddendums.init.EntityInit;
import com.congueror.mechaddendums.init.ItemInit;
import com.congueror.mechaddendums.init.TileEntityInit;
import com.congueror.mechaddendums.network.PacketHandler;
import com.congueror.mechaddendums.util.Strippables;
import com.congueror.mechaddendums.util.enums.SolarGenTier;
import com.congueror.mechaddendums.util.eventbus.ClientEventBusSub;
import com.congueror.mechaddendums.util.eventbus.EventBusSub;
import com.congueror.mechaddendums.util.eventbus.IEventBusSub;
import com.congueror.mechaddendums.world.gen.OreGen;
import com.congueror.mechaddendums.world.gen.OreGenFeatures;
import com.congueror.mechaddendums.world.gen.TreeGenFeatures;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mechaddendums")
@Mod.EventBusSubscriber(modid = "mechaddendums", bus = Mod.EventBusSubscriber.Bus.MOD)
public class MechAddendums
{
    public static final Logger LOGGER;
    public static final String MOD_ID = "mechaddendums";
    public static MechAddendums instance;
    
    public static IEventBusSub eventbussub = DistExecutor.safeRunForDist(() -> ClientEventBusSub::new, () -> EventBusSub::new);
    
    public MechAddendums() {
    	
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ClibConfig.spec);
        
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::doClientStuff);
        modEventBus.addListener(this::loadComplete);
        
        MechAddendums.instance = this;
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EffectInit.POTIONS.register(modEventBus);
        TileEntityInit.TILE_ENTITIES.register(modEventBus);
        ContainerInit.CONTAINERS.register(modEventBus);
        EntityInit.ENTITY_TYPES.register(modEventBus);
        
        ItemInit.init();
        BlockInit.init();
        ContainerInit.init();
        TileEntityInit.init();
                
        PacketHandler.init();
        
        MinecraftForge.EVENT_BUS.register(this);
        
        MinecraftForge.EVENT_BUS.register(TreeGenFeatures.class);
    }
    
    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event) {
    	//ModOreGen.addFeatures();
    	OreGenFeatures.initModFeatures();
        OreGen.setupOreGenerator();
    	
    	TreeGenFeatures.configs.RUBBER_TREE_CONFIG.forcePlacement = false;
    	TreeGenFeatures.configs.COCONUT_TREE_CONFIG.forcePlacement = true;
    }
    
    @SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) {
    	LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    	
    	RenderTypeLookup.setRenderLayer(BlockInit.RUBBER_SAPLING.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.PINEAPPLE_CROP.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.COCONUT_SAPLING.get(), RenderType.getCutout());
    
    	for(SolarGenTier tier : SolarGenTier.values()) {
            ScreenManager.registerFactory(ContainerInit.SOLAR_GENERATOR_CONTAINER.get(tier).get(), SolarGeneratorScreen::new);
    	}
    	
		RenderingRegistry.registerEntityRenderingHandler(EntityInit.WANDERING_FLORIST.get(), WanderingFloristRenderer::new);
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
}
