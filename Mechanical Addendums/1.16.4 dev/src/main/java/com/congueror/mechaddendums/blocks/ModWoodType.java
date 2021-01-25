package com.congueror.mechaddendums.blocks;

import java.util.Set;
import java.util.stream.Stream;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.WoodType;

public class ModWoodType extends WoodType
{
	private static final Set<WoodType> VALUES = new ObjectArraySet<>();
	public static final WoodType RUBBER = register(new ModWoodType("rubber"));
	private final String name;
	
	protected ModWoodType(String nameIn) {
		super(nameIn);
		this.name = nameIn;
	}

	private static WoodType register(WoodType woodTypeIn) {
	      VALUES.add(woodTypeIn);
	      return woodTypeIn;
	   }

	   public static Stream<WoodType> getValues() {
	      return VALUES.stream();
	   }

	   public String getName() {
	      return this.name;
	   }
}
