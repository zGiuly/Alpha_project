package it.zgiuly.alphamod.datagen;

import it.zgiuly.alphamod.AlphaMod;
import it.zgiuly.alphamod.Items.ModItems;
import it.zgiuly.alphamod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, AlphaMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        //Items
        addItem(ModItems.SAPPHIRE, "Sapphire");
        addItem(ModItems.RAW_SAPPHIRE, "Raw Sapphire");

        //Blocks
        addBlock(ModBlocks.SAPPHIRE_BLOCK, "Sapphire block");
        addBlock(ModBlocks.RAW_SAPPHIRE_BLOCK, "Raw Sapphire");

        //Ores
        addBlock(ModBlocks.END_SAPPHIRE_ORE, "Endstone Sapphire ore");
        addBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate sapphire ore");
        addBlock(ModBlocks.SAPPHIRE_ORE, "Sapphire ore");
        addBlock(ModBlocks.NETHER_SAPPHIRE_ORE, "Nether Sapphire ore");


        add("creativetab.alpha_mod_tab", "Alpha mod tab");
    }
}
