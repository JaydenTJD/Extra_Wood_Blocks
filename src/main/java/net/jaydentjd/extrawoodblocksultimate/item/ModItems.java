package net.jaydentjd.extrawoodblocksultimate.item;

import net.jaydentjd.extrawoodblocksultimate.ExtraWoodBlocksUltimate;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraWoodBlocksUltimate.MOD_ID);



    public static final RegistryObject<ShieldItem> ACACIA_SHIELD = ITEMS.register("acacia_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> BAMBOO_SHIELD = ITEMS.register("bamboo_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> BIRCH_SHIELD = ITEMS.register("birch_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> CHERRY_SHIELD = ITEMS.register("cherry_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> CRIMSON_SHIELD = ITEMS.register("crimson_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> DARK_OAK_SHIELD = ITEMS.register("dark_oak_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> JUNGLE_SHIELD = ITEMS.register("jungle_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> MANGROVE_SHIELD = ITEMS.register("mangrove_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> OAK_SHIELD = ITEMS.register("oak_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final RegistryObject<ShieldItem> WARPED_SHIELD = ITEMS.register("warped_shield",
            () -> new ShieldItem(new Item.Properties().durability(336)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
