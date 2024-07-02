package it.zgiuly.alphamod.Items;

import it.zgiuly.alphamod.AlphaMod;
import it.zgiuly.alphamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlphaMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> ALPHA_MOD_TAB = CREATIVE_MODE_TABS.register("alpha_mod_tab", ()-> CreativeModeTab.builder().
            icon(()->new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.alpha_mod_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                for (RegistryObject<Item> entry : ModItems.ITEMS.getEntries()) {
                    output.accept(entry.get());
                }
                for (RegistryObject<Block> entry : ModBlocks.BLOCKS.getEntries()) {
                    output.accept(entry.get());
                }
            })
            .build());


    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
