package com.congueror.mechaddendums.datagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.congueror.mechaddendums.init.BlockInit;
import com.congueror.mechaddendums.util.enums.MachineFrameTier;
import com.mojang.datafixers.util.Pair;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.conditions.SurvivesExplosion;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

public class LootTableDataGen extends LootTableProvider
{
	//private static final float[] DEFAULT_SAPLING_DROP_RATES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
	//private static final ILootCondition.IBuilder SILK_TOUCH = MatchTool.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))));
	private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> tables = new ArrayList<>();
	//private static final Set<Item> IMMUNE_TO_EXPLOSIONS = Stream.of(Blocks.DRAGON_EGG).map(IItemProvider::asItem).collect(ImmutableSet.toImmutableSet());
	
	public LootTableDataGen(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        tables.clear();
         standardDropTable(BlockInit.ALUMINUM_BLOCK.get());
         standardDropTable(BlockInit.ALUMINUM_ORE.get());
         standardDropTable(BlockInit.AMETHYST_BLOCK.get());
        
//        this.registerLootTable(BlockInit.AMETHYST_ORE.get(), (gem) -> {
//            return droppingItemWithFortune(gem, ItemInit.AMETHYST.get());
 //        });
        
         standardDropTable(BlockInit.BRONZE_BLOCK.get());
         standardDropTable(BlockInit.COBALT_BLOCK.get());
         standardDropTable(BlockInit.COBALT_ORE.get());
         standardDropTable(BlockInit.COPPER_BLOCK.get());
         standardDropTable(BlockInit.COPPER_ORE.get());
         standardDropTable(BlockInit.ELECTRUM_BLOCK.get());
         standardDropTable(BlockInit.ENDERIUM_BLOCK.get());
         standardDropTable(BlockInit.INVAR_BLOCK.get());
         standardDropTable(BlockInit.LEAD_BLOCK.get());
         standardDropTable(BlockInit.LEAD_ORE.get());
         standardDropTable(BlockInit.LUMIUM_BLOCK.get());
         standardDropTable(BlockInit.NICKEL_BLOCK.get());
         standardDropTable(BlockInit.NICKEL_ORE.get());
         standardDropTable(BlockInit.OPAL_BLOCK.get());
        
//        this.registerLootTable(BlockInit.OPAL_ORE.get(), (gem) -> {
//            return droppingItemWithFortune(gem, ItemInit.OPAL.get());
//         });
        
         standardDropTable(BlockInit.PLATINUM_BLOCK.get());
         standardDropTable(BlockInit.PLATINUM_ORE.get());
         standardDropTable(BlockInit.RUBY_BLOCK.get());
//        this.registerLootTable(BlockInit.RUBY_ORE.get(), (gem) -> {
//            return droppingItemWithFortune(gem, ItemInit.RUBY.get());
//         });
        
//        this.registerLootTable(BlockInit.SALTPETRE_ORE.get(), (ore) -> {
//            return droppingWithSilkTouch(ore, withExplosionDecay(ore, ItemLootEntry.builder(ItemInit.SALTPETRE_DUST.get()).acceptFunction(SetCount.builder(RandomValueRange.of(5.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
//         });
        
         standardDropTable(BlockInit.SAPPHIRE_BLOCK.get());
        
//        this.registerLootTable(BlockInit.SAPPHIRE_ORE.get(), (gem) -> {
//            return droppingItemWithFortune(gem, ItemInit.SAPPHIRE.get());
//         });
        
         standardDropTable(BlockInit.SIGNALUM_BLOCK.get());
         standardDropTable(BlockInit.SILVER_BLOCK.get());
         standardDropTable(BlockInit.SILVER_ORE.get());
         standardDropTable(BlockInit.STEEL_BLOCK.get());
        
//        this.registerLootTable(BlockInit.SULFUR_ORE.get(), (ore) -> {
//            return droppingWithSilkTouch(ore, withExplosionDecay(ore, ItemLootEntry.builder(ItemInit.SULFUR_DUST.get()).acceptFunction(SetCount.builder(RandomValueRange.of(5.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
//        });
        
         standardDropTable(BlockInit.TIN_BLOCK.get());
         standardDropTable(BlockInit.TIN_ORE.get());
         standardDropTable(BlockInit.TITANIUM_BLOCK.get());
         standardDropTable(BlockInit.TITANIUM_ORE.get());
         standardDropTable(BlockInit.TUNGSTEN_BLOCK.get());
         standardDropTable(BlockInit.TUNGSTEN_ORE.get());
//         standardDropTable(BlockInit.URANIUM_BLOCK.get());
         standardDropTable(BlockInit.URANIUM_ORE.get());
         standardDropTable(BlockInit.ZINC_BLOCK.get());
         standardDropTable(BlockInit.ZINC_ORE.get());
        
         standardDropTable(BlockInit.RUBBER_LOG.get());
         standardDropTable(BlockInit.RUBBER_WOOD.get());
         standardDropTable(BlockInit.RUBBER_STRIPPED_LOG.get());
         standardDropTable(BlockInit.RUBBER_STRIPPED_WOOD.get());
         standardDropTable(BlockInit.RUBBER_PLANKS.get());
//        this.registerLootTable(BlockInit.RUBBER_LEAVES.get(), (leaves) -> {
//            return droppingWithChancesAndSticks(leaves, BlockInit.RUBBER_SAPLING.get(), DEFAULT_SAPLING_DROP_RATES);
//         });
         standardDropTable(BlockInit.RUBBER_STAIRS.get());
         standardDropTable(BlockInit.RUBBER_SLAB.get());
         standardDropTable(BlockInit.RUBBER_FENCE_GATE.get());
         standardDropTable(BlockInit.RUBBER_BUTTON.get());
         standardDropTable(BlockInit.RUBBER_SAPLING.get());
         standardDropTable(BlockInit.FERMENTING_BARREL.get());
         standardDropTable(BlockInit.BRASS_BLOCK.get());
         standardDropTable(BlockInit.CHROMIUM_BLOCK.get());
         standardDropTable(BlockInit.CHROMIUM_ORE.get());
         standardDropTable(BlockInit.THORIUM_ORE.get());
         standardDropTable(BlockInit.MACHINE_FRAME.get());
         for(MachineFrameTier tier : MachineFrameTier.values())
         standardDropTable(BlockInit.MACHINE_FRAME_TIERED.get(tier).get());
         standardDropTable(BlockInit.COCONUT_SAPLING.get());
         standardDropTable(BlockInit.CANDLENUT_SAPLING.get());
        return tables;
	}
	
