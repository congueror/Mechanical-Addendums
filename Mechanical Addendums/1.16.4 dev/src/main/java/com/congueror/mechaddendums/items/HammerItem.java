package com.congueror.mechaddendums.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HammerItem extends Item {	
	public HammerItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		 ItemStack stack1 = stack.copy();
	     stack1.setDamage(stack.getDamage() + 1);
	     return stack1;
	}
	
	@Override 
	public boolean hasContainerItem(ItemStack stack) 
	{ 
		return true;
	}
}
