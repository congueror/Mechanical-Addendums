package com.congueror.mechaddendums.util.enums;

public enum SolarGenTier {
	BASIC("basic", 10),
	ADVANCED("advanced", 100),
	INDUSTRIAL("industrial", 1000),
	ULTIMATE("ultimate", 10000);

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
	public int getCapacity() { 
		return energyTier; 
	}
	
	public String getSolarGenName()
    {
        return "solar_generator_" + name;
    }
}
