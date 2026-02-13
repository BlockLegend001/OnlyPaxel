package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends VanillaItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.VANISHING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(Tags.Items.TOOLS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(Tags.Items.MINING_TOOL_TOOLS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.COPPER_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
    }
}
