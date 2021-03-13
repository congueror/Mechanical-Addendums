package com.congueror.mechaddendums.items;

import java.util.Objects;
import java.util.Random;

import com.congueror.mechaddendums.entities.wandering_florist.WanderingFloristEntity;
import com.congueror.mechaddendums.init.EntityInit;
import com.congueror.mechaddendums.init.SoundInit;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class EmeraldHornItem extends ModItem {

	public EmeraldHornItem(Properties properties) {
		super(properties);
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 100;
	}

	public EntityType<?> getType() {
		return EntityInit.WANDERING_FLORIST.get();
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (itemstack.getDamage() < 1) {
			playerIn.setActiveHand(handIn);
		}
		return ActionResult.resultConsume(itemstack);
	}

	static Random random = new Random();

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
		PlayerEntity player = ((PlayerEntity) entityLiving);
		BlockPos pos = entityLiving.getPosition();
		if (stack.getDamage() < 1) {
			player.playSound(SoundInit.HORN_DISC.get(), SoundCategory.AMBIENT, 5.0f, 1.0f);
			if (worldIn instanceof ServerWorld) {
				float degreesMax = 360.0f;
				float degreesMin = 0.0f;
				float degrees = degreesMin + random.nextFloat() * (degreesMax - degreesMin);

				int max = 20;
				int min = 3;
				int radius = (int) ((Math.random() * (max - min)) + min);

				double x = pos.getX();
				double z = pos.getZ();
				double deltaX = Math.cos(Math.toRadians(degrees)) * radius;
				double deltaZ = -Math.sin(Math.toRadians(degrees)) * radius;
				double finalX = x + deltaX;
				double finalZ = z + deltaZ;

				EntityType<? extends WanderingFloristEntity> animal = EntityInit.WANDERING_FLORIST.get();
				for (int i = 0; i < 255; i++) {
					BlockPos pos1 = new BlockPos(finalX, pos.getY() + i, finalZ);
					if (worldIn.getBlockState(pos.down()).getBlock() != Blocks.STRUCTURE_VOID) {
						worldIn.addEntity(Objects.requireNonNull(animal.spawn(((ServerWorld) worldIn), null, null,
								pos.toMutable().setPos(finalX, pos1.getY() + i + 1, finalZ), SpawnReason.SPAWNER, true,
								true)));
						if (!player.abilities.isCreativeMode) {
							itemstack.setDamage(5000);
						}
						break;
					}
				}
			}
		}
		return itemstack;
	}
}