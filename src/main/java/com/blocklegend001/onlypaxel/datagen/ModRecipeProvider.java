package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.WOODEN_PICKAXE)
                        .define('S', Items.WOODEN_SHOVEL)
                        .define('A', Items.WOODEN_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_planks", has(ItemTags.PLANKS))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.STONE_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.STONE_PICKAXE)
                        .define('S', Items.STONE_SHOVEL)
                        .define('A', Items.STONE_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.COPPER_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.COPPER_PICKAXE)
                        .define('S', Items.COPPER_SHOVEL)
                        .define('A', Items.COPPER_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.IRON_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.IRON_PICKAXE)
                        .define('S', Items.IRON_SHOVEL)
                        .define('A', Items.IRON_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.GOLDEN_PICKAXE)
                        .define('S', Items.GOLDEN_SHOVEL)
                        .define('A', Items.GOLDEN_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.DIAMOND_PICKAXE)
                        .define('S', Items.DIAMOND_SHOVEL)
                        .define('A', Items.DIAMOND_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL)
                        .pattern("PSA")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('P', Items.NETHERITE_PICKAXE)
                        .define('S', Items.NETHERITE_SHOVEL)
                        .define('A', Items.NETHERITE_AXE)
                        .define('#', Items.STICK)
                        .unlockedBy("has_netherite", has(Items.NETHERITE_INGOT))
                        .save(output);

                SmithingTransformRecipeBuilder
                        .smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(ModItems.DIAMOND_PAXEL),
                                Ingredient.of(Items.NETHERITE_INGOT),
                                RecipeCategory.TOOLS,
                                ModItems.NETHERITE_PAXEL
                        )
                        .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                        .save(output, String.valueOf(Identifier.fromNamespaceAndPath(OnlyPaxel.MODID, "smithing_netherite_paxel")));
            }
        };
    }


    @Override
    public String getName() {
        return "OnlyPaxel Recipes";
    }
}