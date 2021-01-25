package com.congueror.mechaddendums.util.enums;

import net.minecraft.util.text.TextFormatting;

public enum SolarGenTier {
	BASIC("basic", 1, TextFormatting.GRAY, "gray"),
	ADVANCED("advanced", 16, TextFormatting.RED, "red"),
	INDUSTRIAL("industrial", 48, TextFormatting.BLUE, "blue"),
	ULTIMATE("ultimate", 80, TextFormatting.LIGHT_PURPLE, "light_purple");

	private final String name;
	private final int energyTier;
	public final TextFormatting color;
	public final String colorName;

	private SolarGenTier(String name, int energyTier, TextFormatting color, String colorName) 
	{
		this.name = name;
		this.energyTier = energyTier;
	    this.color = color;
	    this.colorName = colorName;
	}

	public String getName() { 
		return name; 
	}
	public int getNum() { 
		return energyTier; 
	}
	public TextFormatting getColor() {
		return color;
	}
	public String getNameColor() {
		return colorName;
	}
	
	public String getSolarGenName()
    {
        return "solar_generator_" + name;
    }
}