package com.congueror.mechaddendums.items;

import net.minecraft.item.ItemStack;

public class ModContainerItem extends ModItem
{
	public ModContainerItem(Properties properties) {
		super(properties);
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