	void standardDropTable(Block b) {
        blockTable(b, LootTable.builder().addLootPool(createStandardDrops(b)));
    }

    void blockTable(Block b, LootTable.Builder lootTable) {
        addTable(b.getLootTable(), lootTable, LootParameterSets.BLOCK);
    }

    void addTable(ResourceLocation path, LootTable.Builder lootTable, LootParameterSet paramSet) {
        tables.add(Pair.of(() -> (lootBuilder) -> lootBuilder.accept(path, lootTable), paramSet));
    }
    
    /*void fortuneDropTable(Block b) {
        blockTable(b, LootTable.builder().addLootPool(dropping(b, null, null)));
    }*/

    LootPool.Builder createStandardDrops(IItemProvider itemProvider) {
        return LootPool.builder().rolls(ConstantRange.of(1)).acceptCondition(SurvivesExplosion.builder())
                .addEntry(ItemLootEntry.builder(itemProvider));
    }
    
    /*net.minecraft.loot.LootPool.Builder dropping(IItemProvider itemProvider) {
        return LootPool.builder().rolls(ConstantRange.of(1)).addEntry(ItemLootEntry.builder(itemProvider));
     }*/
    
    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((loc, table) -> LootTableManager.validateLootTable(validationtracker, loc, table));
    }
    
    /*public static class BlockTables extends BlockLootTables
    {
        @Override
        protected void addTables()
        {
            this.registerDropSelfLootTable(BlockInit.ALUMINUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.ALUMINUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.AMETHYST_BLOCK.get());
            
            this.registerLootTable(BlockInit.AMETHYST_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.AMETHYST.get());
             });
            
            this.registerDropSelfLootTable(BlockInit.BRONZE_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.COBALT_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.COBALT_ORE.get());
            this.registerDropSelfLootTable(BlockInit.COPPER_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.COPPER_ORE.get());
            this.registerDropSelfLootTable(BlockInit.ELECTRUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.ENDERIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.INVAR_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.LEAD_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.LEAD_ORE.get());
            this.registerDropSelfLootTable(BlockInit.LUMIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.NICKEL_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.NICKEL_ORE.get());
            this.registerDropSelfLootTable(BlockInit.OPAL_BLOCK.get());
            
            this.registerLootTable(BlockInit.OPAL_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.OPAL.get());
             });
            
            this.registerDropSelfLootTable(BlockInit.PLATINUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.PLATINUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.RUBY_BLOCK.get());
            this.registerLootTable(BlockInit.RUBY_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.RUBY.get());
             });
            
            this.registerLootTable(BlockInit.SALTPETRE_ORE.get(), (ore) -> {
                return droppingWithSilkTouch(ore, withExplosionDecay(ore, ItemLootEntry.builder(ItemInit.SALTPETRE_DUST.get()).acceptFunction(SetCount.builder(RandomValueRange.of(5.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
             });
            
            this.registerDropSelfLootTable(BlockInit.SAPPHIRE_BLOCK.get());
            
            this.registerLootTable(BlockInit.SAPPHIRE_ORE.get(), (gem) -> {
                return droppingItemWithFortune(gem, ItemInit.SAPPHIRE.get());
             });
            
            this.registerDropSelfLootTable(BlockInit.SIGNALUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.SILVER_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.SILVER_ORE.get());
            this.registerDropSelfLootTable(BlockInit.STEEL_BLOCK.get());
            
            this.registerLootTable(BlockInit.SULFUR_ORE.get(), (ore) -> {
                return droppingWithSilkTouch(ore, withExplosionDecay(ore, ItemLootEntry.builder(ItemInit.SULFUR_DUST.get()).acceptFunction(SetCount.builder(RandomValueRange.of(5.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
             });
            
            this.registerDropSelfLootTable(BlockInit.TIN_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.TIN_ORE.get());
            this.registerDropSelfLootTable(BlockInit.TITANIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.TITANIUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.TUNGSTEN_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.TUNGSTEN_ORE.get());
//            this.registerDropSelfLootTable(BlockInit.URANIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.URANIUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.ZINC_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.ZINC_ORE.get());
            
            this.registerDropSelfLootTable(BlockInit.RUBBER_LOG.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_WOOD.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_STRIPPED_LOG.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_STRIPPED_WOOD.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_PLANKS.get());
            this.registerLootTable(BlockInit.RUBBER_LEAVES.get(), (leaves) -> {
                return droppingWithChancesAndSticks(leaves, BlockInit.RUBBER_SAPLING.get(), DEFAULT_SAPLING_DROP_RATES);
             });
            this.registerDropSelfLootTable(BlockInit.RUBBER_STAIRS.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_SLAB.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_FENCE_GATE.get());
            this.registerDropSelfLootTable(BlockInit.RUBBER_SAPLING.get());
            this.registerDropSelfLootTable(BlockInit.BRASS_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.CHROMIUM_BLOCK.get());
            this.registerDropSelfLootTable(BlockInit.CHROMIUM_ORE.get());
            this.registerDropSelfLootTable(BlockInit.THORIUM_ORE.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return ForgeRegistries.BLOCKS.getValues().stream()
                    .filter(b -> b.getRegistryName().getNamespace().equals(MechAddendums.MOD_ID))
                    .collect(Collectors.toList());
        }
    }*/
}
