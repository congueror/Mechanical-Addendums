package com.congueror.mechaddendums.util.events;

import java.util.List;
import java.util.Set;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.furnacegen.FurnaceGeneratorScreen;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorScreen;
import com.congueror.mechaddendums.config.Config;
import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristRenderer;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ContainerInit;
import com.congueror.mechaddendums.init.EntityInit;
import com.congueror.mechaddendums.util.GuiCLibLoaded;
import com.congueror.mechaddendums.util.enums.FurnaceGenTier;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientEvents {
	
	@EventBusSubscriber(value = {Dist.CLIENT}, modid = MechAddendums.MOD_ID, bus = Bus.MOD)
	public static class ModClientEvents {
		@SubscribeEvent
		public static void doClientStuff(final FMLClientSetupEvent event) {
	    	RenderTypeLookup.setRenderLayer(BlockInit.RUBBER_SAPLING.get(), RenderType.getCutout());
	    	RenderTypeLookup.setRenderLayer(BlockInit.PINEAPPLE_CROP.get(), RenderType.getCutout());
	    	RenderTypeLookup.setRenderLayer(BlockInit.COCONUT_SAPLING.get(), RenderType.getCutout());
	    	RenderTypeLookup.setRenderLayer(BlockInit.CANDLENUT_SAPLING.get(), RenderType.getCutout());
	    
	    	for(SolarGenTier tier : SolarGenTier.values()) {
	            ScreenManager.registerFactory(ContainerInit.SOLAR_GENERATOR_CONTAINER.get(tier).get(), SolarGeneratorScreen::new);
	    	}
	    	for(FurnaceGenTier tier : FurnaceGenTier.values()) {
	    		ScreenManager.registerFactory(ContainerInit.FURNACE_GENERATOR_CONTAINER.get(tier).get(), FurnaceGeneratorScreen::new);
	    	}
	    	
			RenderingRegistry.registerEntityRenderingHandler(EntityInit.WANDERING_FLORIST.get(), WanderingFloristRenderer::new);
	    }
	}
	
	static boolean i = false;
	
	@EventBusSubscriber(value = {Dist.CLIENT}, modid = MechAddendums.MOD_ID, bus = Bus.FORGE)
	@SuppressWarnings("resource")
	public static class ForgeClientEvents implements IEventBusSub{
		@SubscribeEvent
		public static void clibScreen(GuiScreenEvent.DrawScreenEvent.Post event) {
			if(event.getGui() instanceof MainMenuScreen && !i && MechAddendums.isCLibLoaded() && Config.enableCLibScreen.get()) {
				Minecraft.getInstance().displayGuiScreen(new GuiCLibLoaded());
				i = true;
			}
		}
		
		@SubscribeEvent
		public static void tooltipSetup(ItemTooltipEvent event) 
		{
			if(event.getFlags().isAdvanced()) {
				Item item = event.getItemStack().getItem();
				CompoundNBT nbt = event.getItemStack().getTag();
				Set<ResourceLocation> blockTags = Block.getBlockFromItem(item).getTags();
				Set<ResourceLocation> itemTags = item.getTags();
				if (!blockTags.isEmpty() || !itemTags.isEmpty() || nbt != null)
				{
					List<ITextComponent> lines = event.getToolTip();
					if (Screen.hasControlDown()) 
					{
						if (!blockTags.isEmpty()) {
							lines.add(getTextComponent("tooltip.mechaddendums.block_tags").mergeStyle(TextFormatting.GRAY));
							blockTags.stream().map(Object::toString).map(a -> "  " + a).map(b -> getTextComponent(b).mergeStyle(TextFormatting.DARK_GRAY)).forEach(lines::add);
						} 
						if (!itemTags.isEmpty()) {
							lines.add(getTextComponent("tooltip.mechaddendums.item_tags").mergeStyle(TextFormatting.GRAY));
							itemTags.stream().map(Object::toString).map(a -> "  " + a).map(b -> getTextComponent(b).mergeStyle(TextFormatting.DARK_GRAY)).forEach(lines::add);
						}
						if(nbt != null) {//nbt.isEmpty() crashes game
							lines.add(getTextComponent("tooltip.mechaddendums.nbt_tags").mergeStyle(TextFormatting.GRAY));
							lines.add(new StringTextComponent("  ").appendString(nbt.toString()).mergeStyle(TextFormatting.DARK_GRAY));
						}
					} else {
						lines.add(new TranslationTextComponent("tooltip.mechaddendums.hold_ctrl_for_tags").mergeStyle(TextFormatting.GRAY));
					}
				}
			}
		}

		@Override
		public PlayerEntity getClientPlayer() {
			return  Minecraft.getInstance().player;
		}

		@Override
		public World getClientWorld() {
			return Minecraft.getInstance().world;
		}
		
	}
	
	public static IFormattableTextComponent getTextComponent(String key) {
	    return canLocalize(key) ? (IFormattableTextComponent)new TranslationTextComponent(key) : (IFormattableTextComponent)new StringTextComponent(key);
	}
	
	public static boolean canLocalize(String key) {
	    return I18n.hasKey(key);
	}
}
