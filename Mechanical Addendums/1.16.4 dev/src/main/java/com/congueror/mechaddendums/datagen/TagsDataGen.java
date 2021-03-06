package com.congueror.mechaddendums.datagen;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TagsDataGen {
	public static class ItemTagsDataGen extends ItemTagsProvider {

		public ItemTagsDataGen(DataGenerator generatorIn, BlockTagsProvider blockTagsProvider,
				ExistingFileHelper existingFileHelper) {
			super(generatorIn, blockTagsProvider, MechAddendums.MOD_ID, existingFileHelper);
		}

		@Override
		protected void registerTags() {
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_STONE);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_IRON);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_GOLD);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_LAPIS);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_DIAMOND);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_EMERALD);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_NETHERITE);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_AMETHYST);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_BRASS);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_BRONZE);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_CHROMIUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_COBALT);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_COPPER);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_INVAR);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_LEAD);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_NICKEL);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_OPAL);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_RUBY);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_SAPPHIRE);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_SILVER);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_STEEL);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_TIN);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.GEARS).addTag(ModTags.Items.GEARS_ZINC);
			
			getOrCreateBuilder(ModTags.Items.GEARS_STONE).add(ItemInit.STONE_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_IRON).add(ItemInit.IRON_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_GOLD).add(ItemInit.GOLD_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_LAPIS).add(ItemInit.LAPIS_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_QUARTZ).add(ItemInit.QUARTZ_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_DIAMOND).add(ItemInit.DIAMOND_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_EMERALD).add(ItemInit.EMERALD_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_NETHERITE).add(ItemInit.NETHERITE_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_ALUMINUM).add(ItemInit.ALUMINUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_AMETHYST).add(ItemInit.AMETHYST_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_BRASS).add(ItemInit.BRASS_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_BRONZE).add(ItemInit.BRONZE_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_CHROMIUM).add(ItemInit.CHROMIUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_COBALT).add(ItemInit.COBALT_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_COPPER).add(ItemInit.COPPER_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_ELECTRUM).add(ItemInit.ELECTRUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_ENDERIUM).add(ItemInit.ENDERIUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_INVAR).add(ItemInit.INVAR_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_LEAD).add(ItemInit.LEAD_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_LUMIUM).add(ItemInit.LUMIUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_NICKEL).add(ItemInit.NICKEL_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_OPAL).add(ItemInit.OPAL_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_PLATINUM).add(ItemInit.PLATINUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_RUBY).add(ItemInit.RUBY_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_SAPPHIRE).add(ItemInit.SAPPHIRE_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_SIGNALUM).add(ItemInit.SIGNALUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_SILVER).add(ItemInit.SILVER_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_STEEL).add(ItemInit.STEEL_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_TIN).add(ItemInit.TIN_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_TITANIUM).add(ItemInit.TITANIUM_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_TUNGSTEN).add(ItemInit.TUNGSTEN_GEAR.get());
			getOrCreateBuilder(ModTags.Items.GEARS_ZINC).add(ItemInit.ZINC_GEAR.get());
			
			getOrCreateBuilder(ModTags.Items.HAMMERS).add(ItemInit.IRON_HAMMER.get());
			getOrCreateBuilder(ModTags.Items.HAMMERS).add(ItemInit.DIAMOND_HAMMER.get());
			getOrCreateBuilder(ModTags.Items.HAMMERS).add(ItemInit.NETHERITE_HAMMER.get());
			getOrCreateBuilder(ModTags.Items.TIER_2_HAMMERS).add(ItemInit.DIAMOND_HAMMER.get());
			getOrCreateBuilder(ModTags.Items.TIER_2_HAMMERS).add(ItemInit.NETHERITE_HAMMER.get());
			getOrCreateBuilder(ModTags.Items.TIER_3_HAMMERS).add(ItemInit.NETHERITE_HAMMER.get());
			
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_PYROTHEUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SULFUR);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.BLAZE_POWDER);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SALTPETRE);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_COAL);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_IRON);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_GOLD);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_LAPIS);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SALTPETRE);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_DIAMOND);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_EMERALD);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_NETHERITE);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_AMETHYST);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_BRASS);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_BRONZE);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_CHROMIUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_COBALT);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_COPPER);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_INVAR);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_LEAD);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_NICKEL);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_OPAL);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_RUBY);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SAPPHIRE);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SILVER);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_STEEL);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_THORIUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_TIN);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_URANIUM);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_ZINC);
			getOrCreateBuilder(ModTags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SALT);
			
			getOrCreateBuilder(ModTags.Items.DUSTS_PYROTHEUM).add(ItemInit.PYROTHEUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_SULFUR).add(ItemInit.SULFUR_DUST.get());
			getOrCreateBuilder(ModTags.Items.BLAZE_POWDER).add(Items.BLAZE_POWDER);
			getOrCreateBuilder(ModTags.Items.DUSTS_SALTPETRE).add(ItemInit.SALTPETRE_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_COAL).add(ItemInit.COAL_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_IRON).add(ItemInit.IRON_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_GOLD).add(ItemInit.GOLD_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_LAPIS).add(ItemInit.LAPIS_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_QUARTZ).add(ItemInit.QUARTZ_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_DIAMOND).add(ItemInit.DIAMOND_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_EMERALD).add(ItemInit.EMERALD_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_NETHERITE).add(ItemInit.NETHERITE_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_ALUMINUM).add(ItemInit.ALUMINUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_AMETHYST).add(ItemInit.AMETHYST_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_BRASS).add(ItemInit.BRASS_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_BRONZE).add(ItemInit.BRONZE_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_CHROMIUM).add(ItemInit.CHROMIUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_COBALT).add(ItemInit.COBALT_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_COPPER).add(ItemInit.COPPER_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_ELECTRUM).add(ItemInit.ELECTRUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_ENDERIUM).add(ItemInit.ENDERIUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_INVAR).add(ItemInit.INVAR_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_LEAD).add(ItemInit.LEAD_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_LUMIUM).add(ItemInit.LUMIUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_NICKEL).add(ItemInit.NICKEL_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_OPAL).add(ItemInit.OPAL_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_PLATINUM).add(ItemInit.PLATINUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_RUBY).add(ItemInit.RUBY_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_SAPPHIRE).add(ItemInit.SAPPHIRE_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_SIGNALUM).add(ItemInit.SIGNALUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_SILVER).add(ItemInit.SILVER_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_STEEL).add(ItemInit.STEEL_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_THORIUM).add(ItemInit.THORIUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_TIN).add(ItemInit.TIN_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_TITANIUM).add(ItemInit.TITANIUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_TUNGSTEN).add(ItemInit.TUNGSTEN_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_URANIUM).add(ItemInit.URANIUM_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_ZINC).add(ItemInit.ZINC_DUST.get());
			getOrCreateBuilder(ModTags.Items.DUSTS_SALT).add(ItemInit.SALT.get());
			
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_AMETHYST);
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_OPAL);
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_RUBY);
			getOrCreateBuilder(ModTags.Items.GEMS).addTag(ModTags.Items.GEMS_SAPPHIRE);
			
			getOrCreateBuilder(ModTags.Items.GEMS_AMETHYST).add(ItemInit.AMETHYST.get());
			getOrCreateBuilder(ModTags.Items.GEMS_OPAL).add(ItemInit.OPAL.get());
			getOrCreateBuilder(ModTags.Items.GEMS_RUBY).add(ItemInit.RUBY.get());
			getOrCreateBuilder(ModTags.Items.GEMS_SAPPHIRE).add(ItemInit.SAPPHIRE.get());
			
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_BRONZE);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COPPER);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_INVAR);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_LEAD);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_NICKEL);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SILVER);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_STEEL);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TIN);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_URANIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COBALT);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_ZINC);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_BRASS);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_CHROMIUM);
			getOrCreateBuilder(ModTags.Items.INGOTS).addTag(ModTags.Items.INGOTS_THORIUM);
			
			getOrCreateBuilder(ModTags.Items.INGOTS_ALUMINUM).add(ItemInit.ALUMINUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_BRONZE).add(ItemInit.BRONZE_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_COPPER).add(ItemInit.COPPER_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_ELECTRUM).add(ItemInit.ELECTRUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_ENDERIUM).add(ItemInit.ENDERIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_INVAR).add(ItemInit.INVAR_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_LEAD).add(ItemInit.LEAD_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_LUMIUM).add(ItemInit.LUMIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_NICKEL).add(ItemInit.NICKEL_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_PLATINUM).add(ItemInit.PLATINUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_SIGNALUM).add(ItemInit.SIGNALUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_SILVER).add(ItemInit.SILVER_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_STEEL).add(ItemInit.STEEL_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_TIN).add(ItemInit.TIN_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_TITANIUM).add(ItemInit.TITANIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_TUNGSTEN).add(ItemInit.TUNGSTEN_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_URANIUM).add(ItemInit.URANIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_COBALT).add(ItemInit.COBALT_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_ZINC).add(ItemInit.ZINC_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_BRASS).add(ItemInit.BRASS_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_CHROMIUM).add(ItemInit.CHROMIUM_INGOT.get());
			getOrCreateBuilder(ModTags.Items.INGOTS_THORIUM).add(ItemInit.THORIUM_INGOT.get());
			
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_BRONZE);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_COPPER);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_INVAR);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_LEAD);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_NICKEL);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_SILVER);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_STEEL);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_TIN);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_COAL);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_URANIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_COBALT);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_ZINC);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_BRASS);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_CHROMIUM);
			getOrCreateBuilder(ModTags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_THORIUM);
			
			getOrCreateBuilder(ModTags.Items.NUGGETS_ALUMINUM).add(ItemInit.ALUMINUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_BRONZE).add(ItemInit.BRONZE_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_COPPER).add(ItemInit.COPPER_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_ELECTRUM).add(ItemInit.ELECTRUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_ENDERIUM).add(ItemInit.ENDERIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_INVAR).add(ItemInit.INVAR_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_LEAD).add(ItemInit.LEAD_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_LUMIUM).add(ItemInit.LUMIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_NICKEL).add(ItemInit.NICKEL_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_PLATINUM).add(ItemInit.PLATINUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_SIGNALUM).add(ItemInit.SIGNALUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_SILVER).add(ItemInit.SILVER_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_STEEL).add(ItemInit.STEEL_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_TIN).add(ItemInit.TIN_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_TITANIUM).add(ItemInit.TITANIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_TUNGSTEN).add(ItemInit.TUNGSTEN_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_COAL).add(ItemInit.COAL_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_URANIUM).add(ItemInit.URANIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_COBALT).add(ItemInit.COBALT_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_ZINC).add(ItemInit.ZINC_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_BRASS).add(ItemInit.BRASS_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_CHROMIUM).add(ItemInit.CHROMIUM_NUGGET.get());
			getOrCreateBuilder(ModTags.Items.NUGGETS_THORIUM).add(ItemInit.THORIUM_NUGGET.get());
			
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_AMETHYST);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_COPPER);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_LEAD);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_TIN);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_RUBY);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SILVER);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_NICKEL);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SULFUR);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_PLATINUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SAPPHIRE);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_OPAL);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_TITANIUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_URANIUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_COBALT);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_ZINC);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_SALTPETRE);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_CHROMIUM);
			getOrCreateBuilder(ModTags.Items.ORES).addTag(ModTags.Items.ORES_THORIUM);

			getOrCreateBuilder(ModTags.Items.ORES_ALUMINUM).add(BlockInit.ALUMINUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_AMETHYST).add(BlockInit.AMETHYST_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_COPPER).add(BlockInit.COPPER_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_LEAD).add(BlockInit.LEAD_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_TIN).add(BlockInit.TIN_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_RUBY).add(BlockInit.RUBY_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_NICKEL).add(BlockInit.NICKEL_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SILVER).add(BlockInit.SILVER_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SULFUR).add(BlockInit.SULFUR_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_PLATINUM).add(BlockInit.PLATINUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_TUNGSTEN).add(BlockInit.TUNGSTEN_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SAPPHIRE).add(BlockInit.SAPPHIRE_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_OPAL).add(BlockInit.OPAL_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_TITANIUM).add(BlockInit.TITANIUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_URANIUM).add(BlockInit.URANIUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_COBALT).add(BlockInit.COBALT_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_ZINC).add(BlockInit.ZINC_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_SALTPETRE).add(BlockInit.SALTPETRE_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_CHROMIUM).add(BlockInit.CHROMIUM_ORE.get().asItem());
			getOrCreateBuilder(ModTags.Items.ORES_THORIUM).add(BlockInit.THORIUM_ORE.get().asItem());
			
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ALUMINUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_AMETHYST);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_BRONZE);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_COPPER);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ELECTRUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ENDERIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_INVAR);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_LEAD);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_LUMIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_SIGNALUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_TIN);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_RUBY);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_SILVER);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_NICKEL);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_PLATINUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_SAPPHIRE);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_OPAL);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_TITANIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_STEEL);
			//getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_URANIUM);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_COBALT);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_ZINC);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_BRASS);
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS).addTag(ModTags.Items.STORAGE_BLOCKS_CHROMIUM);

			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ALUMINUM).add(BlockInit.ALUMINUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_AMETHYST).add(BlockInit.AMETHYST_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_BRONZE).add(BlockInit.BRONZE_BLOCK.get().asItem().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_COPPER).add(BlockInit.COPPER_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ELECTRUM).add(BlockInit.ELECTRUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ENDERIUM).add(BlockInit.ENDERIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_INVAR).add(BlockInit.INVAR_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_LEAD).add(BlockInit.LEAD_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_LUMIUM).add(BlockInit.LUMIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_SIGNALUM).add(BlockInit.SIGNALUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_TIN).add(BlockInit.TIN_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_RUBY).add(BlockInit.RUBY_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_NICKEL).add(BlockInit.NICKEL_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_SILVER).add(BlockInit.SILVER_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_PLATINUM).add(BlockInit.PLATINUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_TUNGSTEN).add(BlockInit.TUNGSTEN_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_SAPPHIRE).add(BlockInit.SAPPHIRE_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_OPAL).add(BlockInit.OPAL_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_TITANIUM).add(BlockInit.TITANIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_STEEL).add(BlockInit.STEEL_BLOCK.get().asItem());
			//getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_URANIUM).add(BlockInit.URANIUM_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_COBALT).add(BlockInit.COBALT_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_ZINC).add(BlockInit.ZINC_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_BRASS).add(BlockInit.BRASS_BLOCK.get().asItem());
			getOrCreateBuilder(ModTags.Items.STORAGE_BLOCKS_CHROMIUM).add(BlockInit.CHROMIUM_BLOCK.get().asItem());
			
			getOrCreateBuilder(ModTags.Items.RUBBER_LOGS).add(BlockInit.RUBBER_LOG.get().asItem());
			getOrCreateBuilder(ModTags.Items.RUBBER_LOGS).add(BlockInit.RUBBER_WOOD.get().asItem());
			getOrCreateBuilder(ModTags.Items.RUBBER_LOGS).add(BlockInit.RUBBER_STRIPPED_LOG.get().asItem());
			getOrCreateBuilder(ModTags.Items.RUBBER_LOGS).add(BlockInit.RUBBER_STRIPPED_WOOD.get().asItem());
			
			getOrCreateBuilder(ModTags.Items.FENCE_GATES_WOODEN).add(BlockInit.RUBBER_FENCE_GATE.get().asItem());
			
			getOrCreateBuilder(ModTags.Items.RUBBER).add(ItemInit.RUBBER.get());
			
			getOrCreateBuilder(ModTags.Items.FRUITS).addTag(ModTags.Items.FRUITS_PINEAPPLE);
			getOrCreateBuilder(ModTags.Items.FRUITS).addTag(ModTags.Items.FRUITS_CANDLENUT);
			getOrCreateBuilder(ModTags.Items.FRUITS_PINEAPPLE).add(ItemInit.PINEAPPLE.get());
			getOrCreateBuilder(ModTags.Items.FRUITS_CANDLENUT).add(ItemInit.CANDLENUT.get());
			
			getOrCreateBuilder(ModTags.Items.RUM).add(ItemInit.RUM.get());
			getOrCreateBuilder(ModTags.Items.COCONUT).add(ItemInit.COCONUT.get());
			getOrCreateBuilder(ModTags.Items.JUICER).add(ItemInit.JUICER.get());
			getOrCreateBuilder(ModTags.Items.COCONUT_MILK).add(ItemInit.COCONUT_MILK.get());
			getOrCreateBuilder(ModTags.Items.PINA_COLADA).add(ItemInit.PINA_COLADA.get());
			
			getOrCreateBuilder(ModTags.Items.JUICES).addTag(ModTags.Items.JUICES_PINEAPPLE);
			getOrCreateBuilder(ModTags.Items.JUICES_PINEAPPLE).add(ItemInit.PINEAPPLE_JUICE.get());
			
			getOrCreateBuilder(ModTags.Items.SEEDS).addTag(ModTags.Items.SEEDS_PINEAPPLE);
			getOrCreateBuilder(ModTags.Items.SEEDS_PINEAPPLE).add(ItemInit.PINEAPPLE_SEEDS.get());
			
			getOrCreateBuilder(ModTags.Items.SALT).add(ItemInit.SALT.get());
		}
	}

	public static class BlockTagsDataGen extends BlockTagsProvider {

		public BlockTagsDataGen(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
			super(generatorIn, MechAddendums.MOD_ID, existingFileHelper);
		}

		@Override
		protected void registerTags() {
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_ALUMINUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_AMETHYST);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COPPER);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_LEAD);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TIN);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_RUBY);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SILVER);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_NICKEL);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SULFUR);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_PLATINUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TUNGSTEN);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SAPPHIRE);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_OPAL);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TITANIUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_URANIUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COBALT);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_ZINC);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_SALTPETRE);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_CHROMIUM);
			getOrCreateBuilder(ModTags.Blocks.ORES).addTag(ModTags.Blocks.ORES_THORIUM);

			getOrCreateBuilder(ModTags.Blocks.ORES_ALUMINUM).add(BlockInit.ALUMINUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_AMETHYST).add(BlockInit.AMETHYST_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_COPPER).add(BlockInit.COPPER_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_LEAD).add(BlockInit.LEAD_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_TIN).add(BlockInit.TIN_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_RUBY).add(BlockInit.RUBY_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_NICKEL).add(BlockInit.NICKEL_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SILVER).add(BlockInit.SILVER_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SULFUR).add(BlockInit.SULFUR_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_PLATINUM).add(BlockInit.PLATINUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_TUNGSTEN).add(BlockInit.TUNGSTEN_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SAPPHIRE).add(BlockInit.SAPPHIRE_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_OPAL).add(BlockInit.OPAL_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_TITANIUM).add(BlockInit.TITANIUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_URANIUM).add(BlockInit.URANIUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_COBALT).add(BlockInit.COBALT_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_ZINC).add(BlockInit.ZINC_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_SALTPETRE).add(BlockInit.SALTPETRE_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_CHROMIUM).add(BlockInit.CHROMIUM_ORE.get());
			getOrCreateBuilder(ModTags.Blocks.ORES_THORIUM).add(BlockInit.THORIUM_ORE.get());
			
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ALUMINUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_BRONZE);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_COPPER);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ELECTRUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ENDERIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_INVAR);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_LEAD);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_LUMIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SIGNALUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TIN);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_RUBY);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SILVER);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_NICKEL);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_PLATINUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TUNGSTEN);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_OPAL);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_STEEL);
			//getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_URANIUM);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_COBALT);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_ZINC);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_BRASS);
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_CHROMIUM);

			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ALUMINUM).add(BlockInit.ALUMINUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_AMETHYST).add(BlockInit.AMETHYST_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_BRONZE).add(BlockInit.BRONZE_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_COPPER).add(BlockInit.COPPER_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ELECTRUM).add(BlockInit.ELECTRUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ENDERIUM).add(BlockInit.ENDERIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_INVAR).add(BlockInit.INVAR_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_LEAD).add(BlockInit.LEAD_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_LUMIUM).add(BlockInit.LUMIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_SIGNALUM).add(BlockInit.SIGNALUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TIN).add(BlockInit.TIN_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_RUBY).add(BlockInit.RUBY_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_NICKEL).add(BlockInit.NICKEL_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_SILVER).add(BlockInit.SILVER_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_PLATINUM).add(BlockInit.PLATINUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TUNGSTEN).add(BlockInit.TUNGSTEN_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(BlockInit.SAPPHIRE_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_OPAL).add(BlockInit.OPAL_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM).add(BlockInit.TITANIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_STEEL).add(BlockInit.STEEL_BLOCK.get());
			//getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_URANIUM).add(BlockInit.URANIUM_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_COBALT).add(BlockInit.COBALT_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_ZINC).add(BlockInit.ZINC_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_BRASS).add(BlockInit.BRASS_BLOCK.get());
			getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_CHROMIUM).add(BlockInit.CHROMIUM_BLOCK.get());
			
			getOrCreateBuilder(ModTags.Blocks.RUBBER_LOGS).add(BlockInit.RUBBER_LOG.get());
			getOrCreateBuilder(ModTags.Blocks.RUBBER_LOGS).add(BlockInit.RUBBER_WOOD.get());
			getOrCreateBuilder(ModTags.Blocks.RUBBER_LOGS).add(BlockInit.RUBBER_STRIPPED_LOG.get());
			getOrCreateBuilder(ModTags.Blocks.RUBBER_LOGS).add(BlockInit.RUBBER_STRIPPED_WOOD.get());
			
			getOrCreateBuilder(ModTags.Blocks.FENCE_GATES_WOODEN).add(BlockInit.RUBBER_FENCE_GATE.get());
		}
	}
}
