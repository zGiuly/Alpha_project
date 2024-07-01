package it.zgiuly.alphamod.datagen;

import it.zgiuly.alphamod.AlphaMod;
import it.zgiuly.alphamod.Items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, AlphaMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.SAPPHIRE, "Sapphire");
        addItem(ModItems.RAW_SAPPHIRE, "Raw Sapphire");
        add("creativetab.alpha_mod_tab", "Alpha mod tab");
    }
}
