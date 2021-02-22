package com.congueror.mechaddendums.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreConfig extends Config
{
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

    public static ForgeConfigSpec.BooleanValue enableCopper;
    public static ForgeConfigSpec.IntValue veinCountCopper;
    public static ForgeConfigSpec.IntValue veinSizeCopper;
    public static ForgeConfigSpec.IntValue minYCopper;
    public static ForgeConfigSpec.IntValue maxYCopper;
    
    public static ForgeConfigSpec.BooleanValue enableLead;
    public static ForgeConfigSpec.IntValue veinCountLead;
    public static ForgeConfigSpec.IntValue veinSizeLead;
    public static ForgeConfigSpec.IntValue minYLead;
    public static ForgeConfigSpec.IntValue maxYLead;
    
    public static ForgeConfigSpec.BooleanValue enableSilver;
    public static ForgeConfigSpec.IntValue veinCountSilver;
    public static ForgeConfigSpec.IntValue veinSizeSilver;
    public static ForgeConfigSpec.IntValue minYSilver;
    public static ForgeConfigSpec.IntValue maxYSilver;
    
    public static ForgeConfigSpec.BooleanValue enableNickel;
    public static ForgeConfigSpec.IntValue veinCountNickel;
    public static ForgeConfigSpec.IntValue veinSizeNickel;
    public static ForgeConfigSpec.IntValue minYNickel;
    public static ForgeConfigSpec.IntValue maxYNickel;
    
    public static ForgeConfigSpec.BooleanValue enableSulfur;
    public static ForgeConfigSpec.IntValue veinCountSulfur;
    public static ForgeConfigSpec.IntValue veinSizeSulfur;
    public static ForgeConfigSpec.IntValue minYSulfur;
    public static ForgeConfigSpec.IntValue maxYSulfur;
    
    public static ForgeConfigSpec.BooleanValue enablePlatinum;
    public static ForgeConfigSpec.IntValue veinCountPlatinum;
    public static ForgeConfigSpec.IntValue veinSizePlatinum;
    public static ForgeConfigSpec.IntValue minYPlatinum;
    public static ForgeConfigSpec.IntValue maxYPlatinum;
    
    public static ForgeConfigSpec.BooleanValue enableTungsten;
    public static ForgeConfigSpec.IntValue veinCountTungsten;
    public static ForgeConfigSpec.IntValue veinSizeTungsten;
    public static ForgeConfigSpec.IntValue minYTungsten;
    public static ForgeConfigSpec.IntValue maxYTungsten;
    
    public static ForgeConfigSpec.BooleanValue enableRuby;
    public static ForgeConfigSpec.IntValue veinCountRuby;
    public static ForgeConfigSpec.IntValue veinSizeRuby;
    public static ForgeConfigSpec.IntValue minYRuby;
    public static ForgeConfigSpec.IntValue maxYRuby;
    
    public static ForgeConfigSpec.BooleanValue enableAmethyst;
    public static ForgeConfigSpec.IntValue veinCountAmethyst;
    public static ForgeConfigSpec.IntValue veinSizeAmethyst;
    public static ForgeConfigSpec.IntValue minYAmethyst;
    public static ForgeConfigSpec.IntValue maxYAmethyst;
    
    public static ForgeConfigSpec.BooleanValue enableSapphire;
    public static ForgeConfigSpec.IntValue veinCountSapphire;
    public static ForgeConfigSpec.IntValue veinSizeSapphire;
    public static ForgeConfigSpec.IntValue minYSapphire;
    public static ForgeConfigSpec.IntValue maxYSapphire;
    
    public static ForgeConfigSpec.BooleanValue enableOpal;
    public static ForgeConfigSpec.IntValue veinCountOpal;
    public static ForgeConfigSpec.IntValue veinSizeOpal;
    public static ForgeConfigSpec.IntValue minYOpal;
    public static ForgeConfigSpec.IntValue maxYOpal;
    
    public static ForgeConfigSpec.BooleanValue enableTitanium;
    public static ForgeConfigSpec.IntValue veinCountTitanium;
    public static ForgeConfigSpec.IntValue veinSizeTitanium;
    public static ForgeConfigSpec.IntValue minYTitanium;
    public static ForgeConfigSpec.IntValue maxYTitanium;
    
    public static ForgeConfigSpec.BooleanValue enableUranium;
    public static ForgeConfigSpec.IntValue veinCountUranium;
    public static ForgeConfigSpec.IntValue veinSizeUranium;
    public static ForgeConfigSpec.IntValue minYUranium;
    public static ForgeConfigSpec.IntValue maxYUranium;
    
    public static ForgeConfigSpec.BooleanValue enableCobalt;
    public static ForgeConfigSpec.IntValue veinCountCobalt;
    public static ForgeConfigSpec.IntValue veinSizeCobalt;
    public static ForgeConfigSpec.IntValue minYCobalt;
    public static ForgeConfigSpec.IntValue maxYCobalt;
    
    public static ForgeConfigSpec.BooleanValue enableZinc;
    public static ForgeConfigSpec.IntValue veinCountZinc;
    public static ForgeConfigSpec.IntValue veinSizeZinc;
    public static ForgeConfigSpec.IntValue minYZinc;
    public static ForgeConfigSpec.IntValue maxYZinc;
    
    public static ForgeConfigSpec.BooleanValue enableSaltpetre;
    public static ForgeConfigSpec.IntValue veinCountSaltpetre;
    public static ForgeConfigSpec.IntValue veinSizeSaltpetre;
    public static ForgeConfigSpec.IntValue minYSaltpetre;
    public static ForgeConfigSpec.IntValue maxYSaltpetre;
    
    public static ForgeConfigSpec.BooleanValue enableChromium;
    public static ForgeConfigSpec.IntValue veinCountChromium;
    public static ForgeConfigSpec.IntValue veinSizeChromium;
    public static ForgeConfigSpec.IntValue minYChromium;
    public static ForgeConfigSpec.IntValue maxYChromium;
    
    public static ForgeConfigSpec.BooleanValue enableThorium;
    public static ForgeConfigSpec.IntValue veinCountThorium;
    public static ForgeConfigSpec.IntValue veinSizeThorium;
    public static ForgeConfigSpec.IntValue minYThorium;
    public static ForgeConfigSpec.IntValue maxYThorium;
	
	public static void setupOreConfig(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
    	SERVER_BUILDER.comment("Ores Config").push(SUBCATEGORY_ORES);
    		SERVER_BUILDER.comment("Tin Config").push(SUBCATEGORY_TIN);
    		enableTin = oreEnableConfig(SERVER_BUILDER, "TinOre");
    		veinCountTin = oreVeinCountConfig(SERVER_BUILDER, 25, "TinOre");
    		veinSizeTin = oreVeinSizeConfig(SERVER_BUILDER, 8, "TinOre");
    		minYTin = oreMinYConfig(SERVER_BUILDER, 0, "TinOre");
    		maxYTin = oreMaxYConfig(SERVER_BUILDER, 63, "TinOre");
    		SERVER_BUILDER.pop();
    	
    		SERVER_BUILDER.comment("Aluminum Config").push(SUBCATEGORY_ALUMINUM);
    		enableAluminum = oreEnableConfig(SERVER_BUILDER, "AluminumOre");
    		veinCountAluminum = oreVeinCountConfig(SERVER_BUILDER, 18, "AluminumOre");
    		veinSizeAluminum = oreVeinSizeConfig(SERVER_BUILDER, 7, "AluminumOre");
    		minYAluminum = oreMinYConfig(SERVER_BUILDER, 0, "AluminumOre");
    		maxYAluminum = oreMaxYConfig(SERVER_BUILDER, 63, "AluminumOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Copper Config").push(SUBCATEGORY_COPPER);
    		enableCopper = oreEnableConfig(SERVER_BUILDER, "CopperOre");
    		veinCountCopper = oreVeinCountConfig(SERVER_BUILDER, 20, "CopperOre");
    		veinSizeCopper = oreVeinSizeConfig(SERVER_BUILDER, 8, "CopperOre");
    		minYCopper = oreMinYConfig(SERVER_BUILDER, 0, "CopperOre");
    		maxYCopper = oreMaxYConfig(SERVER_BUILDER, 63, "CopperOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Lead Config").push(SUBCATEGORY_LEAD);
    		enableLead = oreEnableConfig(SERVER_BUILDER, "LeadOre");
    		veinCountLead = oreVeinCountConfig(SERVER_BUILDER, 4, "LeadOre");
    		veinSizeLead = oreVeinSizeConfig(SERVER_BUILDER, 7, "LeadOre");
    		minYLead = oreMinYConfig(SERVER_BUILDER, 0, "LeadOre");
    		maxYLead = oreMaxYConfig(SERVER_BUILDER, 31, "LeadOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Silver Config").push(SUBCATEGORY_SILVER);
    		enableSilver = oreEnableConfig(SERVER_BUILDER, "SilverOre");
    		veinCountSilver = oreVeinCountConfig(SERVER_BUILDER, 3, "SilverOre");
    		veinSizeSilver = oreVeinSizeConfig(SERVER_BUILDER, 7, "SilverOre");
    		minYSilver = oreMinYConfig(SERVER_BUILDER, 0, "SilverOre");
    		maxYSilver = oreMaxYConfig(SERVER_BUILDER, 16, "SilverOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Nickel Config").push(SUBCATEGORY_NICKEL);
    		enableNickel = oreEnableConfig(SERVER_BUILDER, "NickelOre");
    		veinCountNickel = oreVeinCountConfig(SERVER_BUILDER, 4, "NickelOre");
    		veinSizeNickel = oreVeinSizeConfig(SERVER_BUILDER, 7, "NickelOre");
    		minYNickel = oreMinYConfig(SERVER_BUILDER, 0, "NickelOre");
    		maxYNickel = oreMaxYConfig(SERVER_BUILDER, 31, "NickelOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Sulfur Config").push(SUBCATEGORY_SULFUR);
    		enableSulfur = oreEnableConfig(SERVER_BUILDER, "SulfurOre");
    		veinCountSulfur = oreVeinCountConfig(SERVER_BUILDER, 4, "SulfurOre");
    		veinSizeSulfur = oreVeinSizeConfig(SERVER_BUILDER, 3, "SulfurOre");
    		minYSulfur = oreMinYConfig(SERVER_BUILDER, 0, "SulfurOre");
    		maxYSulfur = oreMaxYConfig(SERVER_BUILDER, 100, "SulfurOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Platinum Config").push(SUBCATEGORY_PLATINUM);
    		enablePlatinum = oreEnableConfig(SERVER_BUILDER, "PlatinumOre");
    		veinCountPlatinum = oreVeinCountConfig(SERVER_BUILDER, 1, "PlatinumOre");
    		veinSizePlatinum = oreVeinSizeConfig(SERVER_BUILDER, 6, "PlatinumOre");
    		minYPlatinum = oreMinYConfig(SERVER_BUILDER, 0, "PlatinumOre");
    		maxYPlatinum = oreMaxYConfig(SERVER_BUILDER, 8, "PlatinumOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Tungsten Config").push(SUBCATEGORY_TUNGSTEN);
    		enableTungsten = oreEnableConfig(SERVER_BUILDER, "TungstenOre");
    		veinCountTungsten = oreVeinCountConfig(SERVER_BUILDER, 2, "TungstenOre");
    		veinSizeTungsten = oreVeinSizeConfig(SERVER_BUILDER, 6, "TungstenOre");
    		minYTungsten = oreMinYConfig(SERVER_BUILDER, 0, "TungstenOre");
    		maxYTungsten = oreMaxYConfig(SERVER_BUILDER, 16, "TungstenOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Ruby Config").push(SUBCATEGORY_RUBY);
    		enableRuby = oreEnableConfig(SERVER_BUILDER, "RubyOre");
    		veinCountRuby = oreVeinCountConfig(SERVER_BUILDER, 1, "RubyOre");
    		veinSizeRuby = oreVeinSizeConfig(SERVER_BUILDER, 3, "RubyOre");
    		minYRuby = oreMinYConfig(SERVER_BUILDER, 0, "RubyOre");
    		maxYRuby = oreMaxYConfig(SERVER_BUILDER, 18, "RubyOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Amethyst Config").push(SUBCATEGORY_AMETHYST);
    		enableAmethyst = oreEnableConfig(SERVER_BUILDER, "AmethystOre");
    		veinCountAmethyst = oreVeinCountConfig(SERVER_BUILDER, 1, "AmethystOre");
    		veinSizeAmethyst = oreVeinSizeConfig(SERVER_BUILDER, 6, "AmethystOre");
    		minYAmethyst = oreMinYConfig(SERVER_BUILDER, 0, "AmethystOre");
    		maxYAmethyst = oreMaxYConfig(SERVER_BUILDER, 16, "AmethystOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Sapphire Config").push(SUBCATEGORY_SAPPHIRE);
    		enableSapphire = oreEnableConfig(SERVER_BUILDER, "SapphireOre");
    		veinCountSapphire = oreVeinCountConfig(SERVER_BUILDER, 2, "SapphireOre");
    		veinSizeSapphire = oreVeinSizeConfig(SERVER_BUILDER, 8, "SapphireOre");
    		minYSapphire = oreMinYConfig(SERVER_BUILDER, 0, "SapphireOre");
    		maxYSapphire = oreMaxYConfig(SERVER_BUILDER, 16, "SapphireOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Opal Config").push(SUBCATEGORY_OPAL);
    		enableOpal = oreEnableConfig(SERVER_BUILDER, "OpalOre");
    		veinCountOpal = oreVeinCountConfig(SERVER_BUILDER, 1, "OpalOre");
    		veinSizeOpal = oreVeinSizeConfig(SERVER_BUILDER, 6, "OpalOre");
    		minYOpal = oreMinYConfig(SERVER_BUILDER, 0, "OpalOre");
    		maxYOpal = oreMaxYConfig(SERVER_BUILDER, 9, "OpalOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Titanium Config").push(SUBCATEGORY_TITANIUM);
    		enableTitanium = oreEnableConfig(SERVER_BUILDER, "TitaniumOre");
    		veinCountTitanium = oreVeinCountConfig(SERVER_BUILDER, 1, "TitaniumOre");
    		veinSizeTitanium = oreVeinSizeConfig(SERVER_BUILDER, 7, "TitaniumOre");
    		minYTitanium = oreMinYConfig(SERVER_BUILDER, 0, "TitaniumOre");
    		maxYTitanium = oreMaxYConfig(SERVER_BUILDER, 7, "TitaniumOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Uranium Config").push(SUBCATEGORY_URANIUM);
    		enableUranium = oreEnableConfig(SERVER_BUILDER, "UraniumOre");
    		veinCountUranium = oreVeinCountConfig(SERVER_BUILDER, 1, "UraniumOre");
    		veinSizeUranium = oreVeinSizeConfig(SERVER_BUILDER, 7, "UraniumOre");
    		minYUranium = oreMinYConfig(SERVER_BUILDER, 0, "UraniumOre");
    		maxYUranium = oreMaxYConfig(SERVER_BUILDER, 16, "UraniumOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Cobalt Config").push(SUBCATEGORY_COBALT);
    		enableCobalt = oreEnableConfig(SERVER_BUILDER, "CobaltOre");
    		veinCountCobalt = oreVeinCountConfig(SERVER_BUILDER, 2, "CobaltOre");
    		veinSizeCobalt = oreVeinSizeConfig(SERVER_BUILDER, 7, "CobaltOre");
    		minYCobalt = oreMinYConfig(SERVER_BUILDER, 0, "CobaltOre");
    		maxYCobalt = oreMaxYConfig(SERVER_BUILDER, 8, "CobaltOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Zinc Config").push(SUBCATEGORY_ZINC);
    		enableZinc = oreEnableConfig(SERVER_BUILDER, "ZincOre");
    		veinCountZinc = oreVeinCountConfig(SERVER_BUILDER, 8, "ZincOre");
    		veinSizeZinc = oreVeinSizeConfig(SERVER_BUILDER, 7, "ZincOre");
    		minYZinc = oreMinYConfig(SERVER_BUILDER, 0, "ZincOre");
    		maxYZinc = oreMaxYConfig(SERVER_BUILDER, 32, "ZincOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Saltpetre Config").push(SUBCATEGORY_SALTPETRE);
    		enableSaltpetre = oreEnableConfig(SERVER_BUILDER, "SaltpetreOre");
    		veinCountSaltpetre = oreVeinCountConfig(SERVER_BUILDER, 2, "SaltpetreOre");
    		veinSizeSaltpetre = oreVeinSizeConfig(SERVER_BUILDER, 3, "SaltpetreOre");
    		minYSaltpetre = oreMinYConfig(SERVER_BUILDER, 0, "SaltpetreOre");
    		maxYSaltpetre = oreMaxYConfig(SERVER_BUILDER, 100, "SaltpetreOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Chromium Config").push(SUBCATEGORY_CHROMIUM);
    		enableChromium = oreEnableConfig(SERVER_BUILDER, "ChromiumOre");
    		veinCountChromium = oreVeinCountConfig(SERVER_BUILDER, 6, "ChromiumOre");
    		veinSizeChromium = oreVeinSizeConfig(SERVER_BUILDER, 7, "ChromiumOre");
    		minYChromium = oreMinYConfig(SERVER_BUILDER, 0, "ChromiumOre");
    		maxYChromium = oreMaxYConfig(SERVER_BUILDER, 22, "ChromiumOre");
    		SERVER_BUILDER.pop();
    		
    		SERVER_BUILDER.comment("Thorium Config").push(SUBCATEGORY_THORIUM);
    		enableThorium = oreEnableConfig(SERVER_BUILDER, "ThoriumOre");
    		veinCountThorium = oreVeinCountConfig(SERVER_BUILDER, 1, "ThoriumOre");
    		veinSizeThorium = oreVeinSizeConfig(SERVER_BUILDER, 7, "ThoriumOre");
    		minYThorium = oreMinYConfig(SERVER_BUILDER, 0, "ThoriumOre");
    		maxYThorium = oreMaxYConfig(SERVER_BUILDER, 8, "ThoriumOre");
    		SERVER_BUILDER.pop();
    	SERVER_BUILDER.pop();
    }
}
