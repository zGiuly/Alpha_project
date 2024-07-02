package it.zgiuly.alphamod.Items;

import it.zgiuly.alphamod.AlphaMod;
import it.zgiuly.alphamod.Items.custom.EmpoweredSapphireSword;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlphaMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE  = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE  = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SWORD  = ITEMS.register("sapphire_sword", () -> new SwordItem(ModToolTiers.SAPPHIRE_TIER, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModToolTiers.SAPPHIRE_TIER, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModToolTiers.SAPPHIRE_TIER, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModToolTiers.SAPPHIRE_TIER, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_EMPOWERED_SWORD = ITEMS.register("sapphire_empowered_sword", () -> new EmpoweredSapphireSword(new Item.Properties()));





    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
