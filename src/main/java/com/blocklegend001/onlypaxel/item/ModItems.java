package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.custom.Paxel;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {

    public static final Item WOODEN_PAXEL = registerItem("wooden_paxel", properties -> 
            new Paxel(ModToolMaterials.WOODEN_PAXEL, 1, -2.8F, properties));

    public static final Item STONE_PAXEL = registerItem("stone_paxel", properties ->
            new Paxel(ModToolMaterials.STONE_PAXEL, 1, -2.8F, properties));

    public static final Item COPPER_PAXEL = registerItem("copper_paxel", properties ->
            new Paxel(ModToolMaterials.COPPER_PAXEL, 1, -2.8F, properties));

    public static final Item IRON_PAXEL = registerItem("iron_paxel", properties ->
            new Paxel(ModToolMaterials.IRON_PAXEL, 1, -2.8F, properties));

    public static final Item GOLDEN_PAXEL = registerItem("golden_paxel", properties ->
            new Paxel(ModToolMaterials.GOLDEN_PAXEL, 1, -2.8F, properties));

    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel", properties ->
            new Paxel(ModToolMaterials.DIAMOND_PAXEL, 1, -2.8F, properties));

    public static final Item NETHERITE_PAXEL = registerItem("netherite_paxel", properties ->
            new Paxel(ModToolMaterials.NETHERITE_PAXEL, 1, -2.8F, properties.fireResistant()));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(OnlyPaxel.MODID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(OnlyPaxel.MODID, name)))));
    }


    public static void registerModItems() {
        OnlyPaxel.LOGGER.info("Registering Mod Items for " + OnlyPaxel.MODID);
    }
}
