package com.congueror.mechaddendums.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.congueror.mechaddendums.config.OreConfig;
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
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.aluminum_ore").appendString(OreConfig.minYAluminum.get() + "-" + OreConfig.maxYAluminum.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.TIN_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.tin_ore").appendString(OreConfig.minYTin.get() + "-" + OreConfig.maxYTin.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.LEAD_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.lead_ore").appendString(OreConfig.minYLead.get() + "-" + OreConfig.maxYLead.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.COPPER_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.copper_ore").appendString(OreConfig.minYCopper.get() + "-" + OreConfig.maxYCopper.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.RUBY_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.ruby_ore").appendString(OreConfig.minYRuby.get() + "-" + OreConfig.maxYRuby.get() + getInNetherString()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SILVER_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.silver_ore").appendString(OreConfig.minYSilver.get() + "-" + OreConfig.maxYSilver.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.NICKEL_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.nickel_ore").appendString(OreConfig.minYNickel.get() + "-" + OreConfig.maxYNickel.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SULFUR_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.sulfur_ore").appendString(OreConfig.minYSulfur.get() + "-" + OreConfig.maxYSulfur.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.PLATINUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.platinum_ore").appendString(OreConfig.minYPlatinum.get() + "-" + OreConfig.maxYPlatinum.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.TUNGSTEN_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.tungsten_ore").appendString(OreConfig.minYTungsten.get() + "-" + OreConfig.maxYTungsten.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.AMETHYST_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.amethyst_ore").appendString(OreConfig.minYAmethyst.get() + "-" + OreConfig.maxYAmethyst.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SAPPHIRE_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.sapphire_ore").appendString(OreConfig.minYSapphire.get() + "-" + OreConfig.maxYSapphire.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.OPAL_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.opal_ore").appendString(OreConfig.minYOpal.get() + "-" + OreConfig.maxYOpal.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.TITANIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.titanium_ore").appendString(OreConfig.minYTitanium.get() + "-" + OreConfig.maxYTitanium.get() + getInNetherString()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.URANIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.uranium_ore").appendString(OreConfig.minYUranium.get() + "-" + OreConfig.maxYUranium.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.COBALT_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.cobalt_ore").appendString(OreConfig.minYCobalt.get() + "-" + OreConfig.maxYCobalt.get() + getInNetherString()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.ZINC_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.zinc_ore").appendString(OreConfig.minYZinc.get() + "-" + OreConfig.maxYZinc.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.SALTPETRE_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.saltpetre_ore").appendString(OreConfig.minYSaltpetre.get() + "-" + OreConfig.maxYSaltpetre.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.CHROMIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.chromium_ore").appendString(OreConfig.minYChromium.get() + "-" + OreConfig.maxYChromium.get()).mergeStyle(TextFormatting.GRAY));
		}
		else if(this == BlockInit.THORIUM_ORE.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.thorium_ore").appendString(OreConfig.minYThorium.get() + "-" + OreConfig.maxYThorium.get()).mergeStyle(TextFormatting.GRAY));
		}
    }
	
	public String getInNetherString() {
		return new TranslationTextComponent("tooltip.mechaddendums.inNether").getString();
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
