package com.congueror.mechaddendums.util.enums;

import net.minecraft.util.text.TextFormatting;

public enum MachineFrameTier {
	BASIC("basic", TextFormatting.GRAY, "gray"),
	ADVANCED("advanced", TextFormatting.RED, "red"),
	INDUSTRIAL("industrial", TextFormatting.BLUE, "blue"),
	ULTIMATE("ultimate", TextFormatting.LIGHT_PURPLE, "light_purple");
	
	private final String name;
	public final TextFormatting color;
	public final String colorName;

	private MachineFrameTier(String name, TextFormatting color, String colorName) 
	{
		this.name = name;
	    this.color = color;
	    this.colorName = colorName;
	}
	
	public String getName() { 
		return name; 
	}
	public TextFormatting getColor() {
		return color;
	}
	public String getNameColor() {
		return colorName;
	}
	public String getMachineName()
    {
        return "machine_frame_" + name;
    }
}
