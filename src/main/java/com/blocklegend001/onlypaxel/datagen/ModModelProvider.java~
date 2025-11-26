package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModModelProvider extends ItemModelProvider {
    public ModModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OnlyPaxel.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_PAXEL);
        handheldItem(ModItems.STONE_PAXEL);
        handheldItem(ModItems.IRON_PAXEL);
        handheldItem(ModItems.GOLDEN_PAXEL);
        handheldItem(ModItems.DIAMOND_PAXEL);
        handheldItem(ModItems.NETHERITE_PAXEL);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID,"item/" + item.getId().getPath()));
    }
}
