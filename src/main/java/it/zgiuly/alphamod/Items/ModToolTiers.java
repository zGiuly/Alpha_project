package it.zgiuly.alphamod.Items;

import it.zgiuly.alphamod.AlphaMod;
import it.zgiuly.alphamod.util.ModTags;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class ModToolTiers {
    public static final ForgeTier SAPPHIRE_TIER = new ForgeTier(
            5,
            5f,
            4f,
            25, ModTags.Blocks.NEEDS_SAPHIRE_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE::get),
            ModTags.Blocks.INCORRECT_BLOCKS);

}
