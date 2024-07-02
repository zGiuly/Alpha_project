package it.zgiuly.alphamod.util;

import it.zgiuly.alphamod.AlphaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SAPHIRE_TOOL = tag("needs_sapphire_tool");

        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOLS = tag("incorrect_blocks_sapphire");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AlphaMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AlphaMod.MOD_ID, name));
        }
    }
}
