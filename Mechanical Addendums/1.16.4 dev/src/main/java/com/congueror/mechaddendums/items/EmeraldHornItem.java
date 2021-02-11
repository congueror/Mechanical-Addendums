package com.congueror.mechaddendums.items;

import java.util.Objects;

import com.congueror.mechaddendums.init.EntityInit;
import com.congueror.mechaddendums.init.SoundInit;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class EmeraldHornItem extends Item{
		
	public EmeraldHornItem(Properties properties) {
		super(properties);
	}

	public EntityType<?> getType() {
		return EntityInit.WANDERING_FLORIST.get();
	}
	
	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		if (!(world instanceof ServerWorld)) {
	         return ActionResultType.SUCCESS;
	    } else {
	    	BlockPos blockpos = context.getPos();
	    	Direction direction = context.getFace();
	    	BlockState blockstate = world.getBlockState(blockpos);
			ItemStack itemstack = context.getItem();
        
	    	BlockPos blockpos1;
	    	if (blockstate.getCollisionShape(world, blockpos).isEmpty()) {
	    		blockpos1 = blockpos;
	    	} else {
	    		blockpos1 = blockpos.offset(direction);
	    	}
        
	    	PlayerEntity player = context.getPlayer();
	    	EntityType<?> entitytype = this.getType();
	    	if(itemstack.getDamage() < 1) {
	    		player.playSound(SoundInit.HORN_DISC.get(), SoundCategory.AMBIENT, 5.0f, 1.0f);
	    		if(entitytype.spawn((ServerWorld)world, itemstack, context.getPlayer(), blockpos1, SpawnReason.SPAWN_EGG, true, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP) != null) {
	    			if(!player.abilities.isCreativeMode) {
	    				itemstack.setDamage(1);
	    			}
	    		}
	    	}
		return ActionResultType.CONSUME;
	    }
	}
}
