package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, OnlyPaxel.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());

        tag(ItemTags.VANISHING_ENCHANTABLE)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
    }
}
