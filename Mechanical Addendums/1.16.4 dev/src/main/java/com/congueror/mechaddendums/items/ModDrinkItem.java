package com.congueror.mechaddendums.items;

import java.util.List;

import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class ModDrinkItem extends Item
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
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(this == ItemInit.PINA_COLADA.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.pinacolada").mergeStyle(TextFormatting.GRAY));
		}
	}
}
