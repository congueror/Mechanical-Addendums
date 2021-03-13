package com.congueror.mechaddendums.items;

import net.minecraft.item.ItemStack;

public class CoalNuggetItem extends ModItem
{
	
	public CoalNuggetItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 178;
	}
}
