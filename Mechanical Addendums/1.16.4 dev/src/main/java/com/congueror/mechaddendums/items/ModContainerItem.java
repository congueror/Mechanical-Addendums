package com.congueror.mechaddendums.items;

import java.util.List;

import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class ModContainerItem extends Item
{
	public ModContainerItem(Properties properties) {
		super(properties);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(this == ItemInit.TREE_TAP.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.treetap").mergeStyle(TextFormatting.GRAY));
		} else {
			tooltip.add(new TranslationTextComponent("tooltip.juicer").mergeStyle(TextFormatting.GRAY));
		}
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
