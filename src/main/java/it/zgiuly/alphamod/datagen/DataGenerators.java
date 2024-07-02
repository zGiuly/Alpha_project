package it.zgiuly.alphamod.datagen;

import it.zgiuly.alphamod.AlphaMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AlphaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(true, new ModItemModelProvider(generator.getPackOutput(), existingFileHelper));
            generator.addProvider(true, new ModLanguageProvider(generator.getPackOutput(), "en_us"));
            generator.addProvider(true, new ModBlockStateProvider(generator.getPackOutput(), existingFileHelper));
        }
    }
}
