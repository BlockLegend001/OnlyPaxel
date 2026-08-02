package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends VanillaItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.VANISHING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.AXES)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.PICKAXES)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.SHOVELS)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(Tags.Items.TOOLS)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());

        tag(Tags.Items.MINING_TOOL_TOOLS)
                .add(ModItems.WOODEN_PAXEL.getKey())
                .add(ModItems.STONE_PAXEL.getKey())
                .add(ModItems.COPPER_PAXEL.getKey())
                .add(ModItems.IRON_PAXEL.getKey())
                .add(ModItems.GOLDEN_PAXEL.getKey())
                .add(ModItems.DIAMOND_PAXEL.getKey())
                .add(ModItems.NETHERITE_PAXEL.getKey());
    }
}
