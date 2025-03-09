package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }
    
    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(packOutput, providerCompletableFuture);
        }
        
        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }
        
        @Override
        public String getName() {
            return "OnlyPaxel Recipe";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.TOOLS, ModItems.WOODEN_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.WOODEN_PICKAXE)
                .define('S', Items.WOODEN_SHOVEL)
                .define('A', Items.WOODEN_AXE)
                .define('#', Items.STICK)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.STONE_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.STONE_PICKAXE)
                .define('S', Items.STONE_SHOVEL)
                .define('A', Items.STONE_AXE)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.COBBLESTONE), has(Items.COBBLESTONE))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.IRON_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.IRON_PICKAXE)
                .define('S', Items.IRON_SHOVEL)
                .define('A', Items.IRON_AXE)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.GOLDEN_PICKAXE)
                .define('S', Items.GOLDEN_SHOVEL)
                .define('A', Items.GOLDEN_AXE)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.DIAMOND_PICKAXE)
                .define('S', Items.DIAMOND_SHOVEL)
                .define('A', Items.DIAMOND_AXE)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(this.output);

        shaped(RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.NETHERITE_PICKAXE)
                .define('S', Items.NETHERITE_SHOVEL)
                .define('A', Items.NETHERITE_AXE)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(this.output);

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.DIAMOND_PAXEL.get()),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.NETHERITE_PAXEL.get()
                )
                .unlocks(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(this.output, String.valueOf(ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, "smithing_netherite_paxel")));
    }
}
