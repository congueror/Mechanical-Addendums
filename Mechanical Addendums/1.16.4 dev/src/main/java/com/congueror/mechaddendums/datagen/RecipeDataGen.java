package com.congueror.mechaddendums.datagen;

import java.util.function.Consumer;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ItemInit;
import com.congueror.mechaddendums.util.enums.FurnaceGenTier;
import com.congueror.mechaddendums.util.enums.MachineFrameTier;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.block.Blocks;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SmithingRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class RecipeDataGen extends RecipeProvider
{
	public RecipeDataGen(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> recipe) 
	{
		//Aluminum
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ALUMINUM_BLOCK.get(), 1)
        .patternLine("aaa")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
	
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALUMINUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ALUMINUM_BLOCK.get())
		.addCriterion("aluminum_block", hasItem(BlockInit.ALUMINUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "aluminum_ingot_block"));
		
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALUMINUM_NUGGET.get(), 9)
		.addIngredient(ModTags.Items.INGOTS_ALUMINUM)
		.addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		.build(recipe);
			
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ALUMINUM_NUGGET.get())
		.addCriterion("aluminum_nugget", hasItem(ItemInit.ALUMINUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "aluminum_ingot_nuggets"));
		
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.ALUMINUM_ORE.get()), ItemInit.ALUMINUM_INGOT.get(), 0.7f, 400)
		.addCriterion("aluminum_ore", hasItem(BlockInit.ALUMINUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "aluminum_ingot_blasting"));
		
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.ALUMINUM_ORE.get()), ItemInit.ALUMINUM_INGOT.get(), 0.7f, 200)
		.addCriterion("aluminum_ore", hasItem(BlockInit.ALUMINUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "aluminum_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALUMINUM_DUST.get(), 1)
		.addIngredient(ModTags.Items.INGOTS_ALUMINUM)
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ALUMINUM_DUST.get()), ItemInit.ALUMINUM_INGOT.get(), 0.7f, 200)
		.addCriterion("aluminum_dust", hasItem(ItemInit.ALUMINUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "aluminum_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		
		
		
		//Amethyst
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.AMETHYST_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.AMETHYST.get())
		.addCriterion("amethyst", hasItem(ItemInit.AMETHYST.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.AMETHYST.get(), 9)
		.addIngredient(BlockInit.AMETHYST_BLOCK.get())
		.addCriterion("amethyst_block", hasItem(BlockInit.AMETHYST_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "amethyst_gem_block"));
	
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.AMETHYST_ORE.get()), ItemInit.AMETHYST.get(), 0.7f, 400)
		.addCriterion("amethyst_ore", hasItem(BlockInit.AMETHYST_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "amethyst_blasting"));
	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.AMETHYST_ORE.get()), ItemInit.AMETHYST.get(), 0.7f, 200)
		.addCriterion("amethyst_ore", hasItem(BlockInit.AMETHYST_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "amethyst_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.AMETHYST_DUST.get(), 1)
		.addIngredient(ItemInit.AMETHYST.get())
		.addIngredient(ModTags.Items.TIER_2_HAMMERS)
		.addCriterion("amethyst", hasItem(ItemInit.AMETHYST.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.AMETHYST_DUST.get()), ItemInit.AMETHYST.get(), 0.7f, 200)
		.addCriterion("amethyst_dust", hasItem(ItemInit.AMETHYST_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "amethyst_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.AMETHYST.get())
        .addCriterion("aluminum_ingot", hasItem(ItemInit.AMETHYST.get()))
        .build(recipe);
		
		
		
		//Bronze
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_BLEND.get(), 2)
		.patternLine("ct ")
		.patternLine("t  ")
		.patternLine("   ")
		.key('t', ModTags.Items.INGOTS_TIN)
		.key('c', ModTags.Items.INGOTS_COPPER)
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
		
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.BRONZE_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.BRONZE_INGOT.get())
		.addCriterion("bronze_ingot", hasItem(ItemInit.BRONZE_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRONZE_INGOT.get(), 9)
		.addIngredient(BlockInit.BRONZE_BLOCK.get())
		.addCriterion("bronze_block", hasItem(BlockInit.BRONZE_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "bronze_ingot_block"));
		
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRONZE_NUGGET.get(), 9)
		.addIngredient(ItemInit.BRONZE_INGOT.get())
		.addCriterion("bronze_ingot", hasItem(ItemInit.BRONZE_INGOT.get()))
		.build(recipe);
					
		//ingot_nuggets
        ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_INGOT.get(), 1)
        .patternLine("aaa")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ItemInit.BRONZE_NUGGET.get())
        .addCriterion("bronze_nugget", hasItem(ItemInit.BRONZE_NUGGET.get()))
        .build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "bronze_ingot_nuggets"));
			
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.BRONZE_BLEND.get()), ItemInit.BRONZE_INGOT.get(), 1.7f, 400)
		.addCriterion("bronze_blend", hasItem(ItemInit.BRONZE_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "bronze_ingot_blasting"));
			
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.BRONZE_BLEND.get()), ItemInit.BRONZE_INGOT.get(), 1.7f, 500)
		.addCriterion("bronze_blend", hasItem(ItemInit.BRONZE_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "bronze_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRONZE_DUST.get(), 1)
		.addIngredient(ItemInit.BRONZE_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("bronze_ingot", hasItem(ItemInit.BRONZE_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.BRONZE_DUST.get()), ItemInit.BRONZE_INGOT.get(), 0.7f, 200)
		.addCriterion("bronze_dust", hasItem(ItemInit.BRONZE_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "bronze_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.BRONZE_INGOT.get())
        .addCriterion("bronze_ingot", hasItem(ItemInit.BRONZE_INGOT.get()))
        .build(recipe);
		
		
		
		//Coal Nugget
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COAL_NUGGET.get(), 9)
		.addIngredient(Items.COAL)
		.addCriterion("coal", hasItem(Items.COAL))
		.build(recipe);
							
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(Items.COAL, 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COAL_NUGGET.get())
		.addCriterion("coal", hasItem(Items.COAL))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "coal_nuggets"));
		
		
		
		//Copper
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.COPPER_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COPPER_INGOT.get())
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
			
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COPPER_INGOT.get(), 9)
		.addIngredient(BlockInit.COPPER_BLOCK.get())
		.addCriterion("copper_block", hasItem(BlockInit.COPPER_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "copper_ingot_block"));
				
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COPPER_NUGGET.get(), 9)
		.addIngredient(ItemInit.COPPER_INGOT.get())
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
					
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COPPER_NUGGET.get())
		.addCriterion("copper_nugget", hasItem(ItemInit.COPPER_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "copper_ingot_nuggets"));
				
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.COPPER_ORE.get()), ItemInit.COPPER_INGOT.get(), 0.7f, 400)
		.addCriterion("copper_ore", hasItem(BlockInit.COPPER_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "copper_ingot_blasting"));
				
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.COPPER_ORE.get()), ItemInit.COPPER_INGOT.get(), 0.7f, 200)
		.addCriterion("copper_ore", hasItem(BlockInit.COPPER_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "copper_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COPPER_DUST.get(), 1)
		.addIngredient(ItemInit.COPPER_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.COPPER_DUST.get()), ItemInit.COPPER_INGOT.get(), 0.7f, 200)
		.addCriterion("copper_dust", hasItem(ItemInit.COPPER_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "copper_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.COPPER_INGOT.get())
        .addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
        .build(recipe);
		
		
		
		//Electrum
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_BLEND.get(), 2)
		.patternLine(" g ")
		.patternLine("s  ")
		.patternLine("   ")
		.key('g', Tags.Items.INGOTS_GOLD)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
				
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ELECTRUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ELECTRUM_INGOT.get())
		.addCriterion("electrum_ingot", hasItem(ItemInit.ELECTRUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ELECTRUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ELECTRUM_BLOCK.get())
		.addCriterion("electrum_block", hasItem(BlockInit.ELECTRUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "electrum_ingot_block"));
			
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ELECTRUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.ELECTRUM_INGOT.get())
		.addCriterion("electrum_ingot", hasItem(ItemInit.ELECTRUM_INGOT.get()))
		.build(recipe);
							
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ELECTRUM_NUGGET.get())
		.addCriterion("electrum_nugget", hasItem(ItemInit.ELECTRUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "electrum_ingot_nuggets"));
					
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.ELECTRUM_BLEND.get()), ItemInit.ELECTRUM_INGOT.get(), 1.7f, 400)
		.addCriterion("electrum_blend", hasItem(ItemInit.ELECTRUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "electrum_ingot_blasting"));
					
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ELECTRUM_BLEND.get()), ItemInit.ELECTRUM_INGOT.get(), 1.7f, 500)
		.addCriterion("electrum_blend", hasItem(ItemInit.ELECTRUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "electrum_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ELECTRUM_DUST.get(), 1)
		.addIngredient(ItemInit.ELECTRUM_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("electrum_ingot", hasItem(ItemInit.ELECTRUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ELECTRUM_DUST.get()), ItemInit.ELECTRUM_INGOT.get(), 0.7f, 200)
		.addCriterion("electrum_dust", hasItem(ItemInit.ELECTRUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "electrum_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.ELECTRUM_INGOT.get())
        .addCriterion("electrum_ingot", hasItem(ItemInit.ELECTRUM_INGOT.get()))
        .build(recipe);
		
		
		
		//Enderium
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_BLEND.get(), 1)
		.patternLine("tt ")
		.patternLine("ps ")
		.patternLine("   ")
		.key('t', ModTags.Items.INGOTS_TIN)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.key('p', ModTags.Items.INGOTS_PLATINUM)
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
						
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ENDERIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ENDERIUM_INGOT.get())
		.addCriterion("enderium_ingot", hasItem(ItemInit.ENDERIUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ENDERIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.ENDERIUM_BLOCK.get())
		.addCriterion("enderium_block", hasItem(BlockInit.ENDERIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "enderium_ingot_block"));
					
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ENDERIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.ENDERIUM_INGOT.get())
		.addCriterion("enderium_ingot", hasItem(ItemInit.ENDERIUM_INGOT.get()))
		.build(recipe);
									
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ENDERIUM_NUGGET.get())
		.addCriterion("enderium_nugget", hasItem(ItemInit.ENDERIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "enderium_ingot_nuggets"));
							
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.ENDERIUM_BLEND.get()), ItemInit.ENDERIUM_INGOT.get(), 1.7f, 400)
		.addCriterion("enderium_blend", hasItem(ItemInit.ENDERIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "enderium_ingot_blasting"));
							
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ENDERIUM_BLEND.get()), ItemInit.ENDERIUM_INGOT.get(), 1.7f, 500)
		.addCriterion("enderium_blend", hasItem(ItemInit.ENDERIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "enderium_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ENDERIUM_DUST.get(), 1)
		.addIngredient(ItemInit.ENDERIUM_INGOT.get())
		.addIngredient(ItemInit.NETHERITE_HAMMER.get())
		.addCriterion("enderium_ingot", hasItem(ItemInit.ENDERIUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ENDERIUM_DUST.get()), ItemInit.ENDERIUM_INGOT.get(), 0.7f, 200)
		.addCriterion("enderium_dust", hasItem(ItemInit.ENDERIUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "enderium_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.ENDERIUM_INGOT.get())
        .addCriterion("enderium_ingot", hasItem(ItemInit.ENDERIUM_INGOT.get()))
        .build(recipe);
		
		
		
		//Invar
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_BLEND.get(), 2)
		.patternLine("ni ")
		.patternLine("i  ")
		.patternLine("   ")
		.key('i', Tags.Items.INGOTS_IRON)
		.key('n', ModTags.Items.INGOTS_NICKEL)
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
								
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.INVAR_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.INVAR_INGOT.get())
		.addCriterion("invar_ingot", hasItem(ItemInit.INVAR_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.INVAR_INGOT.get(), 9)
		.addIngredient(BlockInit.INVAR_BLOCK.get())
		.addCriterion("invar_block", hasItem(BlockInit.INVAR_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "invar_ingot_block"));
							
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.INVAR_NUGGET.get(), 9)
		.addIngredient(ItemInit.INVAR_INGOT.get())
		.addCriterion("invar_ingot", hasItem(ItemInit.INVAR_INGOT.get()))
		.build(recipe);
											
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.INVAR_NUGGET.get())
		.addCriterion("invar_nugget", hasItem(ItemInit.INVAR_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "invar_ingot_nuggets"));
									
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.INVAR_BLEND.get()), ItemInit.INVAR_INGOT.get(), 1.7f, 400)
		.addCriterion("invar_blend", hasItem(ItemInit.INVAR_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "invar_ingot_blasting"));
									
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.INVAR_BLEND.get()), ItemInit.INVAR_INGOT.get(), 1.7f, 500)
		.addCriterion("invar_blend", hasItem(ItemInit.INVAR_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "invar_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.INVAR_DUST.get(), 1)
		.addIngredient(ItemInit.INVAR_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("invar_ingot", hasItem(ItemInit.INVAR_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.INVAR_DUST.get()), ItemInit.INVAR_INGOT.get(), 0.7f, 200)
		.addCriterion("invar_dust", hasItem(ItemInit.INVAR_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "invar_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.INVAR_INGOT.get())
        .addCriterion("invar_ingot", hasItem(ItemInit.INVAR_INGOT.get()))
        .build(recipe);
		
		
		
		//Lead
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.LEAD_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LEAD_INGOT.get())
		.addCriterion("lead_ingot", hasItem(ItemInit.LEAD_INGOT.get()))
		.build(recipe);
			
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LEAD_INGOT.get(), 9)
		.addIngredient(BlockInit.LEAD_BLOCK.get())
		.addCriterion("lead_block", hasItem(BlockInit.LEAD_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lead_ingot_block"));
				
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LEAD_NUGGET.get(), 9)
		.addIngredient(ItemInit.LEAD_INGOT.get())
		.addCriterion("lead_ingot", hasItem(ItemInit.LEAD_INGOT.get()))
		.build(recipe);
					
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LEAD_NUGGET.get())
		.addCriterion("lead_nugget", hasItem(ItemInit.LEAD_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lead_ingot_nuggets"));
				
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.LEAD_ORE.get()), ItemInit.LEAD_INGOT.get(), 0.7f, 400)
		.addCriterion("lead_ore", hasItem(BlockInit.LEAD_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lead_ingot_blasting"));
				
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.LEAD_ORE.get()), ItemInit.LEAD_INGOT.get(), 0.7f, 200)
		.addCriterion("lead_ore", hasItem(BlockInit.LEAD_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lead_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LEAD_DUST.get(), 1)
		.addIngredient(ItemInit.LEAD_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("lead_ingot", hasItem(ItemInit.LEAD_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.LEAD_DUST.get()), ItemInit.LEAD_INGOT.get(), 0.7f, 200)
		.addCriterion("lead_dust", hasItem(ItemInit.LEAD_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lead_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.LEAD_INGOT.get())
        .addCriterion("lead_ingot", hasItem(ItemInit.LEAD_INGOT.get()))
        .build(recipe);
		
		
		
		//Lumium
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LUMIUM_BLEND.get(), 2)
		.patternLine("st ")
		.patternLine("g  ")
		.patternLine("   ")
		.key('t', ModTags.Items.INGOTS_TIN)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.key('g', Tags.Items.DUSTS_GLOWSTONE)
		.addCriterion("glowstone_dust", hasItem(Items.GLOWSTONE_DUST))
		.build(recipe);
										
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.LUMIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LUMIUM_INGOT.get())
		.addCriterion("lumium_ingot", hasItem(ItemInit.LUMIUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LUMIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.LUMIUM_BLOCK.get())
		.addCriterion("lumium_block", hasItem(BlockInit.LUMIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lumium_ingot_block"));
									
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LUMIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.LUMIUM_INGOT.get())
		.addCriterion("lumium_ingot", hasItem(ItemInit.LUMIUM_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LUMIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.LUMIUM_NUGGET.get())
		.addCriterion("lumium_nugget", hasItem(ItemInit.LUMIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lumium_ingot_nuggets"));
											
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.LUMIUM_BLEND.get()), ItemInit.LUMIUM_INGOT.get(), 1.7f, 400)
		.addCriterion("lumium_blend", hasItem(ItemInit.LUMIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lumium_ingot_blasting"));
											
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.LUMIUM_BLEND.get()), ItemInit.LUMIUM_INGOT.get(), 1.7f, 500)
		.addCriterion("lumium_blend", hasItem(ItemInit.LUMIUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lumium_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LUMIUM_DUST.get(), 1)
		.addIngredient(ItemInit.LUMIUM_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("lumium_ingot", hasItem(ItemInit.LUMIUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.LUMIUM_DUST.get()), ItemInit.LUMIUM_INGOT.get(), 0.7f, 200)
		.addCriterion("lumium_dust", hasItem(ItemInit.LUMIUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lumium_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LUMIUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.LUMIUM_INGOT.get())
        .addCriterion("lumium_ingot", hasItem(ItemInit.LUMIUM_INGOT.get()))
        .build(recipe);
		
		
		//Nickel
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.NICKEL_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.NICKEL_INGOT.get())
		.addCriterion("nickel_ingot", hasItem(ItemInit.NICKEL_INGOT.get()))
		.build(recipe);
					
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.NICKEL_INGOT.get(), 9)
		.addIngredient(BlockInit.NICKEL_BLOCK.get())
		.addCriterion("nickel_block", hasItem(BlockInit.NICKEL_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "nickel_ingot_block"));
						
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.NICKEL_NUGGET.get(), 9)
		.addIngredient(ItemInit.NICKEL_INGOT.get())
		.addCriterion("nickel_ingot", hasItem(ItemInit.NICKEL_INGOT.get()))
		.build(recipe);
							
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.NICKEL_NUGGET.get())
		.addCriterion("nickel_nugget", hasItem(ItemInit.NICKEL_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "nickel_ingot_nuggets"));
						
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.NICKEL_ORE.get()), ItemInit.NICKEL_INGOT.get(), 0.7f, 400)
		.addCriterion("nickel_ore", hasItem(BlockInit.NICKEL_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "nickel_ingot_blasting"));
						
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.NICKEL_ORE.get()), ItemInit.NICKEL_INGOT.get(), 0.7f, 200)
		.addCriterion("nickel_ore", hasItem(BlockInit.NICKEL_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "nickel_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.NICKEL_DUST.get(), 1)
		.addIngredient(ItemInit.NICKEL_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("nickel_ingot", hasItem(ItemInit.NICKEL_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.NICKEL_DUST.get()), ItemInit.NICKEL_INGOT.get(), 0.7f, 200)
		.addCriterion("nickel_dust", hasItem(ItemInit.NICKEL_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "nickel_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.NICKEL_INGOT.get())
        .addCriterion("nickel_ingot", hasItem(ItemInit.NICKEL_INGOT.get()))
        .build(recipe);
		
		
		
		//Opal
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.OPAL_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.OPAL.get())
		.addCriterion("opal", hasItem(ItemInit.OPAL.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.OPAL.get(), 9)
		.addIngredient(BlockInit.OPAL_BLOCK.get())
		.addCriterion("opal_block", hasItem(BlockInit.OPAL_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "opal_gem_block"));
			
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.OPAL_ORE.get()), ItemInit.OPAL.get(), 0.7f, 400)
		.addCriterion("opal_ore", hasItem(BlockInit.OPAL_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "opal_blasting"));
			
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.OPAL_ORE.get()), ItemInit.OPAL.get(), 0.7f, 200)
		.addCriterion("opal_ore", hasItem(BlockInit.OPAL_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "opal_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.OPAL_DUST.get(), 1)
		.addIngredient(ItemInit.OPAL.get())
		.addIngredient(ModTags.Items.TIER_2_HAMMERS)
		.addCriterion("opal", hasItem(ItemInit.OPAL.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.OPAL_DUST.get()), ItemInit.OPAL.get(), 0.7f, 200)
		.addCriterion("opal_dust", hasItem(ItemInit.OPAL_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "opal_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.OPAL_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.OPAL.get())
        .addCriterion("opal", hasItem(ItemInit.OPAL.get()))
        .build(recipe);
		
		
		
		//Platinum
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.PLATINUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.PLATINUM_INGOT.get())
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
							
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PLATINUM_INGOT.get(), 9)
		.addIngredient(BlockInit.PLATINUM_BLOCK.get())
		.addCriterion("platinum_block", hasItem(BlockInit.PLATINUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "platinum_ingot_block"));
								
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PLATINUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.PLATINUM_INGOT.get())
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
									
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.PLATINUM_NUGGET.get())
		.addCriterion("platinum_nugget", hasItem(ItemInit.PLATINUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "platinum_ingot_nuggets"));
								
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.PLATINUM_ORE.get()), ItemInit.PLATINUM_INGOT.get(), 0.7f, 400)
		.addCriterion("platinum_ore", hasItem(BlockInit.PLATINUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "platinum_ingot_blasting"));
								
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.PLATINUM_ORE.get()), ItemInit.PLATINUM_INGOT.get(), 0.7f, 200)
		.addCriterion("platinum_ore", hasItem(BlockInit.PLATINUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "platinum_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PLATINUM_DUST.get(), 1)
		.addIngredient(ItemInit.PLATINUM_INGOT.get())
		.addIngredient(ModTags.Items.TIER_2_HAMMERS)
		.addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.PLATINUM_DUST.get()), ItemInit.PLATINUM_INGOT.get(), 0.7f, 200)
		.addCriterion("platinum_dust", hasItem(ItemInit.PLATINUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "platinum_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.PLATINUM_INGOT.get())
        .addCriterion("platinum_ingot", hasItem(ItemInit.PLATINUM_INGOT.get()))
        .build(recipe);
		
		
		
		//Pyrotheum
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PYROTHEUM_DUST.get(), 1)
		.patternLine("bb ")
		.patternLine("rs ")
		.patternLine("   ")
		.key('b', ModTags.Items.BLAZE_POWDER)
		.key('r', Tags.Items.DUSTS_REDSTONE)
		.key('s', ModTags.Items.DUSTS_SULFUR)
		.addCriterion("blaze_powder", hasItem(Items.BLAZE_POWDER))
		.build(recipe);
		
		
		
		//Ruby
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBY_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.RUBY.get())
		.addCriterion("ruby", hasItem(ItemInit.RUBY.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUBY.get(), 9)
		.addIngredient(BlockInit.RUBY_BLOCK.get())
		.addCriterion("ruby_block", hasItem(BlockInit.RUBY_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "ruby_gem_block"));
					
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.RUBY_ORE.get()), ItemInit.RUBY.get(), 0.7f, 400)
		.addCriterion("ruby_ore", hasItem(BlockInit.RUBY_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "ruby_blasting"));
					
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.RUBY_ORE.get()), ItemInit.RUBY.get(), 0.7f, 200)
		.addCriterion("ruby_ore", hasItem(BlockInit.RUBY_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "ruby_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUBY_DUST.get(), 1)
		.addIngredient(ItemInit.RUBY.get())
		.addIngredient(ModTags.Items.TIER_2_HAMMERS)
		.addCriterion("ruby", hasItem(ItemInit.RUBY.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.RUBY_DUST.get()), ItemInit.RUBY.get(), 0.7f, 200)
		.addCriterion("ruby_dust", hasItem(ItemInit.RUBY_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "ruby_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.RUBY.get())
        .addCriterion("tuby", hasItem(ItemInit.RUBY.get()))
        .build(recipe);
		
		
		
		//Sapphire
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.SAPPHIRE_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SAPPHIRE.get())
		.addCriterion("sapphire", hasItem(ItemInit.SAPPHIRE.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SAPPHIRE.get(), 9)
		.addIngredient(BlockInit.SAPPHIRE_BLOCK.get())
		.addCriterion("sapphire_block", hasItem(BlockInit.SAPPHIRE_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "sapphire_gem_block"));
							
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SAPPHIRE_ORE.get()), ItemInit.SAPPHIRE.get(), 0.7f, 400)
		.addCriterion("sapphire_ore", hasItem(BlockInit.SAPPHIRE_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "sapphire_blasting"));
							
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SAPPHIRE_ORE.get()), ItemInit.SAPPHIRE.get(), 0.7f, 200)
		.addCriterion("sapphire_ore", hasItem(BlockInit.SAPPHIRE_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "sapphire_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SAPPHIRE_DUST.get(), 1)
		.addIngredient(ItemInit.SAPPHIRE.get())
		.addIngredient(ModTags.Items.TIER_2_HAMMERS)
		.addCriterion("sapphire", hasItem(ItemInit.SAPPHIRE.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.SAPPHIRE_DUST.get()), ItemInit.SAPPHIRE.get(), 0.7f, 200)
		.addCriterion("sapphire_dust", hasItem(ItemInit.SAPPHIRE_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "sapphire_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.SAPPHIRE.get())
        .addCriterion("sapphire", hasItem(ItemInit.SAPPHIRE.get()))
        .build(recipe);
		
		
		
		//Signalum
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SIGNALUM_BLEND.get(), 2)
		.patternLine("csc")
		.patternLine("rcr")
		.patternLine("rrr")
		.key('c', ModTags.Items.INGOTS_COPPER)
		.key('s', ModTags.Items.INGOTS_SILVER)
		.key('r', Tags.Items.DUSTS_REDSTONE)
		.addCriterion("copper_ingot", hasItem(ItemInit.COPPER_INGOT.get()))
		.build(recipe);
										
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.SIGNALUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SIGNALUM_INGOT.get())
		.addCriterion("signalum_ingot", hasItem(ItemInit.SIGNALUM_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SIGNALUM_INGOT.get(), 9)
		.addIngredient(BlockInit.SIGNALUM_BLOCK.get())
		.addCriterion("signalum_block", hasItem(BlockInit.SIGNALUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "signalum_ingot_block"));
							
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SIGNALUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.SIGNALUM_INGOT.get())
		.addCriterion("signalum_ingot", hasItem(ItemInit.SIGNALUM_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SIGNALUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SIGNALUM_NUGGET.get())
		.addCriterion("signalum_nugget", hasItem(ItemInit.SIGNALUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "signalum_ingot_nuggets"));
											
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.SIGNALUM_BLEND.get()), ItemInit.SIGNALUM_INGOT.get(), 1.7f, 400)
		.addCriterion("signalum_blend", hasItem(ItemInit.SIGNALUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "signalum_ingot_blasting"));
											
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.SIGNALUM_BLEND.get()), ItemInit.SIGNALUM_INGOT.get(), 1.7f, 500)
		.addCriterion("signalum_blend", hasItem(ItemInit.SIGNALUM_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "signalum_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SIGNALUM_DUST.get(), 1)
		.addIngredient(ItemInit.SIGNALUM_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("signalum_ingot", hasItem(ItemInit.SIGNALUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.SIGNALUM_DUST.get()), ItemInit.SIGNALUM_INGOT.get(), 0.7f, 200)
		.addCriterion("signalum_dust", hasItem(ItemInit.SIGNALUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "signalum_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SIGNALUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.SIGNALUM_INGOT.get())
        .addCriterion("signalum_ingot", hasItem(ItemInit.SIGNALUM_INGOT.get()))
        .build(recipe);
		
		
		
		//Silver
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.SILVER_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SILVER_INGOT.get())
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
									
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SILVER_INGOT.get(), 9)
		.addIngredient(BlockInit.SILVER_BLOCK.get())
		.addCriterion("silver_block", hasItem(BlockInit.SILVER_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "silver_ingot_block"));
									
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SILVER_NUGGET.get(), 9)
		.addIngredient(ItemInit.SILVER_INGOT.get())
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
											
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.SILVER_NUGGET.get())
		.addCriterion("silver_nugget", hasItem(ItemInit.SILVER_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "silver_ingot_nuggets"));
										
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SILVER_ORE.get()), ItemInit.SILVER_INGOT.get(), 0.7f, 400)
		.addCriterion("silver_ore", hasItem(BlockInit.SILVER_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "silver_ingot_blasting"));
										
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SILVER_ORE.get()), ItemInit.SILVER_INGOT.get(), 0.7f, 200)
		.addCriterion("silver_ore", hasItem(BlockInit.SILVER_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "silver_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.SILVER_DUST.get(), 1)
		.addIngredient(ItemInit.SILVER_INGOT.get())
		.addIngredient(ModTags.Items.TIER_2_HAMMERS)
		.addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.SILVER_DUST.get()), ItemInit.SILVER_INGOT.get(), 0.7f, 200)
		.addCriterion("silver_dust", hasItem(ItemInit.SILVER_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "silver_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.SILVER_INGOT.get())
        .addCriterion("silver_ingot", hasItem(ItemInit.SILVER_INGOT.get()))
        .build(recipe);
		
		
		
		//Steel
		//blend
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_BLEND.get(), 2)
		.patternLine("ci ")
		.patternLine("i  ")
		.patternLine("   ")
		.key('i', Tags.Items.INGOTS_IRON)
		.key('c', Items.COAL)
		.addCriterion("iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
		.build(recipe);
												
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.STEEL_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.STEEL_INGOT.get())
		.addCriterion("steel_ingot", hasItem(ItemInit.STEEL_INGOT.get()))
		.build(recipe);

		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.STEEL_INGOT.get(), 9)
		.addIngredient(BlockInit.STEEL_BLOCK.get())
		.addCriterion("steel_block", hasItem(BlockInit.STEEL_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "steel_ingot_block"));
											
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.STEEL_NUGGET.get(), 9)
		.addIngredient(ItemInit.STEEL_INGOT.get())
		.addCriterion("steel_ingot", hasItem(ItemInit.STEEL_INGOT.get()))
		.build(recipe);
															
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.STEEL_NUGGET.get())
		.addCriterion("steel_nugget", hasItem(ItemInit.STEEL_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "steel_ingot_nuggets"));
													
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.STEEL_BLEND.get()), ItemInit.STEEL_INGOT.get(), 1.7f, 400)
		.addCriterion("steel_blend", hasItem(ItemInit.STEEL_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "steel_ingot_blasting"));
													
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.STEEL_BLEND.get()), ItemInit.STEEL_INGOT.get(), 1.7f, 500)
		.addCriterion("steel_blend", hasItem(ItemInit.STEEL_BLEND.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "steel_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.STEEL_DUST.get(), 1)
		.addIngredient(ItemInit.STEEL_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("steel_ingot", hasItem(ItemInit.STEEL_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.STEEL_DUST.get()), ItemInit.STEEL_INGOT.get(), 0.7f, 200)
		.addCriterion("steel_dust", hasItem(ItemInit.STEEL_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "steel_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.STEEL_INGOT.get())
        .addCriterion("steel_ingot", hasItem(ItemInit.STEEL_INGOT.get()))
        .build(recipe);
		
		
		
		//Sulfur
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SULFUR_ORE.get()), ItemInit.SULFUR_DUST.get(), 0.7f, 400)
		.addCriterion("sulfur_ore", hasItem(BlockInit.SULFUR_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "sulfur_dust_blasting"));
															
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SULFUR_ORE.get()), ItemInit.SULFUR_DUST.get(), 0.7f, 200)
		.addCriterion("sulfur_ore", hasItem(BlockInit.SULFUR_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "sulfur_dust_smelting"));
		
		
		
		//Tin
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.TIN_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TIN_INGOT.get())
		.addCriterion("tin_ingot", hasItem(ItemInit.TIN_INGOT.get()))
		.build(recipe);
									
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TIN_INGOT.get(), 9)
		.addIngredient(BlockInit.TIN_BLOCK.get())
		.addCriterion("tin_block", hasItem(BlockInit.TIN_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tin_ingot_block"));
										
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TIN_NUGGET.get(), 9)
		.addIngredient(ItemInit.TIN_INGOT.get())
		.addCriterion("tin_ingot", hasItem(ItemInit.TIN_INGOT.get()))
		.build(recipe);
											
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TIN_NUGGET.get())
		.addCriterion("tin_nugget", hasItem(ItemInit.TIN_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tin_ingot_nuggets"));
										
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.TIN_ORE.get()), ItemInit.TIN_INGOT.get(), 0.7f, 400)
		.addCriterion("tin_ore", hasItem(BlockInit.TIN_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tin_ingot_blasting"));
										
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.TIN_ORE.get()), ItemInit.TIN_INGOT.get(), 0.7f, 200)
		.addCriterion("tin_ore", hasItem(BlockInit.TIN_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tin_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TIN_DUST.get(), 1)
		.addIngredient(ItemInit.TIN_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("tin_ingot", hasItem(ItemInit.TIN_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.TIN_DUST.get()), ItemInit.TIN_INGOT.get(), 0.7f, 200)
		.addCriterion("tin_dust", hasItem(ItemInit.TIN_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tin_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.TIN_INGOT.get())
        .addCriterion("tin_ingot", hasItem(ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		
		
		//Titanium
		//ingot
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TITANIUM_SCRAP.get())
		.addCriterion("titanium_scrap", hasItem(ItemInit.TITANIUM_SCRAP.get()))
		.build(recipe);
				
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.TITANIUM_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TITANIUM_INGOT.get())
		.addCriterion("titanium_ingot", hasItem(ItemInit.TITANIUM_INGOT.get()))
		.build(recipe);
											
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TITANIUM_INGOT.get(), 9)
		.addIngredient(BlockInit.TITANIUM_BLOCK.get())
		.addCriterion("titanium_block", hasItem(BlockInit.TITANIUM_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "titanium_ingot_block"));
												
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TITANIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.TITANIUM_INGOT.get())
		.addCriterion("titanium_ingot", hasItem(ItemInit.TITANIUM_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TITANIUM_NUGGET.get())
		.addCriterion("titanium_nugget", hasItem(ItemInit.TITANIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "titanium_ingot_nuggets"));
												
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.TITANIUM_ORE.get()), ItemInit.TITANIUM_SCRAP.get(), 6.9f, 800)
		.addCriterion("titanium_ore", hasItem(BlockInit.TITANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "titanium_ingot_blasting"));
												
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.TITANIUM_ORE.get()), ItemInit.TITANIUM_SCRAP.get(), 6.9f, 700)
		.addCriterion("titanium_ore", hasItem(BlockInit.TITANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "titanium_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TITANIUM_DUST.get(), 1)
		.addIngredient(ItemInit.TITANIUM_INGOT.get())
		.addIngredient(ItemInit.NETHERITE_HAMMER.get())
		.addCriterion("titanium_ingot", hasItem(ItemInit.TITANIUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.TITANIUM_DUST.get()), ItemInit.TITANIUM_INGOT.get(), 0.7f, 200)
		.addCriterion("titanium_dust", hasItem(ItemInit.TITANIUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "titanium_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.TITANIUM_INGOT.get())
        .addCriterion("titanium_ingot", hasItem(ItemInit.TITANIUM_INGOT.get()))
        .build(recipe);
		
		
		
		//Tungsten
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.TUNGSTEN_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TUNGSTEN_INGOT.get())
		.addCriterion("tungsten_ingot", hasItem(ItemInit.TUNGSTEN_INGOT.get()))
		.build(recipe);
											
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TUNGSTEN_INGOT.get(), 9)
		.addIngredient(BlockInit.TUNGSTEN_BLOCK.get())
		.addCriterion("tungsten_block", hasItem(BlockInit.TUNGSTEN_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tungsten_ingot_block"));
												
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TUNGSTEN_NUGGET.get(), 9)
		.addIngredient(ItemInit.TUNGSTEN_INGOT.get())
		.addCriterion("tungsten_ingot", hasItem(ItemInit.TUNGSTEN_INGOT.get()))
		.build(recipe);
													
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.TUNGSTEN_NUGGET.get())
		.addCriterion("tungsten_nugget", hasItem(ItemInit.TUNGSTEN_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tungsten_ingot_nuggets"));
												
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.TUNGSTEN_ORE.get()), ItemInit.TUNGSTEN_INGOT.get(), 0.7f, 400)
		.addCriterion("tungsten_ore", hasItem(BlockInit.TUNGSTEN_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tungsten_ingot_blasting"));
												
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.TUNGSTEN_ORE.get()), ItemInit.TUNGSTEN_INGOT.get(), 0.7f, 200)
		.addCriterion("tungsten_ore", hasItem(BlockInit.TUNGSTEN_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tungsten_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TUNGSTEN_DUST.get(), 1)
		.addIngredient(ItemInit.TUNGSTEN_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("tungsten_ingot", hasItem(ItemInit.TUNGSTEN_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.TUNGSTEN_DUST.get()), ItemInit.TUNGSTEN_INGOT.get(), 0.7f, 200)
		.addCriterion("tungsten_dust", hasItem(ItemInit.TUNGSTEN_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "tungsten_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.TUNGSTEN_INGOT.get())
        .addCriterion("tungsten_ingot", hasItem(ItemInit.TUNGSTEN_INGOT.get()))
        .build(recipe);
		
		
		
		//Uranium
		//block
//		ShapedRecipeBuilder.shapedRecipe(BlockInit.URANIUM_BLOCK.get(), 1)
//		.patternLine("aaa")
//		.patternLine("aaa")
//		.patternLine("aaa")
//		.key('a', ItemInit.URANIUM_INGOT.get())
//		.addCriterion("uranium_ingot", hasItem(ItemInit.URANIUM_INGOT.get()))
//		.build(recipe);
		
		//ingot_block
//		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.URANIUM_INGOT.get(), 9)
//		.addIngredient(BlockInit.URANIUM_BLOCK.get())
//		.addCriterion("uranium_block", hasItem(BlockInit.URANIUM_BLOCK.get()))
//		.build(recipe, new ResourceLocation(CLib.MOD_ID, "uranium_ingot_block"));
		
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.URANIUM_NUGGET.get(), 9)
		.addIngredient(ItemInit.URANIUM_INGOT.get())
		.addCriterion("uranium_ingot", hasItem(ItemInit.URANIUM_INGOT.get()))
		.build(recipe);
		
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.URANIUM_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.URANIUM_NUGGET.get())
		.addCriterion("uranium_nugget", hasItem(ItemInit.URANIUM_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "uranium_ingot_nuggets"));
		
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.URANIUM_ORE.get()), ItemInit.URANIUM_INGOT.get(), 0.7f, 400)
		.addCriterion("uranium_ore", hasItem(BlockInit.URANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "uranium_ingot_blasting"));
		
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.URANIUM_ORE.get()), ItemInit.URANIUM_INGOT.get(), 0.7f, 200)
		.addCriterion("uranium_ore", hasItem(BlockInit.URANIUM_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "uranium_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.URANIUM_DUST.get(), 1)
		.addIngredient(ItemInit.URANIUM_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("aluminum_ingot", hasItem(ItemInit.URANIUM_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.URANIUM_DUST.get()), ItemInit.URANIUM_INGOT.get(), 0.7f, 200)
		.addCriterion("uranium_dust", hasItem(ItemInit.URANIUM_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "uranium_dust_smelting"));
		
		
		
		//Cobalt
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.COBALT_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COBALT_INGOT.get())
		.addCriterion("cobalt_ingot", hasItem(ItemInit.COBALT_INGOT.get()))
		.build(recipe);		
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COBALT_INGOT.get(), 9)
		.addIngredient(BlockInit.COBALT_BLOCK.get())
		.addCriterion("cobalt_block", hasItem(BlockInit.COBALT_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "cobalt_ingot_block"));
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COBALT_NUGGET.get(), 9)
		.addIngredient(ItemInit.COBALT_INGOT.get())
		.addCriterion("cobalt_ingot", hasItem(ItemInit.COBALT_INGOT.get()))
		.build(recipe);
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.COBALT_NUGGET.get())
		.addCriterion("cobalt_nugget", hasItem(ItemInit.COBALT_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "cobalt_ingot_nuggets"));
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.COBALT_ORE.get()), ItemInit.COBALT_INGOT.get(), 0.7f, 400)
		.addCriterion("cobalt_ore", hasItem(BlockInit.COBALT_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "cobalt_ingot_blasting"));	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.COBALT_ORE.get()), ItemInit.COBALT_INGOT.get(), 0.7f, 200)
		.addCriterion("cobalt_ore", hasItem(BlockInit.COBALT_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "cobalt_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COBALT_DUST.get(), 1)
		.addIngredient(ItemInit.COBALT_INGOT.get())
		.addIngredient(ItemInit.NETHERITE_HAMMER.get())
		.addCriterion("cobalt_ingot", hasItem(ItemInit.COBALT_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.COBALT_DUST.get()), ItemInit.COBALT_INGOT.get(), 0.7f, 200)
		.addCriterion("cobalt_dust", hasItem(ItemInit.COBALT_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "cobalt_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.COBALT_INGOT.get())
        .addCriterion("cobalt_ingot", hasItem(ItemInit.COBALT_INGOT.get()))
        .build(recipe);
		
		
		
		//Zinc
		//block
		ShapedRecipeBuilder.shapedRecipe(BlockInit.ZINC_BLOCK.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ZINC_INGOT.get())
		.addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
		.build(recipe);		
		//ingot_block
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ZINC_INGOT.get(), 9)
		.addIngredient(BlockInit.ZINC_BLOCK.get())
		.addCriterion("zinc_block", hasItem(BlockInit.ZINC_BLOCK.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "zinc_ingot_block"));
		//nugget
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ZINC_NUGGET.get(), 9)
		.addIngredient(ItemInit.ZINC_INGOT.get())
		.addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
		.build(recipe);
		//ingot_nuggets
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_INGOT.get(), 1)
		.patternLine("aaa")
		.patternLine("aaa")
		.patternLine("aaa")
		.key('a', ItemInit.ZINC_NUGGET.get())
		.addCriterion("zinc_nugget", hasItem(ItemInit.ZINC_NUGGET.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "zinc_ingot_nuggets"));
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.ZINC_ORE.get()), ItemInit.ZINC_INGOT.get(), 0.7f, 400)
		.addCriterion("zinc_ore", hasItem(BlockInit.ZINC_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "zinc_ingot_blasting"));	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.ZINC_ORE.get()), ItemInit.ZINC_INGOT.get(), 0.7f, 200)
		.addCriterion("zinc_ore", hasItem(BlockInit.ZINC_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "zinc_ingot_smelting"));
		
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ZINC_DUST.get(), 1)
		.addIngredient(ItemInit.ZINC_INGOT.get())
		.addIngredient(ModTags.Items.HAMMERS)
		.addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
		.build(recipe);
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.ZINC_DUST.get()), ItemInit.ZINC_INGOT.get(), 0.7f, 200)
		.addCriterion("aluminum_dust", hasItem(ItemInit.ZINC_DUST.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "zinc_dust_smelting"));
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_GEAR.get(), 1)
        .patternLine(" a ")
        .patternLine("a a")
        .patternLine(" a ")
        .key('a', ItemInit.ZINC_INGOT.get())
        .addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
        .build(recipe);
		
		
		
		//Saltpetre
		//ingot_blasting
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.SALTPETRE_ORE.get()), ItemInit.SALTPETRE_DUST.get(), 0.7f, 400)
		.addCriterion("saltpetre_ore", hasItem(BlockInit.SALTPETRE_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "saltpetre_dust_blasting"));
																	
		//ingot_smelting
		CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.SALTPETRE_ORE.get()), ItemInit.SALTPETRE_DUST.get(), 0.7f, 200)
		.addCriterion("saltpetre_ore", hasItem(BlockInit.SALTPETRE_ORE.get()))
		.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "saltpetre_dust_smelting"));
				
		//gunpowder
		ShapelessRecipeBuilder.shapelessRecipe(Items.GUNPOWDER, 4)
		.addIngredient(ModTags.Items.DUSTS_COAL)
		.addIngredient(ModTags.Items.DUSTS_COAL)
		.addIngredient(ModTags.Items.DUSTS_SULFUR)
		.addIngredient(ModTags.Items.DUSTS_SALTPETRE)
		.addCriterion("saltpetre_dust", hasItem(ItemInit.SALTPETRE_DUST.get()))
		.build(recipe);
				
		//Rubber
		//rubber_planks
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.RUBBER_PLANKS.get(), 4)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addCriterion("rubber_log", hasItem(ModTags.Items.RUBBER_LOGS))
		.build(recipe);
		
		//rubber_wood
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_WOOD.get(), 3)
		.patternLine("aa ")
		.patternLine("aa ")
		.patternLine("   ")
		.key('a', BlockInit.RUBBER_LOG.get())
		.addCriterion("rubber_log", hasItem(BlockInit.RUBBER_LOG.get()))
		.build(recipe);
		
		//stripped_rubber_wood
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_STRIPPED_WOOD.get(), 3)
		.patternLine("aa ")
		.patternLine("aa ")
		.patternLine("   ")
		.key('a', BlockInit.RUBBER_STRIPPED_LOG.get())
		.addCriterion("stripped_rubber_log", hasItem(BlockInit.RUBBER_STRIPPED_LOG.get()))
		.build(recipe);
		
		//rubber_stairs
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_STAIRS.get(), 4)
		.patternLine("a  ")
		.patternLine("aa ")
		.patternLine("aaa")
		.key('a', BlockInit.RUBBER_PLANKS.get())
		.addCriterion("rubber_planks", hasItem(BlockInit.RUBBER_PLANKS.get()))
		.build(recipe);
		
		//rubber_slab
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_SLAB.get(), 6)
		.patternLine("   ")
		.patternLine("   ")
		.patternLine("aaa")
		.key('a', BlockInit.RUBBER_PLANKS.get())
		.addCriterion("rubber_planks", hasItem(BlockInit.RUBBER_PLANKS.get()))
		.build(recipe);
		
		//rubber_fence_gate
		ShapedRecipeBuilder.shapedRecipe(BlockInit.RUBBER_FENCE_GATE.get(), 1)
		.patternLine("sas")
		.patternLine("sas")
		.patternLine("   ")
		.key('a', BlockInit.RUBBER_PLANKS.get())
		.key('s', Items.STICK)
		.addCriterion("rubber_planks", hasItem(BlockInit.RUBBER_PLANKS.get()))
		.build(recipe);
		
		//rubber_button
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUBBER_BUTTON.get(), 1)
		.addIngredient(BlockInit.RUBBER_PLANKS.get())
		.addCriterion("rubber_planks", hasItem(BlockInit.RUBBER_PLANKS.get()))
		.build(recipe);
		
		//rubber_sapling
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.RUBBER_SAPLING.get(), 1)
		.addIngredient(ItemTags.SAPLINGS)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addIngredient(ModTags.Items.RUBBER)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		//rubber
		ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUBBER.get(), 1)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addIngredient(ModTags.Items.RUBBER_LOGS)
		.addIngredient(ItemInit.TREE_TAP.get())
		.addCriterion("rubber_log", hasItem(ModTags.Items.RUBBER_LOGS))
		.build(recipe);
		
		//treetap
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TREE_TAP.get(), 1)
		.patternLine(" a ")
		.patternLine("aaa")
		.patternLine("a  ")
		.key('a', ItemTags.PLANKS)
		.addCriterion("planks", hasItem(ItemTags.PLANKS))
		.build(recipe);
		
		//Hazmat Suit
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_CHEST.get(), 1)
		.patternLine("a a")
		.patternLine("aoa")
		.patternLine("aoa")
		.key('a', ModTags.Items.RUBBER)
		.key('o', Tags.Items.DYES_YELLOW)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_LEGS.get(), 1)
		.patternLine("aoa")
		.patternLine("a a")
		.patternLine("a a")
		.key('a', ModTags.Items.RUBBER)
		.key('o', Tags.Items.DYES_YELLOW)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_HELM.get(), 1)
		.patternLine(" o ")
		.patternLine("aga")
		.patternLine("aba")
		.key('a', ModTags.Items.RUBBER)
		.key('o', Tags.Items.DYES_YELLOW)
		.key('g', Tags.Items.GLASS)
		.key('b', Blocks.IRON_BARS)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.HAZMAT_BOOTS.get(), 1)
		.patternLine("a a")
		.patternLine("a a")
		.patternLine("awa")
		.key('a', ModTags.Items.RUBBER)
		.key('w', ItemTags.WOOL)
		.addCriterion("rubber", hasItem(ModTags.Items.RUBBER))
		.build(recipe);
		
		//Brass
				//blend
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_BLEND.get(), 4)
				.patternLine("cc ")
				.patternLine("cz ")
				.patternLine("   ")
				.key('z', ModTags.Items.INGOTS_ZINC)
				.key('c', ModTags.Items.INGOTS_COPPER)
				.addCriterion("zinc_ingot", hasItem(ItemInit.ZINC_INGOT.get()))
				.build(recipe);
				
				//block
				ShapedRecipeBuilder.shapedRecipe(BlockInit.BRASS_BLOCK.get(), 1)
				.patternLine("aaa")
				.patternLine("aaa")
				.patternLine("aaa")
				.key('a', ItemInit.BRASS_INGOT.get())
				.addCriterion("brass_ingot", hasItem(ItemInit.BRASS_INGOT.get()))
				.build(recipe);

				//ingot_block
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRASS_INGOT.get(), 9)
				.addIngredient(BlockInit.BRASS_BLOCK.get())
				.addCriterion("brass_block", hasItem(BlockInit.BRASS_BLOCK.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "brass_ingot_block"));
				
				//nugget
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRASS_NUGGET.get(), 9)
				.addIngredient(ItemInit.BRASS_INGOT.get())
				.addCriterion("brass_ingot", hasItem(ItemInit.BRASS_INGOT.get()))
				.build(recipe);
							
				//ingot_nuggets
		        ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_INGOT.get(), 1)
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ItemInit.BRASS_NUGGET.get())
		        .addCriterion("brass_nugget", hasItem(ItemInit.BRASS_NUGGET.get()))
		        .build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "brass_ingot_nuggets"));
					
				//ingot_blasting
				CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ItemInit.BRASS_BLEND.get()), ItemInit.BRASS_INGOT.get(), 1.7f, 400)
				.addCriterion("brass_blend", hasItem(ItemInit.BRASS_BLEND.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "brass_ingot_blasting"));
					
				//ingot_smelting
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.BRASS_BLEND.get()), ItemInit.BRASS_INGOT.get(), 1.7f, 500)
				.addCriterion("brass_blend", hasItem(ItemInit.BRASS_BLEND.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "brass_ingot_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.BRASS_DUST.get(), 1)
				.addIngredient(ItemInit.BRASS_INGOT.get())
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("brass_ingot", hasItem(ItemInit.BRASS_INGOT.get()))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.BRASS_DUST.get()), ItemInit.BRASS_INGOT.get(), 0.7f, 200)
				.addCriterion("brass_dust", hasItem(ItemInit.BRASS_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "brass_dust_smelting"));
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', ItemInit.BRASS_INGOT.get())
		        .addCriterion("brass_ingot", hasItem(ItemInit.BRASS_INGOT.get()))
		        .build(recipe);
				
				
				
				
				//Chromium
				//block
				ShapedRecipeBuilder.shapedRecipe(BlockInit.CHROMIUM_BLOCK.get(), 1)
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ItemInit.CHROMIUM_INGOT.get())
		        .addCriterion("chromium_ingot", hasItem(ItemInit.CHROMIUM_INGOT.get()))
		        .build(recipe);
			
				//ingot_block
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.CHROMIUM_INGOT.get(), 9)
				.addIngredient(BlockInit.CHROMIUM_BLOCK.get())
				.addCriterion("chromium_block", hasItem(BlockInit.CHROMIUM_BLOCK.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "chromium_ingot_block"));
				
				//nugget
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.CHROMIUM_NUGGET.get(), 9)
				.addIngredient(ItemInit.CHROMIUM_INGOT.get())
				.addCriterion("chromium_ingot", hasItem(ItemInit.CHROMIUM_INGOT.get()))
				.build(recipe);
					
				//ingot_nuggets
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_INGOT.get(), 1)
				.patternLine("aaa")
				.patternLine("aaa")
				.patternLine("aaa")
				.key('a', ItemInit.CHROMIUM_NUGGET.get())
				.addCriterion("chromium_nugget", hasItem(ItemInit.CHROMIUM_NUGGET.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "chromium_ingot_nuggets"));
				
				//ingot_blasting
				CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.CHROMIUM_ORE.get()), ItemInit.CHROMIUM_INGOT.get(), 0.7f, 400)
				.addCriterion("chromium_ore", hasItem(BlockInit.CHROMIUM_ORE.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "chromium_ingot_blasting"));
				
				//ingot_smelting
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.CHROMIUM_ORE.get()), ItemInit.CHROMIUM_INGOT.get(), 0.7f, 200)
				.addCriterion("chromium_ore", hasItem(BlockInit.CHROMIUM_ORE.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "chromium_ingot_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.CHROMIUM_DUST.get(), 1)
				.addIngredient(ItemInit.CHROMIUM_INGOT.get())
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("chromium_ingot", hasItem(ItemInit.CHROMIUM_INGOT.get()))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.CHROMIUM_DUST.get()), ItemInit.CHROMIUM_INGOT.get(), 0.7f, 200)
				.addCriterion("chromium_dust", hasItem(ItemInit.CHROMIUM_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "chromium_dust_smelting"));
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', ItemInit.CHROMIUM_INGOT.get())
		        .addCriterion("chromium_ingot", hasItem(ItemInit.CHROMIUM_INGOT.get()))
		        .build(recipe);
				
				
				
				//Thorium
				//nugget
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.THORIUM_NUGGET.get(), 9)
				.addIngredient(ItemInit.THORIUM_INGOT.get())
				.addCriterion("thorium_ingot", hasItem(ItemInit.THORIUM_INGOT.get()))
				.build(recipe);
				
				//ingot_nuggets
				ShapedRecipeBuilder.shapedRecipe(ItemInit.THORIUM_INGOT.get(), 1)
				.patternLine("aaa")
				.patternLine("aaa")
				.patternLine("aaa")
				.key('a', ItemInit.THORIUM_NUGGET.get())
				.addCriterion("thorium_nugget", hasItem(ItemInit.THORIUM_NUGGET.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "thorium_ingot_nuggets"));
				
				//ingot_blasting
				CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlockInit.THORIUM_ORE.get()), ItemInit.THORIUM_INGOT.get(), 0.7f, 400)
				.addCriterion("thorium_ore", hasItem(BlockInit.THORIUM_ORE.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "thorium_ingot_blasting"));
				
				//ingot_smelting
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlockInit.THORIUM_ORE.get()), ItemInit.THORIUM_INGOT.get(), 0.7f, 200)
				.addCriterion("thorium_ore", hasItem(BlockInit.THORIUM_ORE.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "thorium_ingot_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.THORIUM_DUST.get(), 1)
				.addIngredient(ItemInit.THORIUM_INGOT.get())
				.addIngredient(ModTags.Items.TIER_2_HAMMERS)
				.addCriterion("thorium_ingot", hasItem(ItemInit.THORIUM_INGOT.get()))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.THORIUM_DUST.get()), ItemInit.THORIUM_INGOT.get(), 0.7f, 200)
				.addCriterion("thorium_dust", hasItem(ItemInit.THORIUM_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "thorium_dust_smelting"));
				
				//Gears
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STONE_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.COBBLESTONE)
		        .addCriterion("cobblestone", hasItem(Tags.Items.COBBLESTONE))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.IRON_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.INGOTS_IRON)
		        .addCriterion("iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.GOLD_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.INGOTS_GOLD)
		        .addCriterion("gold_ingot", hasItem(Tags.Items.INGOTS_GOLD))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LAPIS_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.GEMS_LAPIS)
		        .addCriterion("lapis_lazuli", hasItem(Tags.Items.GEMS_LAPIS))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.QUARTZ_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.GEMS_QUARTZ)
		        .addCriterion("nether_quartz", hasItem(Tags.Items.GEMS_QUARTZ))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.DIAMOND_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.GEMS_DIAMOND)
		        .addCriterion("diamond", hasItem(Tags.Items.GEMS_DIAMOND))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.EMERALD_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.GEMS_EMERALD)
		        .addCriterion("emerald", hasItem(Tags.Items.GEMS_EMERALD))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NETHERITE_GEAR.get(), 1)
		        .patternLine(" a ")
		        .patternLine("a a")
		        .patternLine(" a ")
		        .key('a', Tags.Items.INGOTS_NETHERITE)
		        .addCriterion("netherite_ingot", hasItem(Tags.Items.INGOTS_NETHERITE))
		        .build(recipe);
				
				
				//Dusts
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COAL_DUST.get(), 1)
				.addIngredient(Items.COAL)
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("coal", hasItem(Items.COAL))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.COAL_DUST.get()), Items.COAL, 0.7f, 200)
				.addCriterion("coal_dust", hasItem(ItemInit.COAL_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "coal_dust_smelting"));

				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.IRON_DUST.get(), 1)
				.addIngredient(Items.IRON_INGOT)
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("iron_ingot", hasItem(Items.IRON_INGOT))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.IRON_DUST.get()), Items.IRON_INGOT, 0.7f, 200)
				.addCriterion("iron_dust", hasItem(ItemInit.IRON_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "iron_dust_smelting"));

				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.GOLD_DUST.get(), 1)
				.addIngredient(Items.GOLD_INGOT)
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("gold_ingot", hasItem(Items.GOLD_INGOT))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.GOLD_DUST.get()), Items.GOLD_INGOT, 0.7f, 200)
				.addCriterion("gold_dust", hasItem(ItemInit.GOLD_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "gold_dust_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LAPIS_DUST.get(), 1)
				.addIngredient(Items.LAPIS_LAZULI)
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("lapis_lazuli", hasItem(Items.LAPIS_LAZULI))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.LAPIS_DUST.get()), Items.LAPIS_LAZULI, 0.7f, 200)
				.addCriterion("lapis_dust", hasItem(ItemInit.LAPIS_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "lapis_dust_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.QUARTZ_DUST.get(), 1)
				.addIngredient(Items.QUARTZ)
				.addIngredient(ModTags.Items.HAMMERS)
				.addCriterion("quartz", hasItem(Items.QUARTZ))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.QUARTZ_DUST.get()), Items.QUARTZ, 0.7f, 200)
				.addCriterion("quartz_dust", hasItem(ItemInit.QUARTZ_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "quartz_dust_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.DIAMOND_DUST.get(), 1)
				.addIngredient(Items.DIAMOND)
				.addIngredient(ModTags.Items.TIER_2_HAMMERS)
				.addCriterion("diamond", hasItem(Items.DIAMOND))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.DIAMOND_DUST.get()), Items.DIAMOND, 0.7f, 200)
				.addCriterion("diamond_dust", hasItem(ItemInit.DIAMOND_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "diamond_dust_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.EMERALD_DUST.get(), 1)
				.addIngredient(Items.EMERALD)
				.addIngredient(ModTags.Items.TIER_2_HAMMERS)
				.addCriterion("emerald", hasItem(Items.EMERALD))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.EMERALD_DUST.get()), Items.EMERALD, 0.7f, 200)
				.addCriterion("emerald_dust", hasItem(ItemInit.EMERALD_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "emerald_dust_smelting"));
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.NETHERITE_DUST.get(), 1)
				.addIngredient(Items.NETHERITE_INGOT)
				.addIngredient(ItemInit.NETHERITE_HAMMER.get())
				.addCriterion("netherite_ingot", hasItem(Items.NETHERITE_INGOT))
				.build(recipe);
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.NETHERITE_DUST.get()), Items.NETHERITE_INGOT, 0.7f, 200)
				.addCriterion("netherite_dust", hasItem(ItemInit.NETHERITE_DUST.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "netherite_dust_smelting"));
				
				
				
				//Hammers
				ShapedRecipeBuilder.shapedRecipe(ItemInit.IRON_HAMMER.get(), 1)
		        .patternLine(" a ")
		        .patternLine(" sa")
		        .patternLine("s  ")
		        .key('a', Tags.Items.INGOTS_IRON)
		        .key('s', Items.STICK)
		        .addCriterion("iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.DIAMOND_HAMMER.get(), 1)
		        .patternLine(" a ")
		        .patternLine(" sa")
		        .patternLine("s  ")
		        .key('a', Tags.Items.GEMS_DIAMOND)
		        .key('s', Items.STICK)
		        .addCriterion("diamond", hasItem(Tags.Items.GEMS_DIAMOND))
		        .build(recipe);
				SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(ItemInit.DIAMOND_HAMMER.get()), Ingredient.fromTag(Tags.Items.INGOTS_NETHERITE), ItemInit.NETHERITE_HAMMER.get()).addCriterion("netherite_ingot", hasItem(Tags.Items.INGOTS_NETHERITE)).build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "netherite_hammer_smithing"));
				
				//Tin
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .key('s', Items.STICK)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .key('s', Items.STICK)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .key('s', Items.STICK)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .key('s', Items.STICK)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .key('s', Items.STICK)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_TIN)
		        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
		        .build(recipe);
				
				
				
				//Aluminum
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .key('s', Items.STICK)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .key('s', Items.STICK)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .key('s', Items.STICK)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .key('s', Items.STICK)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .key('s', Items.STICK)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ALUMINUM)
		        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
		        .build(recipe);
				
				//Steel
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .key('s', Items.STICK)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .key('s', Items.STICK)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .key('s', Items.STICK)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .key('s', Items.STICK)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .key('s', Items.STICK)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				
				//Copper
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .key('s', Items.STICK)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .key('s', Items.STICK)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .key('s', Items.STICK)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .key('s', Items.STICK)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .key('s', Items.STICK)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_COPPER)
		        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
		        .build(recipe);
				
				//Lead
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .key('s', Items.STICK)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .key('s', Items.STICK)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .key('s', Items.STICK)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .key('s', Items.STICK)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .key('s', Items.STICK)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_LEAD)
		        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
		        .build(recipe);
				
				//Ruby
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .key('s', Items.STICK)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .key('s', Items.STICK)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .key('s', Items.STICK)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .key('s', Items.STICK)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .key('s', Items.STICK)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.GEMS_RUBY)
		        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
		        .build(recipe);
				
				//Silver
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .key('s', Items.STICK)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .key('s', Items.STICK)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .key('s', Items.STICK)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .key('s', Items.STICK)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .key('s', Items.STICK)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_SILVER)
		        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
		        .build(recipe);
				
				//Nickel
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .key('s', Items.STICK)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .key('s', Items.STICK)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .key('s', Items.STICK)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .key('s', Items.STICK)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .key('s', Items.STICK)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_NICKEL)
		        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
		        .build(recipe);
				
				//Invar
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .key('s', Items.STICK)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .key('s', Items.STICK)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .key('s', Items.STICK)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .key('s', Items.STICK)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .key('s', Items.STICK)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_INVAR)
		        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
		        .build(recipe);
				
				//Electrum
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .key('s', Items.STICK)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .key('s', Items.STICK)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .key('s', Items.STICK)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .key('s', Items.STICK)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .key('s', Items.STICK)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ELECTRUM)
		        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
		        .build(recipe);
				
				//Platinum
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .key('s', Items.STICK)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .key('s', Items.STICK)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .key('s', Items.STICK)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .key('s', Items.STICK)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .key('s', Items.STICK)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_PLATINUM)
		        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
		        .build(recipe);
				
				//Enderium
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .key('s', Items.STICK)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .key('s', Items.STICK)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .key('s', Items.STICK)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .key('s', Items.STICK)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .key('s', Items.STICK)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				
				//Tungsten
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .key('s', Items.STICK)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .key('s', Items.STICK)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .key('s', Items.STICK)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .key('s', Items.STICK)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .key('s', Items.STICK)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
		        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
		        .build(recipe);
				
				//Bronze
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .key('s', Items.STICK)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .key('s', Items.STICK)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .key('s', Items.STICK)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .key('s', Items.STICK)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .key('s', Items.STICK)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_BRONZE)
		        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
		        .build(recipe);
				
				//Amethyst
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .key('s', Items.STICK)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .key('s', Items.STICK)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .key('s', Items.STICK)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .key('s', Items.STICK)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .key('s', Items.STICK)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.GEMS_AMETHYST)
		        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
		        .build(recipe);
				
				//Sapphire
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .key('s', Items.STICK)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .key('s', Items.STICK)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .key('s', Items.STICK)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .key('s', Items.STICK)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .key('s', Items.STICK)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.GEMS_SAPPHIRE)
		        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
		        .build(recipe);
				
				//Titanium
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .key('s', Items.STICK)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .key('s', Items.STICK)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .key('s', Items.STICK)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .key('s', Items.STICK)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .key('s', Items.STICK)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_TITANIUM)
		        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
		        .build(recipe);
				
				//Zinc
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .key('s', Items.STICK)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .key('s', Items.STICK)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .key('s', Items.STICK)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .key('s', Items.STICK)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .key('s', Items.STICK)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ZINC_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_ZINC)
		        .addCriterion("zinc_ingot", hasItem(ModTags.Items.INGOTS_ZINC))
		        .build(recipe);
				
				//Cobalt
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .key('s', Items.STICK)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .key('s', Items.STICK)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .key('s', Items.STICK)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .key('s', Items.STICK)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .key('s', Items.STICK)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.COBALT_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				
				//Brass
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .key('s', Items.STICK)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .key('s', Items.STICK)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .key('s', Items.STICK)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .key('s', Items.STICK)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .key('s', Items.STICK)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BRASS_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				
				//Chromium
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_SWORD.get(), 1)
		        .patternLine("a")
		        .patternLine("a")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .key('s', Items.STICK)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_PICKAXE.get(), 1)
		        .patternLine("aaa")
		        .patternLine(" s ")
		        .patternLine(" s ")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .key('s', Items.STICK)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_AXE.get(), 1)
		        .patternLine("aa")
		        .patternLine("as")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .key('s', Items.STICK)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_SHOVEL.get(), 1)
		        .patternLine("a")
		        .patternLine("s")
		        .patternLine("s")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .key('s', Items.STICK)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_HOE.get(), 1)
		        .patternLine("aa")
		        .patternLine(" s")
		        .patternLine(" s")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .key('s', Items.STICK)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_HELMET.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_CHESTPLATE.get(), 1)
		        .patternLine("a a")
		        .patternLine("aaa")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_LEGGINGS.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("a a")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.CHROMIUM_BOOTS.get(), 1)
		        .patternLine("a a")
		        .patternLine("a a")
		        .patternLine("   ")
		        .key('a', ModTags.Items.INGOTS_CHROMIUM)
		        .addCriterion("chromium_ingot", hasItem(ModTags.Items.INGOTS_CHROMIUM))
		        .build(recipe);
				
				//Machine
				ShapedRecipeBuilder.shapedRecipe(BlockInit.MACHINE_FRAME.get(), 1)
		        .patternLine("aaa")
		        .patternLine("a a")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_STEEL)
		        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.BASIC).get(), 1)
		        .patternLine("aaa")
		        .patternLine("gfg")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_BRASS)
		        .key('g', ModTags.Items.GEARS_TIN)
		        .key('f', BlockInit.MACHINE_FRAME.get())
		        .addCriterion("brass_ingot", hasItem(ModTags.Items.INGOTS_BRASS))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ADVANCED).get(), 1)
		        .patternLine("aaa")
		        .patternLine("gfg")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_SIGNALUM)
		        .key('g', ModTags.Items.GEARS_INVAR)
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.BASIC).get())
		        .addCriterion("signalum_ingot", hasItem(ModTags.Items.INGOTS_SIGNALUM))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.INDUSTRIAL).get(), 1)
		        .patternLine("aaa")
		        .patternLine("gfg")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_COBALT)
		        .key('g', ModTags.Items.GEARS_CHROMIUM)
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ADVANCED).get())
		        .addCriterion("cobalt_ingot", hasItem(ModTags.Items.INGOTS_COBALT))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ULTIMATE).get(), 1)
		        .patternLine("aaa")
		        .patternLine("gfg")
		        .patternLine("aaa")
		        .key('a', ModTags.Items.INGOTS_ENDERIUM)
		        .key('g', ModTags.Items.GEARS_OPAL)
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.INDUSTRIAL).get())
		        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.BASIC_PHOTOVOLTAIC_CELL.get(), 1)
		        .patternLine("ggg")
		        .patternLine("ddd")
		        .patternLine("sss")
		        .key('g', Blocks.GLASS)
		        .key('d', ModTags.Items.DUSTS_EMERALD)
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .addCriterion("emerald_dust", hasItem(ModTags.Items.DUSTS_EMERALD))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ADVANCED_PHOTOVOLTAIC_CELL.get(), 1)
		        .patternLine("ggg")
		        .patternLine("ddd")
		        .patternLine("sps")
		        .key('g', Blocks.GLASS)
		        .key('d', ModTags.Items.DUSTS_DIAMOND)
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('p', ItemInit.BASIC_PHOTOVOLTAIC_CELL.get())
		        .addCriterion("diamond_dust", hasItem(ModTags.Items.DUSTS_DIAMOND))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INDUSTRIAL_PHOTOVOLTAIC_CELL.get(), 1)
		        .patternLine("ggg")
		        .patternLine("ddd")
		        .patternLine("sps")
		        .key('g', Blocks.GLASS)
		        .key('d', ModTags.Items.DUSTS_SAPPHIRE)
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('p', ItemInit.ADVANCED_PHOTOVOLTAIC_CELL.get())
		        .addCriterion("sapphire_dust", hasItem(ModTags.Items.DUSTS_SAPPHIRE))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(ItemInit.ULTIMATE_PHOTOVOLTAIC_CELL.get(), 1)
		        .patternLine("ggg")
		        .patternLine("ddd")
		        .patternLine("sps")
		        .key('g', Blocks.GLASS)
		        .key('d', ModTags.Items.DUSTS_AMETHYST)
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('p', ItemInit.INDUSTRIAL_PHOTOVOLTAIC_CELL.get())
		        .addCriterion("amethyst_dust", hasItem(ModTags.Items.DUSTS_AMETHYST))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.SOLAR_GENERATOR.get(SolarGenTier.BASIC).get(), 1)
		        .patternLine("ggg")
		        .patternLine("sfs")
		        .patternLine("iii")
		        .key('g', ItemInit.BASIC_PHOTOVOLTAIC_CELL.get())
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.BASIC).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_BRASS)
		        .addCriterion("machine_frame_basic", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.BASIC).get()))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.SOLAR_GENERATOR.get(SolarGenTier.ADVANCED).get(), 1)
		        .patternLine("ggg")
		        .patternLine("sfs")
		        .patternLine("ipi")
		        .key('g', ItemInit.ADVANCED_PHOTOVOLTAIC_CELL.get())
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ADVANCED).get())
		        .key('p', BlockInit.SOLAR_GENERATOR.get(SolarGenTier.BASIC).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_SIGNALUM)
		        .addCriterion("machine_frame_advanced", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ADVANCED).get()))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.SOLAR_GENERATOR.get(SolarGenTier.INDUSTRIAL).get(), 1)
		        .patternLine("ggg")
		        .patternLine("sfs")
		        .patternLine("ipi")
		        .key('g', ItemInit.INDUSTRIAL_PHOTOVOLTAIC_CELL.get())
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.INDUSTRIAL).get())
		        .key('p', BlockInit.SOLAR_GENERATOR.get(SolarGenTier.ADVANCED).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_COBALT)
		        .addCriterion("machine_frame_industrial", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.INDUSTRIAL).get()))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.SOLAR_GENERATOR.get(SolarGenTier.ULTIMATE).get(), 1)
		        .patternLine("ggg")
		        .patternLine("sfs")
		        .patternLine("ipi")
		        .key('g', ItemInit.ULTIMATE_PHOTOVOLTAIC_CELL.get())
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ULTIMATE).get())
		        .key('p', BlockInit.SOLAR_GENERATOR.get(SolarGenTier.INDUSTRIAL).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_ENDERIUM)
		        .addCriterion("machine_frame_ultimate", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ULTIMATE).get()))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(BlockInit.FERMENTING_BARREL.get(), 1)
		        .patternLine("psp")
		        .patternLine("pip")
		        .patternLine("psp")
		        .key('p', ItemTags.PLANKS)
		        .key('s', ItemTags.WOODEN_SLABS)
		        .key('i', Tags.Items.INGOTS_IRON)
		        .addCriterion("iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
		        .build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.RUM.get(), 1)
				.addIngredient(BlockInit.FERMENTING_BARREL.get())
				.addIngredient(Items.SUGAR_CANE, 4)
				.addCriterion("fermenting_barrel", hasItem(BlockInit.FERMENTING_BARREL.get()))
				.build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.JUICER.get(), 1)
		        .patternLine("i  ")
		        .patternLine("p  ")
		        .patternLine("   ")
		        .key('p', Items.HEAVY_WEIGHTED_PRESSURE_PLATE)
		        .key('i', Tags.Items.INGOTS_IRON)
		        .addCriterion("iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
		        .build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PINEAPPLE_JUICE.get(), 1)
				.addIngredient(ItemInit.JUICER.get())
				.addIngredient(ModTags.Items.FRUITS_PINEAPPLE)
				.addCriterion("pineapple", hasItem(ModTags.Items.FRUITS_PINEAPPLE))
				.build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.COCONUT_MILK.get(), 1)
				.addIngredient(ItemInit.JUICER.get())
				.addIngredient(ModTags.Items.COCONUT)
				.addCriterion("coconut", hasItem(ModTags.Items.COCONUT))
				.build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PINA_COLADA.get(), 1)
				.addIngredient(ModTags.Items.JUICES_PINEAPPLE)
				.addIngredient(ModTags.Items.JUICES_PINEAPPLE)
				.addIngredient(ModTags.Items.JUICES_PINEAPPLE)
				.addIngredient(ModTags.Items.RUM)
				.addIngredient(ModTags.Items.COCONUT_MILK)
				.addCriterion("pineapple_juice", hasItem(ModTags.Items.JUICES_PINEAPPLE))
				.build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(ItemInit.PINEAPPLE_SEEDS.get(), 3)
				.addIngredient(ModTags.Items.FRUITS_PINEAPPLE)
				.addCriterion("pineapple", hasItem(ModTags.Items.FRUITS_PINEAPPLE))
				.build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(BlockInit.COCONUT_SAPLING.get(), 1)
				.addIngredient(ItemTags.SAPLINGS)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addIngredient(ModTags.Items.COCONUT)
				.addCriterion("coconut", hasItem(ModTags.Items.COCONUT))
				.build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.PINA_COLADA_SONG_MUSIC_DISC.get(), 1)
		        .patternLine("ppp")
		        .patternLine("pmp")
		        .patternLine("ppp")
		        .key('p', ModTags.Items.PINA_COLADA)
		        .key('m', Items.MUSIC_DISC_PIGSTEP)
		        .addCriterion("music_disc_pigstep", hasItem(Items.MUSIC_DISC_PIGSTEP))
		        .build(recipe);
				
				ShapedRecipeBuilder.shapedRecipe(BlockInit.SALT_BLOCK.get(), 1)
		        .patternLine("pp ")
		        .patternLine("pp ")
		        .patternLine("   ")
		        .key('p', ModTags.Items.DUSTS_SALT)
		        .addCriterion("salt", hasItem(ModTags.Items.DUSTS_SALT))
		        .build(recipe);
				
				ShapelessRecipeBuilder.shapelessRecipe(BlockInit.CANDLENUT_SAPLING.get(), 1)
				.addIngredient(ItemTags.SAPLINGS)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addIngredient(ModTags.Items.FRUITS_CANDLENUT)
				.addCriterion("candlenut", hasItem(ModTags.Items.FRUITS_CANDLENUT))
				.build(recipe);
				
				CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemInit.CANDLENUT.get()), ItemInit.COOKED_CANDLENUT.get(), 0.7f, 200)
				.addCriterion("candlenut", hasItem(ItemInit.COOKED_CANDLENUT.get()))
				.build(recipe, new ResourceLocation(MechAddendums.MOD_ID, "cooked_candlenut_smelting"));
				
				ShapedRecipeBuilder.shapedRecipe(ItemInit.INAMONA.get(), 1)
		        .patternLine("bp ")
		        .patternLine("ps ")
		        .patternLine("   ")
		        .key('s', ModTags.Items.DUSTS_SALT)
		        .key('b',Items.BOWL)
		        .key('p', ItemInit.COOKED_CANDLENUT.get())
		        .addCriterion("cooked_candlenut", hasItem(ItemInit.COOKED_CANDLENUT.get()))
		        .build(recipe);
				
				cookingRecipesForMethod(recipe, "smoking", IRecipeSerializer.SMOKING, 100);
				cookingRecipesForMethod(recipe, "campfire_cooking", IRecipeSerializer.CAMPFIRE_COOKING, 600);
				
				ShapedRecipeBuilder.shapedRecipe(BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.BASIC).get(), 1)
		        .patternLine("iii")
		        .patternLine("sfs")
		        .patternLine("sss")
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.BASIC).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_BRASS)
		        .addCriterion("machine_frame_basic", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.BASIC).get()))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.ADVANCED).get(), 1)
		        .patternLine("iii")
		        .patternLine("sfs")
		        .patternLine("sps")
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ADVANCED).get())
		        .key('p', BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.BASIC).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_SIGNALUM)
		        .addCriterion("machine_frame_advanced", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ADVANCED).get()))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.INDUSTRIAL).get(), 1)
		        .patternLine("iii")
		        .patternLine("sfs")
		        .patternLine("sps")
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.INDUSTRIAL).get())
		        .key('p', BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.ADVANCED).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_COBALT)
		        .addCriterion("machine_frame_industrial", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.INDUSTRIAL).get()))
		        .build(recipe);
				ShapedRecipeBuilder.shapedRecipe(BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.ULTIMATE).get(), 1)
		        .patternLine("iii")
		        .patternLine("sfs")
		        .patternLine("sps")
		        .key('f', BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ULTIMATE).get())
		        .key('p', BlockInit.FURNACE_GENERATOR.get(FurnaceGenTier.INDUSTRIAL).get())
		        .key('s', ModTags.Items.INGOTS_STEEL)
		        .key('i', ModTags.Items.INGOTS_ENDERIUM)
		        .addCriterion("machine_frame_ultimate", hasItem(BlockInit.MACHINE_FRAME_TIERED.get(MachineFrameTier.ULTIMATE).get()))
		        .build(recipe);
	}
	
	private static void cookingRecipesForMethod(Consumer<IFinishedRecipe> recipeConsumer, String recipeConsumerIn, CookingRecipeSerializer<?> cookingMethod, int serializerIn) {
			CookingRecipeBuilder.cookingRecipe(Ingredient.fromItems(ItemInit.CANDLENUT.get()), ItemInit.COOKED_CANDLENUT.get(), 0.7f, serializerIn, cookingMethod)
			.addCriterion("candlenut", hasItem(ItemInit.COOKED_CANDLENUT.get()))
			.build(recipeConsumer, "cooked_candlenut_" + recipeConsumerIn);
	   }
}
