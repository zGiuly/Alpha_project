package it.zgiuly.alphamod.Items;

import it.zgiuly.alphamod.AlphaMod;
import it.zgiuly.alphamod.util.ModTags;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public enum ModToolTiers implements net.minecraft.world.item.Tier {
    SAPPHIRE_TIER(2500, 10F, 5F, 25, () -> Ingredient.of(ModItems.SAPPHIRE::get), ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOLS);

    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    private final TagKey<Block> incorrectBlocks;

    ModToolTiers(int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial, TagKey<Block> incorrectBlocks) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
        this.incorrectBlocks = incorrectBlocks;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
        return incorrectBlocks;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public @NotNull Tool createToolProperties(TagKey<Block> pBlock) {
        return Tier.super.createToolProperties(pBlock);
    }

    /*
    public static final ForgeTier SAPPHIRE_TIER = new ForgeTier(
            1800,
            15f,
            7f,
            25, ModTags.Blocks.NEEDS_SAPHIRE_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE::get),
            ModTags.Blocks.INCORRECT_BLOCKS);

     */

}
