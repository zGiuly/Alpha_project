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

        //Tools
        addItem(ModItems.SAPPHIRE_HOE, "Sapphire hoe");
        addItem(ModItems.SAPPHIRE_SHOVEL, "Sapphire shovel");
        addItem(ModItems.SAPPHIRE_SWORD, "Sapphire sword");
        addItem(ModItems.SAPPHIRE_PICKAXE, "Sapphire pickaxe");

        addItem(ModItems.SAPPHIRE_EMPOWERED_SWORD, "Sapphire empowered sword");


        add("creativetab.alpha_mod_tab", "Alpha mod tab");
        add("item.alpha_mod.empowered_sword_desc", "Thunderbolt sword");
        add("message.alpha_mod_too_close", "Too close for send thunder on the enemy!");
    }
}
