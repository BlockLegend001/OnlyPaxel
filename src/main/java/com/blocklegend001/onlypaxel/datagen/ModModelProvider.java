package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.world.level.block.Block;

import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    private final PackOutput.PathProvider itemInfoPathProvider;
    private final PackOutput.PathProvider modelPathProvider;
    protected final String modId;

    public ModModelProvider(PackOutput packOutput, String modId) {
        super(packOutput);
        this.itemInfoPathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "items");
        this.modelPathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "models");
        this.modId = modId;
    }

    protected void registerModels(BlockModelGenerators blockModelGenerators, ItemModelGenerators itemModelGenerators) {
        itemModel(itemModelGenerators, ModItems.WOODEN_PAXEL.get());
        itemModel(itemModelGenerators, ModItems.STONE_PAXEL.get());
        itemModel(itemModelGenerators, ModItems.IRON_PAXEL.get());
        itemModel(itemModelGenerators, ModItems.GOLDEN_PAXEL.get());
        itemModel(itemModelGenerators, ModItems.DIAMOND_PAXEL.get());
        itemModel(itemModelGenerators, ModItems.NETHERITE_PAXEL.get());
    }

    public void itemModel(ItemModelGenerators itemModels, Item item) {
        this.itemModel(itemModels, item, ModelTemplates.FLAT_ITEM);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item, ModelTemplate template) {
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
        ResourceLocation textureLoc = ResourceLocation.fromNamespaceAndPath(itemId.getNamespace(), "item/" + itemId.getPath());
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.LAYER0, textureLoc);
        itemModels.itemModelOutput.accept(item, new BlockModelWrapper.Unbaked(template.create(item, textureMapping, itemModels.modelOutput), Collections.emptyList()));
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output) {
        ItemInfoCollector itemCollector = new ItemInfoCollector(this::getKnownItems);
        BlockStateGeneratorCollector blockStateCollector = new BlockStateGeneratorCollector(this::getKnownBlocks);
        SimpleModelCollector simpleModelCollector = new SimpleModelCollector();
        this.registerModels(new BlockModelGenerators(blockStateCollector, itemCollector, simpleModelCollector), new ItemModelGenerators(itemCollector, simpleModelCollector));
        blockStateCollector.validate();
        itemCollector.finalizeAndValidate();
        return CompletableFuture.allOf(
                simpleModelCollector.save(output, this.modelPathProvider),
                itemCollector.save(output, this.itemInfoPathProvider)
        );
    }

    @Override
    protected Stream<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter((block) -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter((key) -> key.getNamespace().equals(this.modId))
                        .isPresent());
    }

    @Override
    protected Stream<Item> getKnownItems() {
        return BuiltInRegistries.ITEM.stream()
                .filter((item) -> Optional.of(BuiltInRegistries.ITEM.getKey(item))
                        .filter((key) -> key.getNamespace().equals(this.modId))
                        .isPresent());
    }
}
