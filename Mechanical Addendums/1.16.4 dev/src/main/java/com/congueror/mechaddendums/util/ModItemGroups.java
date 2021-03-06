package com.congueror.mechaddendums.util;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.init.ItemInit;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("deprecation")
public class ModItemGroups
{
	public static class BlocksIG extends ItemGroup
	{
		public final static BlocksIG instance = new BlocksIG(ItemGroup.GROUPS.length, "mechaddendumsblockstab");
		private BlocksIG(int index, String label) 
		{
			super(index, label);
			this.setBackgroundImageName("mechaddendums_item_search.png");
		}
	
		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(BlockInit.TIN_ORE.get());
		}
	
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	
		@Override
		public int getSearchbarWidth() {
			return 88;
		}
	
		@Override
		public ResourceLocation getTabsImage() {
			return new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/mechaddendums_tabs.png");
		}
	}
	
	public static class ItemsIG extends ItemGroup
	{
		public final static ItemsIG instance = new ItemsIG(ItemGroup.GROUPS.length, "mechaddendumsitemstab");
		private ItemsIG(int index, String label) 
		{
			super(index, label);
			this.setBackgroundImageName("mechaddendums_item_search.png");
		}
	
		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(ItemInit.TIN_INGOT.get());
		}
	
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	
		@Override
		public int getSearchbarWidth() {
			return 88;
		}
	
		@Override
		public ResourceLocation getTabsImage() {
			return new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/mechaddendums_tabs.png");
		}
	}
	
	public static class ArmourIG extends ItemGroup
	{
		public final static ArmourIG instance = new ArmourIG(ItemGroup.GROUPS.length, "mechaddendumsarmourtab");
		private ArmourIG(int index, String label) 
		{
			super(index, label);
			this.setBackgroundImageName("mechaddendums_item_search.png");
		}
	
		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(ItemInit.TIN_CHESTPLATE.get());
		}
	
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	
		@Override
		public int getSearchbarWidth() {
			return 88;
		}
	
		@Override
		public ResourceLocation getTabsImage() {
			return new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/mechaddendums_tabs.png");
		}
	}
	
	public static class FoodIG extends ItemGroup
	{
		public final static FoodIG instance = new FoodIG(ItemGroup.GROUPS.length, "mechaddendumsfoodtab");
		private FoodIG(int index, String label) 
		{
			super(index, label);
			this.setBackgroundImageName("mechaddendums_item_search.png");
		}
	
		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(ItemInit.PINEAPPLE.get());
		}
	
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	
		@Override
		public int getSearchbarWidth() {
			return 88;
		}
	
		@Override
		public ResourceLocation getTabsImage() {
			return new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/mechaddendums_tabs.png");
		}
	}
	
	public static class MachinesIG extends ItemGroup
	{
		public final static MachinesIG instance = new MachinesIG(ItemGroup.GROUPS.length, "mechaddendumsmachinestab");
		private MachinesIG(int index, String label) 
		{
			super(index, label);
			this.setBackgroundImageName("mechaddendums_item_search.png");
		}
	
		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(BlockInit.SOLAR_GENERATOR.get(SolarGenTier.ADVANCED).get());
		}
	
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	
		@Override
		public int getSearchbarWidth() {
			return 88;
		}
	
		@Override
		public ResourceLocation getTabsImage() {
			return new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/mechaddendums_tabs.png");
		}
	}
}