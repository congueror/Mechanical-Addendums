package com.congueror.mechaddendums.util.events;

import java.util.List;
import java.util.Set;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorScreen;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristRenderer;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ContainerInit;
import com.congueror.mechaddendums.init.EntityInit;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.block.Block;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(value = {Dist.CLIENT}, modid = MechAddendums.MOD_ID, bus = Bus.FORGE)
public class ClientEvents {
	
	@SubscribeEvent
	public void doClientStuff(final FMLClientSetupEvent event) {
    	RenderTypeLookup.setRenderLayer(BlockInit.RUBBER_SAPLING.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.PINEAPPLE_CROP.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.COCONUT_SAPLING.get(), RenderType.getCutout());
    
    	for(SolarGenTier tier : SolarGenTier.values()) {
            ScreenManager.registerFactory(ContainerInit.SOLAR_GENERATOR_CONTAINER.get(tier).get(), SolarGeneratorScreen::new);
    	}
    	
		RenderingRegistry.registerEntityRenderingHandler(EntityInit.WANDERING_FLORIST.get(), WanderingFloristRenderer::new);
    }
	
	@SubscribeEvent
	public void clientSetup(ItemTooltipEvent event) 
	{
		Item item = event.getItemStack().getItem();
	      Set<ResourceLocation> blockTags = Block.getBlockFromItem(item).getTags();
	      Set<ResourceLocation> itemTags = item.getTags();
	      if (!blockTags.isEmpty() || !itemTags.isEmpty()) {
	        List<ITextComponent> lines = event.getToolTip();
	        if (Screen.hasControlDown()) {
	          if (!blockTags.isEmpty()) {
	            lines.add(getTextComponent("info.mechaddendums.block_tags").mergeStyle(TextFormatting.GRAY));
	            blockTags.stream()
	              .map(Object::toString)
	              .map(s -> "  " + s)
	              .map(t -> getTextComponent(t).mergeStyle(TextFormatting.DARK_GRAY))
	              .forEach(lines::add);
	          } 
	          if (!itemTags.isEmpty()) {
	            lines.add(getTextComponent("info.mechaddendums.item_tags").mergeStyle(TextFormatting.GRAY));
	            itemTags.stream()
	              .map(Object::toString)
	              .map(s -> "  " + s)
	              .map(t -> getTextComponent(t).mergeStyle(TextFormatting.DARK_GRAY))
	              .forEach(lines::add);
	          } 
	        } else {
	          lines.add(getTextComponent("info.mechaddendums.hold_ctrl_for_tags").mergeStyle(TextFormatting.GRAY));
	        } 
	      } 
	}
	
	public static IFormattableTextComponent getTextComponent(String key) {
	    return canLocalize(key) ? (IFormattableTextComponent)new TranslationTextComponent(key) : (IFormattableTextComponent)new StringTextComponent(key);
	  }
	
	public static boolean canLocalize(String key) {
	    return I18n.hasKey(key);
	  }
}