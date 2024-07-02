package it.zgiuly.alphamod.datagen;

import it.zgiuly.alphamod.AlphaMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
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
        PackOutput packOutput = generator.getPackOutput();


        if (event.includeClient()) {
            generator.addProvider(event.includeServer(), new ModItemModelProvider(packOutput, existingFileHelper));
            generator.addProvider(event.includeServer(), new ModLanguageProvider(packOutput, "en_us"));
            generator.addProvider(event.includeServer(), new ModBlockStateProvider(packOutput, existingFileHelper));
            generator.addProvider(event.includeServer(), new ModBlockTagProvider(packOutput, event.getLookupProvider(), existingFileHelper));
            generator.addProvider(event.includeServer(), ModLootTableProvider.create(generator.getPackOutput(), event.getLookupProvider()));
            generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, event.getLookupProvider()));
        }
    }
}
