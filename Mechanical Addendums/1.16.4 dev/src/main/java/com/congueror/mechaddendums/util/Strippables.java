package com.congueror.mechaddendums.util;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.init.BlockInit;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;

public class Strippables {
	//Credits to BYG
	public static void strippableBlock(Block log, Block strippable) {
        AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
        AxeItem.BLOCK_STRIPPING_MAP.put(log, strippable);
    }
	
	public static void strippableLogs() {
        MechAddendums.LOGGER.debug("MechAddendums: Adding strippable Blocks...");

        strippableBlock(BlockInit.RUBBER_LOG.get(), BlockInit.RUBBER_STRIPPED_LOG.get());
        
        MechAddendums.LOGGER.debug("MechAddendums: Added strippable Blocks...");
	}
}
