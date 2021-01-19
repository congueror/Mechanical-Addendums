package com.congueror.mechaddendums.init;

import java.util.HashMap;
import java.util.Map;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.MetalBlock;
import com.congueror.mechaddendums.blocks.ModOreBlock;
import com.congueror.mechaddendums.blocks.RubberLeavesBlock;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorBlock;
import com.congueror.mechaddendums.blocks.trees.RubberTree;
import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("deprecation")
public class BlockInit 
{	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MechAddendums.MOD_ID);
    
	//Ores
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", ()-> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 7f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));  
    
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> LUMIUM_BLOCK = BLOCKS.register("lumium_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    
    public static final RegistryObject<Block> INVAR_BLOCK = BLOCKS.register("invar_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> SULFUR_ORE = BLOCKS.register("sulfur_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> SIGNALUM_BLOCK = BLOCKS.register("signalum_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> OPAL_ORE = BLOCKS.register("opal_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> OPAL_BLOCK = BLOCKS.register("opal_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(6.0f, 12.0f).sound(SoundType.ANCIENT_DEBRIS).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(8f, 15f).sound(SoundType.NETHERITE).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
//    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new MetalBlock
//    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setLightLevel((state) -> {return 4;}).setRequiresTool()));
    
    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
    
    public static final RegistryObject<Block> SALTPETRE_ORE = BLOCKS.register("saltpetre_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(3f, 3f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    
    public static final RegistryObject<Block> BRASS_BLOCK = BLOCKS.register("brass_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> CHROMIUM_ORE = BLOCKS.register("chromium_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = BLOCKS.register("chromium_block", () -> new MetalBlock
    		(Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 6f).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool()));
    
    public static final RegistryObject<Block> THORIUM_ORE = BLOCKS.register("thorium_ore", () -> new ModOreBlock
    		(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3).setRequiresTool()));
    
    //Rubber
    public static final RegistryObject<Block> RUBBER_LOG = BLOCKS.register("rubber_log", () -> new RotatedPillarBlock
    		(Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> RUBBER_WOOD = BLOCKS.register("rubber_wood", () -> new RotatedPillarBlock
    		(Block.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> RUBBER_STRIPPED_LOG = BLOCKS.register("stripped_rubber_log", () -> new RotatedPillarBlock
    		(Block.Properties.from(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> RUBBER_STRIPPED_WOOD = BLOCKS.register("stripped_rubber_wood", () -> new RotatedPillarBlock
    		(Block.Properties.from(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> RUBBER_PLANKS = BLOCKS.register("rubber_planks", () -> new Block
    		(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RUBBER_LEAVES = BLOCKS.register("rubber_leaves", () -> new RubberLeavesBlock
    		(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> RUBBER_SAPLING = BLOCKS.register("rubber_sapling", () -> new SaplingBlock
    		(new RubberTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
	public static final RegistryObject<Block> RUBBER_STAIRS = BLOCKS.register("rubber_stairs", () -> new StairsBlock
    		(BlockInit.RUBBER_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));
	public static final RegistryObject<Block> RUBBER_SLAB = BLOCKS.register("rubber_slab", () -> new SlabBlock
			(Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));
	public static final RegistryObject<Block> RUBBER_FENCE_GATE = BLOCKS.register("rubber_fence_gate", () -> new FenceGateBlock
			(Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));
	
	//Solar Gen
	public static final Map<SolarGenTier, RegistryObject<SolarGeneratorBlock>> SOLAR_GENERATOR = new HashMap<>();
	public static void forLoop() {
		for(SolarGenTier tier : SolarGenTier.values()) {
			SOLAR_GENERATOR.put(tier, BLOCKS.register(tier.getSolarGenName(), () -> new SolarGeneratorBlock(tier)));
		}
	}
    
    //public static final RegistryObject<Block> ALLOY_SMELTER = BLOCKS.register("alloy_smelter", () -> new AlloySmelterBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5.5f, 6.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));
}
