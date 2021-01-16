package com.congueror.mechaddendums.init;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.items.CoalNuggetItem;
import com.congueror.mechaddendums.items.HammerItem;
import com.congueror.mechaddendums.items.HazmatSuitItem;
import com.congueror.mechaddendums.items.LeadDustItem;
import com.congueror.mechaddendums.items.RadioactiveMetalItem;
import com.congueror.mechaddendums.items.TreeTapItem;
import com.congueror.mechaddendums.items.UraniumDustItem;
import com.congueror.mechaddendums.util.ModArmorMaterial;
import com.congueror.mechaddendums.util.ModItemGroups;
import com.congueror.mechaddendums.util.ModItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MechAddendums.MOD_ID);
    
	//Tin
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", ()-> new SwordItem(ModItemTier.TIN, 3, -2.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", ()-> new PickaxeItem(ModItemTier.TIN, 1, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", ()-> new AxeItem(ModItemTier.TIN, 6.0f, -3.3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", ()-> new ShovelItem(ModItemTier.TIN, 1.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", ()-> new HoeItem(ModItemTier.TIN, 0, -2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	
	public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
	//Steel
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", ()-> new SwordItem(ModItemTier.STEEL, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", ()-> new PickaxeItem(ModItemTier.STEEL, 4, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", ()-> new AxeItem(ModItemTier.STEEL, 9.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", ()-> new ShovelItem(ModItemTier.STEEL, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", ()-> new HoeItem(ModItemTier.STEEL, 0, -0f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
	//Aluminum
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", ()-> new SwordItem(ModItemTier.ALUMINUM, 5, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", ()-> new PickaxeItem(ModItemTier.ALUMINUM, 3, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", ()-> new AxeItem(ModItemTier.ALUMINUM, 8.0f, -3.1f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", ()-> new ShovelItem(ModItemTier.ALUMINUM, 3.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", ()-> new HoeItem(ModItemTier.ALUMINUM, 0, -2, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Lead
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
	public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", ()-> new LeadDustItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance).food(MAFoods.LEAD_DUST)));
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword", ()-> new SwordItem(ModItemTier.LEAD, 5, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", ()-> new PickaxeItem(ModItemTier.LEAD, 3, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe", ()-> new AxeItem(ModItemTier.LEAD, 8.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", ()-> new ShovelItem(ModItemTier.LEAD, 3.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe", ()-> new HoeItem(ModItemTier.LEAD, 0, -1, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Copper
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", ()-> new SwordItem(ModItemTier.COPPER, 4, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", ()-> new PickaxeItem(ModItemTier.COPPER, 2, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", ()-> new AxeItem(ModItemTier.COPPER, 7.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", ()-> new ShovelItem(ModItemTier.COPPER, 2.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", ()-> new HoeItem(ModItemTier.COPPER, 0, -2, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> RUBY_DUST = ITEMS.register("ruby_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> RUBY_GEAR = ITEMS.register("ruby_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", ()-> new SwordItem(ModItemTier.RUBY, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", ()-> new PickaxeItem(ModItemTier.RUBY, 4, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", ()-> new AxeItem(ModItemTier.RUBY, 9.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", ()-> new ShovelItem(ModItemTier.RUBY, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", ()-> new HoeItem(ModItemTier.RUBY, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Silver
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", ()-> new SwordItem(ModItemTier.SILVER, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", ()-> new PickaxeItem(ModItemTier.SILVER, 4, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", ()-> new AxeItem(ModItemTier.SILVER, 9.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", ()-> new ShovelItem(ModItemTier.SILVER, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", ()-> new HoeItem(ModItemTier.SILVER, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Lumium
    public static final RegistryObject<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LUMIUM_BLEND = ITEMS.register("lumium_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LUMIUM_DUST = ITEMS.register("lumium_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LUMIUM_GEAR = ITEMS.register("lumium_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    //Nickel
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register("nickel_sword", ()-> new SwordItem(ModItemTier.NICKEL, 4, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe", ()-> new PickaxeItem(ModItemTier.NICKEL, 2, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register("nickel_axe", ()-> new AxeItem(ModItemTier.NICKEL, 7.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register("nickel_shovel", ()-> new ShovelItem(ModItemTier.NICKEL, 2.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register("nickel_hoe", ()-> new HoeItem(ModItemTier.NICKEL, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> NICKEL_HELMET = ITEMS.register("nickel_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_CHESTPLATE = ITEMS.register("nickel_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_LEGGINGS = ITEMS.register("nickel_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> NICKEL_BOOTS = ITEMS.register("nickel_boots", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Invar
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> INVAR_BLEND = ITEMS.register("invar_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> INVAR_DUST = ITEMS.register("invar_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> INVAR_GEAR = ITEMS.register("invar_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> INVAR_SWORD = ITEMS.register("invar_sword", ()-> new SwordItem(ModItemTier.INVAR, 4, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_PICKAXE = ITEMS.register("invar_pickaxe", ()-> new PickaxeItem(ModItemTier.INVAR, 2, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_AXE = ITEMS.register("invar_axe", ()-> new AxeItem(ModItemTier.INVAR, 7.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_SHOVEL = ITEMS.register("invar_shovel", ()-> new ShovelItem(ModItemTier.INVAR, 2.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_HOE = ITEMS.register("invar_hoe", ()-> new HoeItem(ModItemTier.INVAR, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> INVAR_HELMET = ITEMS.register("invar_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_CHESTPLATE = ITEMS.register("invar_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_LEGGINGS = ITEMS.register("invar_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> INVAR_BOOTS = ITEMS.register("invar_boots", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Electrum
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ELECTRUM_BLEND = ITEMS.register("electrum_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register("electrum_sword", ()-> new SwordItem(ModItemTier.ELECTRUM, 5, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe", ()-> new PickaxeItem(ModItemTier.ELECTRUM, 3, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register("electrum_axe", ()-> new AxeItem(ModItemTier.ELECTRUM, 8.0f, -3.1f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel", ()-> new ShovelItem(ModItemTier.ELECTRUM, 3.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register("electrum_hoe", ()-> new HoeItem(ModItemTier.ELECTRUM, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> ELECTRUM_HELMET = ITEMS.register("electrum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ELECTRUM_BOOTS = ITEMS.register("electrum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Platinum
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", ()-> new SwordItem(ModItemTier.PLATINUM, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", ()-> new PickaxeItem(ModItemTier.PLATINUM, 4, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", ()-> new AxeItem(ModItemTier.PLATINUM, 9.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", ()-> new ShovelItem(ModItemTier.PLATINUM, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", ()-> new HoeItem(ModItemTier.PLATINUM, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Enderium
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ENDERIUM_BLEND = ITEMS.register("enderium_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ENDERIUM_GEAR = ITEMS.register("enderium_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> ENDERIUM_SWORD = ITEMS.register("enderium_sword", ()-> new SwordItem(ModItemTier.ENDERIUM, 8, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_PICKAXE = ITEMS.register("enderium_pickaxe", ()-> new PickaxeItem(ModItemTier.ENDERIUM, 6, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_AXE = ITEMS.register("enderium_axe", ()-> new AxeItem(ModItemTier.ENDERIUM, 11.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_SHOVEL = ITEMS.register("enderium_shovel", ()-> new ShovelItem(ModItemTier.ENDERIUM, 6.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_HOE = ITEMS.register("enderium_hoe", ()-> new HoeItem(ModItemTier.ENDERIUM, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> ENDERIUM_HELMET = ITEMS.register("enderium_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_CHESTPLATE = ITEMS.register("enderium_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_LEGGINGS = ITEMS.register("enderium_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ENDERIUM_BOOTS = ITEMS.register("enderium_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Signalum
    public static final RegistryObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SIGNALUM_BLEND = ITEMS.register("signalum_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SIGNALUM_GEAR = ITEMS.register("signalum_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    //Tungsten
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TUNGSTEN_GEAR = ITEMS.register("tungsten_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", ()-> new SwordItem(ModItemTier.TUNGSTEN, 5, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", ()-> new PickaxeItem(ModItemTier.TUNGSTEN, 3, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", ()-> new AxeItem(ModItemTier.TUNGSTEN, 8.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", ()-> new ShovelItem(ModItemTier.TUNGSTEN, 3.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", ()-> new HoeItem(ModItemTier.TUNGSTEN, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Bronze
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRONZE_BLEND = ITEMS.register("bronze_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", ()-> new SwordItem(ModItemTier.BRONZE, 5, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", ()-> new PickaxeItem(ModItemTier.BRONZE, 3, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", ()-> new AxeItem(ModItemTier.BRONZE, 8.0f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", ()-> new ShovelItem(ModItemTier.BRONZE, 3.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", ()-> new HoeItem(ModItemTier.BRONZE, 0, -3, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Amethyst
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> AMETHYST_GEAR = ITEMS.register("amethyst_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", ()-> new SwordItem(ModItemTier.AMETHYST, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", ()-> new PickaxeItem(ModItemTier.AMETHYST, 4, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", ()-> new AxeItem(ModItemTier.AMETHYST, 9.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", ()-> new ShovelItem(ModItemTier.AMETHYST, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", ()-> new HoeItem(ModItemTier.AMETHYST, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SAPPHIRE_GEAR = ITEMS.register("sapphire_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", ()-> new SwordItem(ModItemTier.SAPPHIRE, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", ()-> new PickaxeItem(ModItemTier.SAPPHIRE, 4, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", ()-> new AxeItem(ModItemTier.SAPPHIRE, 9.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", ()-> new ShovelItem(ModItemTier.SAPPHIRE, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", ()-> new HoeItem(ModItemTier.SAPPHIRE, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Opal
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> OPAL_DUST = ITEMS.register("opal_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> OPAL_GEAR = ITEMS.register("opal_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    //Titanium
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TITANIUM_SCRAP = ITEMS.register("titanium_scrap", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TITANIUM_GEAR = ITEMS.register("titanium_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", ()-> new SwordItem(ModItemTier.TITANIUM, 8, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", ()-> new PickaxeItem(ModItemTier.TITANIUM, 2, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", ()-> new AxeItem(ModItemTier.TITANIUM, 11.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", ()-> new ShovelItem(ModItemTier.TITANIUM, 6.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", ()-> new HoeItem(ModItemTier.TITANIUM, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Uranium
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", ()-> new RadioactiveMetalItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", ()-> new RadioactiveMetalItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust", ()-> new UraniumDustItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance).food(MAFoods.URANIUM_DUST)));
    
    //Cobalt
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("cobalt_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> COBALT_GEAR = ITEMS.register("cobalt_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", ()-> new SwordItem(ModItemTier.COBALT, 8, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", ()-> new PickaxeItem(ModItemTier.COBALT, 2, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe", ()-> new AxeItem(ModItemTier.COBALT, 11.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", ()-> new ShovelItem(ModItemTier.COBALT, 6.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", ()-> new HoeItem(ModItemTier.COBALT, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.COBALT, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.COBALT, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.COBALT, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", ()-> 
		new ArmorItem(ModArmorMaterial.COBALT, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Zinc
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> ZINC_GEAR = ITEMS.register("zinc_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> ZINC_SWORD = ITEMS.register("zinc_sword", ()-> new SwordItem(ModItemTier.ZINC, 4, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe", ()-> new PickaxeItem(ModItemTier.ZINC, 2, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_AXE = ITEMS.register("zinc_axe", ()-> new AxeItem(ModItemTier.ZINC, 7.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel", ()-> new ShovelItem(ModItemTier.ZINC, 2.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_HOE = ITEMS.register("zinc_hoe", ()-> new HoeItem(ModItemTier.ZINC, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> ZINC_HELMET = ITEMS.register("zinc_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ZINC, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_CHESTPLATE = ITEMS.register("zinc_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ZINC, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_LEGGINGS = ITEMS.register("zinc_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ZINC, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> ZINC_BOOTS = ITEMS.register("zinc_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ZINC, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Brass
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRASS_BLEND = ITEMS.register("brass_blend", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> BRASS_SWORD = ITEMS.register("brass_sword", ()-> new SwordItem(ModItemTier.BRASS, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe", ()-> new PickaxeItem(ModItemTier.BRASS, 0, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_AXE = ITEMS.register("brass_axe", ()-> new AxeItem(ModItemTier.BRASS, 9.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel", ()-> new ShovelItem(ModItemTier.BRASS, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_HOE = ITEMS.register("brass_hoe", ()-> new HoeItem(ModItemTier.BRASS, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> BRASS_HELMET = ITEMS.register("brass_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.BRASS, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.BRASS, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_LEGGINGS = ITEMS.register("brass_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.BRASS, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> BRASS_BOOTS = ITEMS.register("brass_boots", ()-> 
		new ArmorItem(ModArmorMaterial.BRASS, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Chromium
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> CHROMIUM_DUST = ITEMS.register("chromium_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> CHROMIUM_GEAR = ITEMS.register("chromium_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> CHROMIUM_SWORD = ITEMS.register("chromium_sword", ()-> new SwordItem(ModItemTier.CHROMIUM, 6, -2.4f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_PICKAXE = ITEMS.register("chromium_pickaxe", ()-> new PickaxeItem(ModItemTier.CHROMIUM, 0, -2.8f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_AXE = ITEMS.register("chromium_axe", ()-> new AxeItem(ModItemTier.CHROMIUM, 9.0f, -3.2f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_SHOVEL = ITEMS.register("chromium_shovel", ()-> new ShovelItem(ModItemTier.CHROMIUM, 4.5f, -3f, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_HOE = ITEMS.register("chromium_hoe", ()-> new HoeItem(ModItemTier.CHROMIUM, 0, 0, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
		
	public static final RegistryObject<Item> CHROMIUM_HELMET = ITEMS.register("chromium_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.CHROMIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_CHESTPLATE = ITEMS.register("chromium_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.CHROMIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_LEGGINGS = ITEMS.register("chromium_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.CHROMIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
	public static final RegistryObject<Item> CHROMIUM_BOOTS = ITEMS.register("chromium_boots", ()-> 
		new ArmorItem(ModArmorMaterial.CHROMIUM, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ArmourIG.instance)));
    
    //Thorium
    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot", ()-> new RadioactiveMetalItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget", ()-> new RadioactiveMetalItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> THORIUM_DUST = ITEMS.register("thorium_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    //Other
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", ()-> new CoalNuggetItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> SALTPETRE_DUST = ITEMS.register("saltpetre_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> PYROTHEUM_DUST = ITEMS.register("pyrotheum_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> TREE_TAP = ITEMS.register("tree_tap", ()-> new TreeTapItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance).maxStackSize(1)));
    
    public static final RegistryObject<Item> HAZMAT_HELM = ITEMS.register("hazmat_scuba_helmet", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> HAZMAT_CHEST = ITEMS.register("hazmat_suit", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> HAZMAT_LEGS = ITEMS.register("hazmat_suit_legs", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> HAZMAT_BOOTS = ITEMS.register("rubber_boots", ()-> new HazmatSuitItem(ModArmorMaterial.HAZMAT, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", ()-> new HammerItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance).maxDamage(46)));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", ()-> new HammerItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance).maxDamage(96)));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", ()-> new HammerItem(new Item.Properties().group(ModItemGroups.ItemsIG.instance).maxDamage(146)));
    
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LAPIS_DUST = ITEMS.register("lapis_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> NETHERITE_DUST = ITEMS.register("netherite_dust", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    
    public static final RegistryObject<Item> STONE_GEAR = ITEMS.register("stone_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> GOLD_GEAR = ITEMS.register("gold_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> LAPIS_GEAR = ITEMS.register("lapis_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> QUARTZ_GEAR = ITEMS.register("quartz_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> EMERALD_GEAR = ITEMS.register("emerald_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
    public static final RegistryObject<Item> NETHERITE_GEAR = ITEMS.register("netherite_gear", ()-> new Item(new Item.Properties().group(ModItemGroups.ItemsIG.instance)));
}
