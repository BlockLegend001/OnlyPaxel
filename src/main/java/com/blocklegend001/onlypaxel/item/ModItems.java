package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.custom.Paxel;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OnlyPaxel.MODID);

    public static final DeferredItem<Item> WOODEN_PAXEL = ITEMS.register("wooden_paxel",
            () -> new Paxel(ModToolMaterials.WOODEN_PAXEL, 1, -2.8F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "wooden_paxel")))));

    public static final DeferredItem<Item> STONE_PAXEL = ITEMS.register("stone_paxel",
            () -> new Paxel(ModToolMaterials.STONE_PAXEL, 1, -2.8F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "stone_paxel")))));

    public static final DeferredItem<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new Paxel(ModToolMaterials.IRON_PAXEL, 1, -2.8F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "iron_paxel")))));

    public static final DeferredItem<Item> GOLDEN_PAXEL = ITEMS.register("golden_paxel",
            () -> new Paxel(ModToolMaterials.GOLDEN_PAXEL, 1, -2.8F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "golden_paxel")))));

    public static final DeferredItem<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new Paxel(ModToolMaterials.DIAMOND_PAXEL, 1, -2.8F, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "diamond_paxel")))));

    public static final DeferredItem<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new Paxel(ModToolMaterials.NETHERITE_PAXEL, 1, -2.8F, new Item.Properties().fireResistant()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "netherite_paxel")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
