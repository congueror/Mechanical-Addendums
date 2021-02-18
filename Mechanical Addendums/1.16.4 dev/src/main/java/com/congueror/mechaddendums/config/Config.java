package com.congueror.mechaddendums.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class Config {
	public static final String CATEGORY_WORLD = "world";
		public static final String SUBCATEGORY_ORES = "ores";
			public static final String SUBCATEGORY_TIN = "tin";
			public static final String SUBCATEGORY_ALUMINUM = "aluminum";
	
	public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    
    public static ForgeConfigSpec.BooleanValue enableTin;
    public static ForgeConfigSpec.IntValue veinCountTin;
    public static ForgeConfigSpec.IntValue veinSizeTin;
    public static ForgeConfigSpec.IntValue minYTin;
    public static ForgeConfigSpec.IntValue maxYTin;
    
    public static ForgeConfigSpec.BooleanValue enableAluminum;
    public static ForgeConfigSpec.IntValue veinCountAluminum;
    public static ForgeConfigSpec.IntValue veinSizeAluminum;
    public static ForgeConfigSpec.IntValue minYAluminum;
    public static ForgeConfigSpec.IntValue maxYAluminum;
    
    static {
    	ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
        
        SERVER_BUILDER.comment("World Config").push(CATEGORY_WORLD);
        setupOreConfig(SERVER_BUILDER, CLIENT_BUILDER);
        SERVER_BUILDER.pop();
        
        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }
    
    public static void setupOreConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
    	SERVER_BUILDER.comment("Ores Config").push(SUBCATEGORY_ORES);
    		SERVER_BUILDER.comment("Tin Config").push(SUBCATEGORY_TIN);
    		oreEnableConfig(SERVER_BUILDER, enableTin, "TinOre");
    		oreVeinCountConfig(SERVER_BUILDER, veinCountTin, 25, "TinOre");
    		oreVeinSizeConfig(SERVER_BUILDER, veinSizeTin, 8, "TinOre");
    		oreMinYConfig(SERVER_BUILDER, minYTin, 0, "TinOre");
    		oreMaxYConfig(SERVER_BUILDER, maxYTin, 63, "TinOre");
    		SERVER_BUILDER.pop();
    	
    		SERVER_BUILDER.comment("Aluminum Config").push(SUBCATEGORY_ALUMINUM);
    		oreEnableConfig(SERVER_BUILDER, enableAluminum, "AluminumOre");
    		oreVeinCountConfig(SERVER_BUILDER, veinCountAluminum, 18, "AluminumOre");
    		oreVeinSizeConfig(SERVER_BUILDER, veinSizeAluminum, 7, "AluminumOre");
    		oreMinYConfig(SERVER_BUILDER, minYAluminum, 0, "AluminumOre");
    		oreMaxYConfig(SERVER_BUILDER, maxYAluminum, 63, "AluminumOre");
    		SERVER_BUILDER.pop();
    	SERVER_BUILDER.pop();
    }
    
    public static void oreEnableConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.BooleanValue enable, String ore) {
    	enable = SERVER_BUILDER.comment("Enable or disable ore").define("enable" + ore, true);
    }
    
    public static void oreVeinCountConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.IntValue veinCount, int defaultValue, String ore) {
    	veinCount = SERVER_BUILDER.comment("The rarity of ore").defineInRange("veinCount" + ore, defaultValue, 1, 1000);
    }
    
    public static void oreVeinSizeConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.IntValue veinSize, int defaultValue, String ore) {
    	veinSize = SERVER_BUILDER.comment("The size of the ore's veins").defineInRange("veinSize" + ore, defaultValue, 1, 100);
    }
    
    public static void oreMinYConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.IntValue minY, int defaultValue, String ore) {
    	minY = SERVER_BUILDER.comment("Minimum Y value your ore spawns at(MUST be lower than maxY)").defineInRange("minY" + ore, defaultValue, 0, 255);
    }
    
    public static void oreMaxYConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.IntValue maxY, int defaultValue, String ore) {
    	maxY = SERVER_BUILDER.comment("Maximum Y value your ore spawns at(Must be higher than minY)").defineInRange("maxY" + ore, defaultValue, 0, 255);
    }
}
