package com.congueror.mechaddendums.util.enums;

public enum SolarGenTier {
	BASIC("basic", 1),
	ADVANCED("advanced", 16),
	INDUSTRIAL("industrial", 48),
	ULTIMATE("ultimate", 80);

	private final String name;
	private final int energyTier;

	private SolarGenTier(String name, int energyTier) 
	{
		
		this.name = name;
		this.energyTier = energyTier;
	}

	public String getName() { 
		return name; 
	}
	public int getNum() { 
		return energyTier; 
	}
	
	public String getSolarGenName()
    {
        return "solar_generator_" + name;
    }
}
