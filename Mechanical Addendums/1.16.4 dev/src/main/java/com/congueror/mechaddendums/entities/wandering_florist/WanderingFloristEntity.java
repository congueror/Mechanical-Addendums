package com.congueror.mechaddendums.entities.wandering_florist;

import com.congueror.mechaddendums.entities.AbstractWanderer;
import com.congueror.mechaddendums.entities.ModVillagerTrades;
import com.congueror.mechaddendums.init.ItemInit;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class WanderingFloristEntity extends AbstractWanderer {
    public WanderingFloristEntity(EntityType<? extends WanderingFloristEntity> type, World worldIn) {
        super(type, worldIn);
        this.sells = new VillagerTrades.ITrade[]{
                // item, num emeralds to input, num items to output, max uses, priceMultiplierIn
                //new RubyVillagerTrades.ItemsForRubiesTrade(, 40, 1, 1, 1),
        };

        this.buys = new VillagerTrades.ITrade[]{
                // item, num items to input, num emeralds to output, max uses, ex given
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.WHEAT_SEEDS, 4, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.BEETROOT_SEEDS, 4, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.MELON_SEEDS, 4, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.PUMPKIN_SEEDS, 4, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.OAK_SAPLING, 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.BIRCH_SAPLING, 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.ACACIA_SAPLING, 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.JUNGLE_SAPLING, 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.SPRUCE_SAPLING, 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(Items.DARK_OAK_SAPLING, 10, 1, 5, 5),
                
                new ModVillagerTrades.ItemsForEmeraldsTrade(ItemInit.PINEAPPLE_SEEDS.get(), 4, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(ItemInit.COCONUT_SAPLING.get(), 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(ItemInit.RUBBER_SAPLING.get(), 10, 1, 5, 5),
                new ModVillagerTrades.ItemsForEmeraldsTrade(ItemInit.CANDLENUT_SAPLING.get(), 10, 1, 5, 5),
        };
    }
    
	public static AttributeModifierMap.MutableAttribute Attributes() {
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.7D);
	}
}