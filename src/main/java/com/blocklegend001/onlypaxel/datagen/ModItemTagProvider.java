package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ConventionalItemTags.TOOLS)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        valueLookupBuilder(ConventionalItemTags.MINING_TOOL_TOOLS)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);
    }
}
