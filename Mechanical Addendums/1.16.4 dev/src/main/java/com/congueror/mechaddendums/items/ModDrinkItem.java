package com.congueror.mechaddendums.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ModDrinkItem extends ModItem
{
	public ModDrinkItem(Properties properties) {
		super(properties);
	}
	
	public int getUseDuration(ItemStack stack) {
	      return 32;
	}

	public UseAction getUseAction(ItemStack stack) {
	      return UseAction.DRINK;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
	      return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
	}
}
