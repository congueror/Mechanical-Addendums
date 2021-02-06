package com.congueror.mechaddendums.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class FermentingBarrelBlockItem extends BlockItem
{

	public FermentingBarrelBlockItem(Block block ,Properties properties) {
		super(block, properties);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.fermenting_barrel").mergeStyle(TextFormatting.GRAY));
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
	    return stack.copy();
	}
	
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
	    return true;
	}
}
