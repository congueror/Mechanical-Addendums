package com.congueror.mechaddendums.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeHooks;

public class HammerItem extends ModContainerItem {	
	public HammerItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		 ItemStack stack1 = stack.copy();
		 if (stack1.attemptDamageItem(1, ForgeHooks.getCraftingPlayer().world.rand, null)) {
			 stack1.shrink(1);
		 }
	     return stack1;
	}
}
