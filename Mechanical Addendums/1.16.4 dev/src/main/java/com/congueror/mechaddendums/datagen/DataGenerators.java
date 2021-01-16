package com.congueror.mechaddendums.datagen;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.datagen.TagsDataGen.ItemTagsDataGen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MechAddendums.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators 
{
	@SubscribeEvent
    public static void gatherData(GatherDataEvent event) 
	{
		MechAddendums.LOGGER.debug("Starting Server Data Generators");
        DataGenerator generator = event.getGenerator();
        
        if (event.includeServer()) 
        {
        	TagsDataGen.BlockTagsDataGen blockTagsProvider = new TagsDataGen.BlockTagsDataGen(event.getGenerator(), event.getExistingFileHelper());
        	generator.addProvider(new RecipeDataGen(generator));
            generator.addProvider(new LootTableDataGen(generator));
            generator.addProvider(new TagsDataGen.BlockTagsDataGen(generator, event.getExistingFileHelper()));
            generator.addProvider(new ItemTagsDataGen(generator, blockTagsProvider, event.getExistingFileHelper()));
        }
        if (event.includeClient()) 
        {
        	MechAddendums.LOGGER.debug("Starting Client Data Generators");
        	generator.addProvider(new ItemModelDataGen(generator, MechAddendums.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new BlockModelDataGen(generator, MechAddendums.MOD_ID, event.getExistingFileHelper()));
        }
    }
}
