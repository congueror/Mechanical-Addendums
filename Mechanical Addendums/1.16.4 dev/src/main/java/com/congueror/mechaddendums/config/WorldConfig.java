package com.congueror.mechaddendums.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class WorldConfig extends Config
{
	public static ForgeConfigSpec.BooleanValue enableSalt;
    
    public static ForgeConfigSpec.DoubleValue rubberChance;
    public static ForgeConfigSpec.DoubleValue coconutChance;
    public static ForgeConfigSpec.DoubleValue candlenutChance;
	
	public static void setupTreeConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
    	SERVER_BUILDER.comment("Trees Config").push(SUBCATEGORY_TREES);
    	rubberChance = treeChance(SERVER_BUILDER, 0.1f, "rubberTree");
    	coconutChance = treeChance(SERVER_BUILDER, 1.0f, "coconutTree");
    	candlenutChance = treeChance(SERVER_BUILDER, 0.1f, "candlenutTree");
    	SERVER_BUILDER.pop();
    }
    
    public static void setupFeatureConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
    	SERVER_BUILDER.comment("Other Features Config").push(SUBCATEGORY_FEATURES);
    	enableSalt = oreEnableConfig(SERVER_BUILDER, "Salt");
    	SERVER_BUILDER.pop();
    }
}
