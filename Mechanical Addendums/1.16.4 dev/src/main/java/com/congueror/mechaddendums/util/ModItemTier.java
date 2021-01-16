package com.congueror.mechaddendums.util;

import java.util.function.Supplier;

import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier
{
	//HarvestLvl,
	//Durability(Wood = 59, Iron = 250, Diamond = 1561, Netherite = 2031),
	//Efficiency(Wood = 2.0, Iron = 6.0, Diamond = 8.0),
	//Attack Damage(Wood = 0),
	//Enchantibility(Wood = 15),
	//RepairMat
	TIN(1, 72, 2.5f, 0.0f, 14, () -> {
		return Ingredient.fromItems(ItemInit.TIN_INGOT.get());
	}),
	
	ALUMINUM(2, 234, 5.7f, 0.0f, 10, () -> {
		return Ingredient.fromItems(ItemInit.ALUMINUM_INGOT.get());
	}),
	
	STEEL(2, 1306, 7.0f, 0.0f, 8, () -> {
		return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
	}),
	
	COPPER(2, 131, 3.0f, 0.0f, 13, () -> {
		return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());
	}),
	
	LEAD(2, 222, 4.9f, 0.0f, 12, () -> {
		return Ingredient.fromItems(ItemInit.LEAD_INGOT.get());
	}),
	
	RUBY(2, 1569, 8.1f, 0.0f, 5, () -> {
		return Ingredient.fromItems(ItemInit.RUBY.get());
	}),
	
	SILVER(3, 1539, 8.0f, 0.0f, 10, () -> {
		return Ingredient.fromItems(ItemInit.SILVER_INGOT.get());
	}),
	
	NICKEL(2, 240, 6.0f, 0.0f, 12, () -> {
		return Ingredient.fromItems(ItemInit.NICKEL_INGOT.get());
	}),
	
	INVAR(2, 250, 6.0f, 0.0f, 9, () -> {
		return Ingredient.fromItems(ItemInit.INVAR_INGOT.get());
	}),
	
	ELECTRUM(3, 201, 11.0f, 0.0f, 8, () -> {
		return Ingredient.fromItems(ItemInit.ELECTRUM_INGOT.get());
	}),
	
	PLATINUM(3, 1782, 7.5f, 0.0f, 8, () -> {
		return Ingredient.fromItems(ItemInit.PLATINUM_INGOT.get());
	}),
	
	ENDERIUM(3, 2478, 10.0f, 0.0f, 7, () -> {
		return Ingredient.fromItems(ItemInit.ENDERIUM_INGOT.get());
	}),
	
	TUNGSTEN(2, 1234, 7.0f, 0.0f, 10, () -> {
		return Ingredient.fromItems(ItemInit.TUNGSTEN_INGOT.get());
	}),
	
	BRONZE(2, 240, 6.0f, 0.0f, 9, () -> {
		return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get());
	}),
	
	AMETHYST(2, 1575, 8.1f, 0.0f, 5, () -> {
		return Ingredient.fromItems(ItemInit.AMETHYST.get());
	}),
	
	SAPPHIRE(2, 1561, 8.1f, 0.0f, 5, () -> {
		return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
	}),
	
	TITANIUM(3, 1999, 8.5f, 0.0f, 3, () -> {
		return Ingredient.fromItems(ItemInit.TITANIUM_INGOT.get());
	}),
	
	ZINC(2, 238, 6.0f, 0.0f, 12, () -> {
		return Ingredient.fromItems(ItemInit.ZINC_INGOT.get());
	}),
	
	COBALT(3, 2016, 8.5f, 0.0f, 3, () -> {
		return Ingredient.fromItems(ItemInit.COBALT_INGOT.get());
	}),
	
	BRASS(2, 369, 6.0f, 0.0f, 11, () -> {
		return Ingredient.fromItems(ItemInit.BRASS_INGOT.get());
	}),
	
	CHROMIUM(3, 298, 6.2f, 0.0f, 12, () -> {
		return Ingredient.fromItems(ItemInit.CHROMIUM_INGOT.get());
	}),
	;
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantibility;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial) 
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantibility = enchantibility;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
