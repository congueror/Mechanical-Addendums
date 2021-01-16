package com.congueror.mechaddendums.datagen;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelDataGen extends ItemModelProvider{

	public ItemModelDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, MechAddendums.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		//Aluminum
		singleTexture(ItemInit.ALUMINUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_ingot"));
		singleTexture(ItemInit.ALUMINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_nugget"));
		singleTexture(ItemInit.ALUMINUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_dust"));
		singleTexture(ItemInit.ALUMINUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_gear"));
		
		//Amethyst
		singleTexture(ItemInit.AMETHYST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst"));
		singleTexture(ItemInit.AMETHYST_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_dust"));
		singleTexture(ItemInit.AMETHYST_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_gear"));
		
		//Bronze
		singleTexture(ItemInit.BRONZE_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_blend"));
		singleTexture(ItemInit.BRONZE_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_ingot"));
		singleTexture(ItemInit.BRONZE_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_nugget"));
		singleTexture(ItemInit.BRONZE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_dust"));
		singleTexture(ItemInit.BRONZE_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_gear"));
		
		//Coal Nugget
		singleTexture(ItemInit.COAL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/coal_nugget"));
		
		//Copper
		singleTexture(ItemInit.COPPER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_ingot"));
		singleTexture(ItemInit.COPPER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_nugget"));
		singleTexture(ItemInit.COPPER_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_dust"));
		singleTexture(ItemInit.COPPER_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_gear"));
		
		//Electrum
		singleTexture(ItemInit.ELECTRUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_blend"));
		singleTexture(ItemInit.ELECTRUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_ingot"));
		singleTexture(ItemInit.ELECTRUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_nugget"));
		singleTexture(ItemInit.ELECTRUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_dust"));
		singleTexture(ItemInit.ELECTRUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_gear"));
		
		//Enderium
		singleTexture(ItemInit.ENDERIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_blend"));
		singleTexture(ItemInit.ENDERIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_ingot"));
		singleTexture(ItemInit.ENDERIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_nugget"));
		singleTexture(ItemInit.ENDERIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_dust"));
		singleTexture(ItemInit.ENDERIUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_gear"));
		
		//Invar
		singleTexture(ItemInit.INVAR_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_blend"));
		singleTexture(ItemInit.INVAR_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_ingot"));
		singleTexture(ItemInit.INVAR_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_nugget"));
		singleTexture(ItemInit.INVAR_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_dust"));
		singleTexture(ItemInit.INVAR_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_gear"));
		
		//Lead
		singleTexture(ItemInit.LEAD_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_ingot"));
		singleTexture(ItemInit.LEAD_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_nugget"));
		singleTexture(ItemInit.LEAD_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_dust"));
		singleTexture(ItemInit.LEAD_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_gear"));
		
		//Lumium
		singleTexture(ItemInit.LUMIUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lumium_blend"));
		singleTexture(ItemInit.LUMIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lumium_ingot"));
		singleTexture(ItemInit.LUMIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lumium_nugget"));
		singleTexture(ItemInit.LUMIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lumium_dust"));
		singleTexture(ItemInit.LUMIUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lumium_gear"));
		
		//Nickel
		singleTexture(ItemInit.NICKEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_ingot"));
		singleTexture(ItemInit.NICKEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_nugget"));
		singleTexture(ItemInit.NICKEL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_dust"));
		singleTexture(ItemInit.NICKEL_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_gear"));
		
		//Opal
		singleTexture(ItemInit.OPAL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/opal"));
		singleTexture(ItemInit.OPAL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/opal_dust"));
		singleTexture(ItemInit.OPAL_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/opal_gear"));
		
		//Platinum
		singleTexture(ItemInit.PLATINUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_ingot"));
		singleTexture(ItemInit.PLATINUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_nugget"));
		singleTexture(ItemInit.PLATINUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_dust"));
		singleTexture(ItemInit.PLATINUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_gear"));
		
		//Pyrotheum
		singleTexture(ItemInit.PYROTHEUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/pyrotheum_dust"));
		
		//Ruby
		singleTexture(ItemInit.RUBY.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby"));
		singleTexture(ItemInit.RUBY_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_dust"));
		singleTexture(ItemInit.RUBY_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_gear"));
		
		//Sapphire
		singleTexture(ItemInit.SAPPHIRE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire"));
		singleTexture(ItemInit.SAPPHIRE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_dust"));
		singleTexture(ItemInit.SAPPHIRE_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_gear"));
		
		//Signalum
		singleTexture(ItemInit.SIGNALUM_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/signalum_blend"));
		singleTexture(ItemInit.SIGNALUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/signalum_ingot"));
		singleTexture(ItemInit.SIGNALUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/signalum_nugget"));
		singleTexture(ItemInit.SIGNALUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/signalum_dust"));
		singleTexture(ItemInit.SIGNALUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/signalum_gear"));
		
		//Silver
		singleTexture(ItemInit.SILVER_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_ingot"));
		singleTexture(ItemInit.SILVER_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_nugget"));
		singleTexture(ItemInit.SILVER_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_dust"));
		singleTexture(ItemInit.SILVER_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_gear"));
		
		//Steel
		singleTexture(ItemInit.STEEL_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_blend"));
		singleTexture(ItemInit.STEEL_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_ingot"));
		singleTexture(ItemInit.STEEL_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_nugget"));
		singleTexture(ItemInit.STEEL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_dust"));
		singleTexture(ItemInit.STEEL_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_gear"));
		
		//Sulfur
		singleTexture(ItemInit.SULFUR_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sulfur_dust"));
		
		//Tin
		singleTexture(ItemInit.TIN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_ingot"));
		singleTexture(ItemInit.TIN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_nugget"));
		singleTexture(ItemInit.TIN_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_dust"));
		singleTexture(ItemInit.TIN_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_gear"));
		
				//Titanium
				singleTexture(ItemInit.TITANIUM_SCRAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_scrap"));
				singleTexture(ItemInit.TITANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_ingot"));
				singleTexture(ItemInit.TITANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_nugget"));
				singleTexture(ItemInit.TITANIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_dust"));
				singleTexture(ItemInit.TITANIUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_gear"));
		
				//Tungsten
				singleTexture(ItemInit.TUNGSTEN_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_ingot"));
				singleTexture(ItemInit.TUNGSTEN_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
						"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_nugget"));
				singleTexture(ItemInit.TUNGSTEN_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_dust"));
				singleTexture(ItemInit.TUNGSTEN_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_gear"));
		
				//Uranium
				singleTexture(ItemInit.URANIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/uranium_ingot"));
				singleTexture(ItemInit.URANIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/uranium_nugget"));
				singleTexture(ItemInit.URANIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/uranium_dust"));
				
				//Cobalt
				singleTexture(ItemInit.COBALT_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_ingot"));
				singleTexture(ItemInit.COBALT_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_nugget"));
				singleTexture(ItemInit.COBALT_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_dust"));
				singleTexture(ItemInit.COBALT_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_gear"));
				
				//Zinc
				singleTexture(ItemInit.ZINC_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_ingot"));
				singleTexture(ItemInit.ZINC_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_nugget"));
				singleTexture(ItemInit.ZINC_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_dust"));
				singleTexture(ItemInit.ZINC_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_gear"));
				
		//Saltpetre
				singleTexture(ItemInit.SALTPETRE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
		                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/saltpetre"));
				
		//Rubber
		singleTexture(ItemInit.RUBBER.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/rubber"));
		
		//Treetap
		singleTexture(ItemInit.TREE_TAP.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tree_tap"));
		
		//Hazmat
		singleTexture(ItemInit.HAZMAT_HELM.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/hazmat_helmet"));
		singleTexture(ItemInit.HAZMAT_CHEST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/hazmat_chestplate"));
		singleTexture(ItemInit.HAZMAT_LEGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/hazmat_leggings"));
		singleTexture(ItemInit.HAZMAT_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/hazmat_boots"));
		
		//Brass
		singleTexture(ItemInit.BRASS_BLEND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_blend"));
		singleTexture(ItemInit.BRASS_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_ingot"));
		singleTexture(ItemInit.BRASS_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_nugget"));
		singleTexture(ItemInit.BRASS_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_dust"));
		singleTexture(ItemInit.BRASS_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_gear"));
		
		//Chromium
		singleTexture(ItemInit.CHROMIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_ingot"));
		singleTexture(ItemInit.CHROMIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_nugget"));
		singleTexture(ItemInit.CHROMIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_dust"));
		singleTexture(ItemInit.CHROMIUM_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_gear"));
		
		//Thorium
		singleTexture(ItemInit.THORIUM_INGOT.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/thorium_ingot"));
		singleTexture(ItemInit.THORIUM_NUGGET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/thorium_nugget"));
		singleTexture(ItemInit.THORIUM_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/thorium_dust"));
		
		//Hammers
		singleTexture(ItemInit.IRON_HAMMER.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/iron_hammer"));
		singleTexture(ItemInit.DIAMOND_HAMMER.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/diamond_hammer"));
		singleTexture(ItemInit.NETHERITE_HAMMER.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/netherite_hammer"));
		
		//Vanilla Dusts
		singleTexture(ItemInit.COAL_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/coal_dust"));
		singleTexture(ItemInit.IRON_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/iron_dust"));
		singleTexture(ItemInit.GOLD_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/gold_dust"));
		singleTexture(ItemInit.LAPIS_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lapis_dust"));
		singleTexture(ItemInit.QUARTZ_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/quartz_dust"));
		singleTexture(ItemInit.DIAMOND_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/diamond_dust"));
		singleTexture(ItemInit.EMERALD_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/emerald_dust"));
		singleTexture(ItemInit.NETHERITE_DUST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/netherite_dust"));
		
		singleTexture(ItemInit.STONE_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/stone_gear"));
		singleTexture(ItemInit.IRON_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/iron_gear"));
		singleTexture(ItemInit.GOLD_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/gold_gear"));
		singleTexture(ItemInit.LAPIS_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lapis_gear"));
		singleTexture(ItemInit.QUARTZ_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/quartz_gear"));
		singleTexture(ItemInit.DIAMOND_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/diamond_gear"));
		singleTexture(ItemInit.EMERALD_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/emerald_gear"));
		singleTexture(ItemInit.NETHERITE_GEAR.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
				"layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/netherite_gear"));

		//Tin
		singleTexture(ItemInit.TIN_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_sword"));
		
		singleTexture(ItemInit.TIN_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_pickaxe"));
		
		singleTexture(ItemInit.TIN_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_axe"));
		
		singleTexture(ItemInit.TIN_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_shovel"));
		
		singleTexture(ItemInit.TIN_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_hoe"));
		
		singleTexture(ItemInit.TIN_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_helmet"));
		
		singleTexture(ItemInit.TIN_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_chestplate"));
		
		singleTexture(ItemInit.TIN_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_leggings"));
		
		singleTexture(ItemInit.TIN_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tin_boots"));
		
		//Aluminum
		singleTexture(ItemInit.ALUMINUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_sword"));
		
		singleTexture(ItemInit.ALUMINUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_pickaxe"));
		
		singleTexture(ItemInit.ALUMINUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_axe"));
		
		singleTexture(ItemInit.ALUMINUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_shovel"));
		
		singleTexture(ItemInit.ALUMINUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_hoe"));
		
		singleTexture(ItemInit.ALUMINUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_helmet"));
		
		singleTexture(ItemInit.ALUMINUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_chestplate"));
		
		singleTexture(ItemInit.ALUMINUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_leggings"));
		
		singleTexture(ItemInit.ALUMINUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/aluminum_boots"));
		
		//Steel
		singleTexture(ItemInit.STEEL_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_sword"));
		
		singleTexture(ItemInit.STEEL_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_pickaxe"));
		
		singleTexture(ItemInit.STEEL_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_axe"));
		
		singleTexture(ItemInit.STEEL_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_shovel"));
		
		singleTexture(ItemInit.STEEL_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_hoe"));
		
		singleTexture(ItemInit.STEEL_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_helmet"));
		
		singleTexture(ItemInit.STEEL_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_chestplate"));
		
		singleTexture(ItemInit.STEEL_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_leggings"));
		
		singleTexture(ItemInit.STEEL_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/steel_boots"));
		
		//Copper
		singleTexture(ItemInit.COPPER_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_sword"));
		
		singleTexture(ItemInit.COPPER_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_pickaxe"));
		
		singleTexture(ItemInit.COPPER_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_axe"));
		
		singleTexture(ItemInit.COPPER_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_shovel"));
		
		singleTexture(ItemInit.COPPER_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_hoe"));
		
		singleTexture(ItemInit.COPPER_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_helmet"));
		
		singleTexture(ItemInit.COPPER_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_chestplate"));
		
		singleTexture(ItemInit.COPPER_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_leggings"));
		
		singleTexture(ItemInit.COPPER_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/copper_boots"));
		
		//Lead
		singleTexture(ItemInit.LEAD_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_sword"));
		
		singleTexture(ItemInit.LEAD_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_pickaxe"));
		
		singleTexture(ItemInit.LEAD_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_axe"));
		
		singleTexture(ItemInit.LEAD_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_shovel"));
		
		singleTexture(ItemInit.LEAD_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_hoe"));
		
		singleTexture(ItemInit.LEAD_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_helmet"));
		
		singleTexture(ItemInit.LEAD_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_chestplate"));
		
		singleTexture(ItemInit.LEAD_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_leggings"));
		
		singleTexture(ItemInit.LEAD_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/lead_boots"));
		
		//Ruby
		singleTexture(ItemInit.RUBY_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_sword"));
		
		singleTexture(ItemInit.RUBY_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_pickaxe"));
		
		singleTexture(ItemInit.RUBY_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_axe"));
		
		singleTexture(ItemInit.RUBY_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_shovel"));
		
		singleTexture(ItemInit.RUBY_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_hoe"));
		
		singleTexture(ItemInit.RUBY_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_helmet"));
		
		singleTexture(ItemInit.RUBY_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_chestplate"));
		
		singleTexture(ItemInit.RUBY_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_leggings"));
		
		singleTexture(ItemInit.RUBY_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/ruby_boots"));
		
		//Silver
		singleTexture(ItemInit.SILVER_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_sword"));
		
		singleTexture(ItemInit.SILVER_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_pickaxe"));
		
		singleTexture(ItemInit.SILVER_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_axe"));
		
		singleTexture(ItemInit.SILVER_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_shovel"));
		
		singleTexture(ItemInit.SILVER_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_hoe"));
		
		singleTexture(ItemInit.SILVER_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_helmet"));
		
		singleTexture(ItemInit.SILVER_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_chestplate"));
		
		singleTexture(ItemInit.SILVER_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_leggings"));
		
		singleTexture(ItemInit.SILVER_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/silver_boots"));
		
		//Nickel
		singleTexture(ItemInit.NICKEL_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_sword"));
		
		singleTexture(ItemInit.NICKEL_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_pickaxe"));
		
		singleTexture(ItemInit.NICKEL_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_axe"));
		
		singleTexture(ItemInit.NICKEL_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_shovel"));
		
		singleTexture(ItemInit.NICKEL_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_hoe"));
		
		singleTexture(ItemInit.NICKEL_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_helmet"));
		
		singleTexture(ItemInit.NICKEL_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_chestplate"));
		
		singleTexture(ItemInit.NICKEL_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_leggings"));
		
		singleTexture(ItemInit.NICKEL_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/nickel_boots"));
		
		//Invar
		singleTexture(ItemInit.INVAR_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_sword"));
		
		singleTexture(ItemInit.INVAR_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_pickaxe"));
		
		singleTexture(ItemInit.INVAR_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_axe"));
		
		singleTexture(ItemInit.INVAR_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_shovel"));
		
		singleTexture(ItemInit.INVAR_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_hoe"));
		
		singleTexture(ItemInit.INVAR_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_helmet"));
		
		singleTexture(ItemInit.INVAR_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_chestplate"));
		
		singleTexture(ItemInit.INVAR_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_leggings"));
		
		singleTexture(ItemInit.INVAR_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/invar_boots"));
		
		//Electrum
		singleTexture(ItemInit.ELECTRUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_sword"));
		
		singleTexture(ItemInit.ELECTRUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_pickaxe"));
		
		singleTexture(ItemInit.ELECTRUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_axe"));
		
		singleTexture(ItemInit.ELECTRUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_shovel"));
		
		singleTexture(ItemInit.ELECTRUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_hoe"));
		
		singleTexture(ItemInit.ELECTRUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_helmet"));
		
		singleTexture(ItemInit.ELECTRUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_chestplate"));
		
		singleTexture(ItemInit.ELECTRUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_leggings"));
		
		singleTexture(ItemInit.ELECTRUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/electrum_boots"));
		
		//Platinum
		singleTexture(ItemInit.PLATINUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_sword"));
		
		singleTexture(ItemInit.PLATINUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_pickaxe"));
		
		singleTexture(ItemInit.PLATINUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_axe"));
		
		singleTexture(ItemInit.PLATINUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_shovel"));
		
		singleTexture(ItemInit.PLATINUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_hoe"));
		
		singleTexture(ItemInit.PLATINUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_helmet"));
		
		singleTexture(ItemInit.PLATINUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_chestplate"));
		
		singleTexture(ItemInit.PLATINUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_leggings"));
		
		singleTexture(ItemInit.PLATINUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/platinum_boots"));
		
		//Enderium
		singleTexture(ItemInit.ENDERIUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_sword"));
		
		singleTexture(ItemInit.ENDERIUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_pickaxe"));
		
		singleTexture(ItemInit.ENDERIUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_axe"));
		
		singleTexture(ItemInit.ENDERIUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_shovel"));
		
		singleTexture(ItemInit.ENDERIUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_hoe"));
		
		singleTexture(ItemInit.ENDERIUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_helmet"));
		
		singleTexture(ItemInit.ENDERIUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_chestplate"));
		
		singleTexture(ItemInit.ENDERIUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_leggings"));
		
		singleTexture(ItemInit.ENDERIUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/enderium_boots"));
		
		//Tungsten
		singleTexture(ItemInit.TUNGSTEN_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_sword"));
		
		singleTexture(ItemInit.TUNGSTEN_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_pickaxe"));
		
		singleTexture(ItemInit.TUNGSTEN_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_axe"));
		
		singleTexture(ItemInit.TUNGSTEN_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_shovel"));
		
		singleTexture(ItemInit.TUNGSTEN_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_hoe"));
		
		singleTexture(ItemInit.TUNGSTEN_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_helmet"));
		
		singleTexture(ItemInit.TUNGSTEN_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_chestplate"));
		
		singleTexture(ItemInit.TUNGSTEN_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_leggings"));
		
		singleTexture(ItemInit.TUNGSTEN_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/tungsten_boots"));
		
		//Bronze
		singleTexture(ItemInit.BRONZE_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_sword"));
		
		singleTexture(ItemInit.BRONZE_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_pickaxe"));
		
		singleTexture(ItemInit.BRONZE_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_axe"));
		
		singleTexture(ItemInit.BRONZE_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_shovel"));
		
		singleTexture(ItemInit.BRONZE_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_hoe"));
		
		singleTexture(ItemInit.BRONZE_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_helmet"));
		
		singleTexture(ItemInit.BRONZE_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_chestplate"));
		
		singleTexture(ItemInit.BRONZE_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_leggings"));
		
		singleTexture(ItemInit.BRONZE_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/bronze_boots"));
		
		//Amethyst
		singleTexture(ItemInit.AMETHYST_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_sword"));
		
		singleTexture(ItemInit.AMETHYST_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_pickaxe"));
		
		singleTexture(ItemInit.AMETHYST_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_axe"));
		
		singleTexture(ItemInit.AMETHYST_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_shovel"));
		
		singleTexture(ItemInit.AMETHYST_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_hoe"));
		
		singleTexture(ItemInit.AMETHYST_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_helmet"));
		
		singleTexture(ItemInit.AMETHYST_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_chestplate"));
		
		singleTexture(ItemInit.AMETHYST_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_leggings"));
		
		singleTexture(ItemInit.AMETHYST_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/amethyst_boots"));
		
		//Sapphire
		singleTexture(ItemInit.SAPPHIRE_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_sword"));
		
		singleTexture(ItemInit.SAPPHIRE_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_pickaxe"));
		
		singleTexture(ItemInit.SAPPHIRE_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_axe"));
		
		singleTexture(ItemInit.SAPPHIRE_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_shovel"));
		
		singleTexture(ItemInit.SAPPHIRE_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_hoe"));
		
		singleTexture(ItemInit.SAPPHIRE_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_helmet"));
		
		singleTexture(ItemInit.SAPPHIRE_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_chestplate"));
		
		singleTexture(ItemInit.SAPPHIRE_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_leggings"));
		
		singleTexture(ItemInit.SAPPHIRE_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/sapphire_boots"));
		
		//Titanium
		singleTexture(ItemInit.TITANIUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_sword"));
		
		singleTexture(ItemInit.TITANIUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_pickaxe"));
		
		singleTexture(ItemInit.TITANIUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_axe"));
		
		singleTexture(ItemInit.TITANIUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_shovel"));
		
		singleTexture(ItemInit.TITANIUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_hoe"));
		
		singleTexture(ItemInit.TITANIUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_helmet"));
		
		singleTexture(ItemInit.TITANIUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_chestplate"));
		
		singleTexture(ItemInit.TITANIUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_leggings"));
		
		singleTexture(ItemInit.TITANIUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/titanium_boots"));
		
		//Zinc
		singleTexture(ItemInit.ZINC_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_sword"));
		
		singleTexture(ItemInit.ZINC_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_pickaxe"));
		
		singleTexture(ItemInit.ZINC_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_axe"));
		
		singleTexture(ItemInit.ZINC_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_shovel"));
		
		singleTexture(ItemInit.ZINC_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_hoe"));
		
		singleTexture(ItemInit.ZINC_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_helmet"));
		
		singleTexture(ItemInit.ZINC_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_chestplate"));
		
		singleTexture(ItemInit.ZINC_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_leggings"));
		
		singleTexture(ItemInit.ZINC_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/zinc_boots"));
		
		//Cobalt
		singleTexture(ItemInit.COBALT_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_sword"));
		
		singleTexture(ItemInit.COBALT_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_pickaxe"));
		
		singleTexture(ItemInit.COBALT_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_axe"));
		
		singleTexture(ItemInit.COBALT_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_shovel"));
		
		singleTexture(ItemInit.COBALT_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_hoe"));
		
		singleTexture(ItemInit.COBALT_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_helmet"));
		
		singleTexture(ItemInit.COBALT_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_chestplate"));
		
		singleTexture(ItemInit.COBALT_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_leggings"));
		
		singleTexture(ItemInit.COBALT_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/cobalt_boots"));
		
		//Brass
		singleTexture(ItemInit.BRASS_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_sword"));
		
		singleTexture(ItemInit.BRASS_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_pickaxe"));
		
		singleTexture(ItemInit.BRASS_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_axe"));
		
		singleTexture(ItemInit.BRASS_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_shovel"));
		
		singleTexture(ItemInit.BRASS_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_hoe"));
		
		singleTexture(ItemInit.BRASS_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_helmet"));
		
		singleTexture(ItemInit.BRASS_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_chestplate"));
		
		singleTexture(ItemInit.BRASS_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_leggings"));
		
		singleTexture(ItemInit.BRASS_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/brass_boots"));
		
		//Chromium
		singleTexture(ItemInit.CHROMIUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_sword"));
		
		singleTexture(ItemInit.CHROMIUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_pickaxe"));
		
		singleTexture(ItemInit.CHROMIUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_axe"));
		
		singleTexture(ItemInit.CHROMIUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_shovel"));
		
		singleTexture(ItemInit.CHROMIUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_hoe"));
		
		singleTexture(ItemInit.CHROMIUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_helmet"));
		
		singleTexture(ItemInit.CHROMIUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_chestplate"));
		
		singleTexture(ItemInit.CHROMIUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_leggings"));
		
		singleTexture(ItemInit.CHROMIUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(MechAddendums.MOD_ID, "item/chromium_boots"));
	}

}
