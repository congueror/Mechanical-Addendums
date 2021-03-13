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

public class ModItem extends Item
{

	public ModItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(this == ItemInit.PINA_COLADA.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.pinacolada");
		}
		
		if(this == ItemInit.INAMONA.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.inamona");
		}
		
		if(this == ItemInit.LEAD_DUST.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.leaddust");
		}
		
		if(this == ItemInit.COAL_NUGGET.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.coalnugget");
		}
		
		if(this == ItemInit.EMERALD_HORN.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.emeraldhorn");
		}
		
		if(this == ItemInit.TREE_TAP.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.treetap");
		}
		
		if(this == ItemInit.JUICER.get()) {
			tooltip(tooltip, "tooltip.mechaddendums.juicer");
		}
		
		if(this instanceof RadioactiveMetalItem) {
			tooltip(tooltip, "tooltip.mechaddendums.uraniumdamage");
		}
	}

	public void tooltip(List<ITextComponent> tooltip, String translation) {
		tooltip.add(new TranslationTextComponent(translation).mergeStyle(TextFormatting.GRAY));
	}
}
