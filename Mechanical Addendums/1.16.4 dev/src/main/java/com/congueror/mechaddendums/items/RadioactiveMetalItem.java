package com.congueror.mechaddendums.items;

import com.congueror.mechaddendums.init.EffectInit;
import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class RadioactiveMetalItem extends ModItem {
	
	public RadioactiveMetalItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(this == ItemInit.URANIUM_INGOT.get()) {
			LivingEntity living = (LivingEntity) entityIn;
			if(entityIn instanceof PlayerEntity && (!(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HAZMAT_HELM.get()) || !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HAZMAT_CHEST.get()) || !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HAZMAT_LEGS.get()) || !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HAZMAT_BOOTS.get())) && !((PlayerEntity) entityIn).isCreative() && worldIn.getGameTime() % 20 == 0 && !worldIn.isRemote) {
				tryRadiationTick(stack, entityIn, living);
			    living.playSound(SoundEvents.ENTITY_GENERIC_BURN, 1.0f, 1.0f);
			}
		}
		else if(this == ItemInit.URANIUM_NUGGET.get()) {
			LivingEntity living = (LivingEntity) entityIn;
			if (entityIn instanceof PlayerEntity && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HAZMAT_HELM.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HAZMAT_CHEST.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HAZMAT_LEGS.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HAZMAT_BOOTS.get()) && !((PlayerEntity) entityIn).isCreative() && worldIn.getGameTime() % 30 == 0 && !worldIn.isRemote) {
				tryRadiationTick(stack, entityIn, living);
			    living.playSound(SoundEvents.ENTITY_GENERIC_BURN, 1.0f, 1.0f);
			}
		}
		else if(this == ItemInit.THORIUM_INGOT.get()) {
			LivingEntity living = (LivingEntity) entityIn;
			if (entityIn instanceof PlayerEntity && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HAZMAT_HELM.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HAZMAT_CHEST.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HAZMAT_LEGS.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HAZMAT_BOOTS.get()) && !((PlayerEntity) entityIn).isCreative() && worldIn.getGameTime() % 200 == 0 && !worldIn.isRemote) {
				tryRadiationTick(stack, entityIn, living);
			    living.playSound(SoundEvents.ENTITY_GENERIC_BURN, 1.0f, 1.0f);
			}
		}
		else if(this == ItemInit.THORIUM_NUGGET.get()) {
			LivingEntity living = (LivingEntity) entityIn;
			if (entityIn instanceof PlayerEntity && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.HAZMAT_HELM.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ItemInit.HAZMAT_CHEST.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ItemInit.HAZMAT_LEGS.get()) && !(((PlayerEntity) entityIn).getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ItemInit.HAZMAT_BOOTS.get()) && !((PlayerEntity) entityIn).isCreative() && worldIn.getGameTime() % 300 == 0 && !worldIn.isRemote) {
				tryRadiationTick(stack, entityIn, living);
			    living.playSound(SoundEvents.ENTITY_GENERIC_BURN, 1.0f, 1.0f);
			}
		}
	}
	
	private void tryRadiationTick(ItemStack stack, Entity entityIn, LivingEntity living) 
	{
	    if (this == ItemInit.URANIUM_INGOT.get() && !living.isPotionActive(EffectInit.RADIATION.get())) 
	    {
	      living.addPotionEffect(new EffectInstance(EffectInit.RADIATION.get(), 130, 3));
	    }
	    else if (this == ItemInit.URANIUM_NUGGET.get() && !living.isPotionActive(EffectInit.RADIATION.get())) 
	    {
	      living.addPotionEffect(new EffectInstance(EffectInit.RADIATION.get(), 1, 3));
	    }
	    else if (this == ItemInit.THORIUM_INGOT.get() && !living.isPotionActive(EffectInit.RADIATION.get())) 
	    {
	      living.addPotionEffect(new EffectInstance(EffectInit.RADIATION.get(), 1, 2));
	    }
	    else if (this == ItemInit.THORIUM_NUGGET.get() && !living.isPotionActive(EffectInit.RADIATION.get())) 
	    {
	      living.addPotionEffect(new EffectInstance(EffectInit.RADIATION.get(), 1, 3));
	    }
	}
}
