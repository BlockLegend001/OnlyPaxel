package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.custom.Paxel;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_PAXEL = registerItem("wooden_paxel",
            new Paxel(ModToolMaterials.WOODEN_PAXEL, 1, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyPaxel.MODID, "wooden_paxel")))));

    public static final Item STONE_PAXEL = registerItem("stone_paxel",
            new Paxel(ModToolMaterials.STONE_PAXEL, 1, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyPaxel.MODID, "stone_paxel")))));

    public static final Item IRON_PAXEL = registerItem("iron_paxel",
            new Paxel(ModToolMaterials.IRON_PAXEL, 1, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyPaxel.MODID, "iron_paxel")))));

    public static final Item GOLDEN_PAXEL = registerItem("golden_paxel",
            new Paxel(ModToolMaterials.GOLDEN_PAXEL, 1, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyPaxel.MODID, "golden_paxel")))));

    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel",
            new Paxel(ModToolMaterials.DIAMOND_PAXEL, 1, -2.8F, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyPaxel.MODID, "diamond_paxel")))));

    public static final Item NETHERITE_PAXEL = registerItem("netherite_paxel",
            new Paxel(ModToolMaterials.NETHERITE_PAXEL, 1, -2.8F, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OnlyPaxel.MODID, "netherite_paxel")))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OnlyPaxel.MODID, name), item);
    }

    public static void registerModItems() {
        OnlyPaxel.LOGGER.info("Registering Mod Items for " + OnlyPaxel.MODID);
    }
}
