package com.congueror.mechaddendums.items;

import java.util.List;

import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class InformationItem extends Item
{

	public InformationItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(this == ItemInit.INAMONA.get()) {
			tooltip.add(new TranslationTextComponent("tooltip.mechaddendums.inamona"));
		}
	}

}
