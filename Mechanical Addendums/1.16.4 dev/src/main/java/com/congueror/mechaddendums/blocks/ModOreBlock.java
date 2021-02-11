package com.congueror.mechaddendums.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.congueror.mechaddendums.init.BlockInit;

import net.minecraft.block.OreBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModOreBlock extends OreBlock
{

	public ModOreBlock(Properties properties) 
	{
		super(properties);
	} 
	
	@Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
		if(this == BlockInit.ALUMINUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.aluminum_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.TIN_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.tin_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.LEAD_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.lead_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.COPPER_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.copper_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.RUBY_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.ruby_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SILVER_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.silver_ore").appendString("").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.NICKEL_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.nickel_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SULFUR_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.sulfur_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.PLATINUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.platinum_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.TUNGSTEN_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.tungsten_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.AMETHYST_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.amethyst_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SAPPHIRE_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.sapphire_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.OPAL_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.opal_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.TITANIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.titanium_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.URANIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.uranium_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.COBALT_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.cobalt_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.ZINC_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.zinc_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SALTPETRE_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.saltpetre_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.CHROMIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.chromium_ore").mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.THORIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.thorium_ore").mergeStyle(TextFormatting.GRAY));
		}
    }
	
	public int getExperience(Random random) 
	{
		if(this == BlockInit.RUBY_ORE.get()) {
			return MathHelper.nextInt(random, 5, 10);
		}else if(this == BlockInit.SALTPETRE_ORE.get()) {
			return MathHelper.nextInt(random, 1, 3);
		}else if(this == BlockInit.SULFUR_ORE.get()) {
			return MathHelper.nextInt(random, 1, 3);
		}else if(this == BlockInit.AMETHYST_ORE.get()) {
			return MathHelper.nextInt(random, 2, 7);
		}else if(this == BlockInit.OPAL_ORE.get()) {
			return MathHelper.nextInt(random, 4, 12);
		}else {
			return this == BlockInit.SAPPHIRE_ORE.get() ? MathHelper.nextInt(random, 1, 6) : 0;
		}
	}
}
