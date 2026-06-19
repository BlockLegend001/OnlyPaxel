package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModel(itemModels, ModItems.WOODEN_PAXEL.get());
        itemModel(itemModels, ModItems.STONE_PAXEL.get());
        itemModel(itemModels, ModItems.COPPER_PAXEL.get());
        itemModel(itemModels, ModItems.IRON_PAXEL.get());
        itemModel(itemModels, ModItems.GOLDEN_PAXEL.get());
        itemModel(itemModels, ModItems.DIAMOND_PAXEL.get());
        itemModel(itemModels, ModItems.NETHERITE_PAXEL.get());
    }

    public void itemModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
