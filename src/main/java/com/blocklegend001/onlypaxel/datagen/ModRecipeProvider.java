package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.TOOLS, ModItems.WOODEN_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('P', Items.WOODEN_PICKAXE)
                        .input('S', Items.WOODEN_SHOVEL)
                        .input('A', Items.WOODEN_AXE)
                        .input('#', Items.STICK)
                        .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STONE_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('P', Items.STONE_PICKAXE)
                        .input('S', Items.STONE_SHOVEL)
                        .input('A', Items.STONE_AXE)
                        .input('#', Items.STICK)
                        .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.IRON_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('P', Items.IRON_PICKAXE)
                        .input('S', Items.IRON_SHOVEL)
                        .input('A', Items.IRON_AXE)
                        .input('#', Items.STICK)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('P', Items.GOLDEN_PICKAXE)
                        .input('S', Items.GOLDEN_SHOVEL)
                        .input('A', Items.GOLDEN_AXE)
                        .input('#', Items.STICK)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('P', Items.DIAMOND_PICKAXE)
                        .input('S', Items.DIAMOND_SHOVEL)
                        .input('A', Items.DIAMOND_AXE)
                        .input('#', Items.STICK)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('P', Items.NETHERITE_PICKAXE)
                        .input('S', Items.NETHERITE_SHOVEL)
                        .input('A', Items.NETHERITE_AXE)
                        .input('#', Items.STICK)
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .offerTo(exporter);

                SmithingTransformRecipeJsonBuilder.create(
                                Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.ofItems(ModItems.DIAMOND_PAXEL),
                                Ingredient.ofItems(Items.NETHERITE_INGOT),
                                RecipeCategory.TOOLS,
                                ModItems.NETHERITE_PAXEL
                        )
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of(OnlyPaxel.MODID, "smithing_netherite_paxel")));
            }
        };
    }


    @Override
    public String getName() {
        return "OnlyPaxel Recipes";
    }
}