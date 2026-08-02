package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    private static List<ResourceKey<Item>> keys(Item... items) {
        return Arrays.stream(items)
                .map(item -> item.builtInRegistryHolder().key())
                .collect(Collectors.toList());
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(ItemTags.DURABILITY_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.MINING_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.MINING_LOOT_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.VANISHING_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.AXES).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.PICKAXES).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.SHOVELS).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.BREAKS_DECORATED_POTS).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ConventionalItemTags.TOOLS).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ItemTags.CLUSTER_MAX_HARVESTABLES).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));

        builder(ConventionalItemTags.MINING_TOOL_TOOLS).addAll(keys(
                ModItems.WOODEN_PAXEL,
                ModItems.STONE_PAXEL,
                ModItems.COPPER_PAXEL,
                ModItems.IRON_PAXEL,
                ModItems.GOLDEN_PAXEL,
                ModItems.DIAMOND_PAXEL,
                ModItems.NETHERITE_PAXEL));
    }
}