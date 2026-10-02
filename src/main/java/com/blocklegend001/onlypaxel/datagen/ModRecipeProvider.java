package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
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

        shaped(RecipeCategory.TOOLS, ModItems.COPPER_PAXEL.get())
                .pattern("PSA")
                .pattern(" # ")
                .pattern(" # ")
                .define('P', Items.COPPER_PICKAXE)
                .define('S', Items.COPPER_SHOVEL)
                .define('A', Items.COPPER_AXE)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
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
                .save(this.output, String.valueOf(Identifier.fromNamespaceAndPath(OnlyPaxel.MODID, "smithing_netherite_paxel")));
    }

    public static MultiRegistryBootstrap create() {
        return new MultiRegistryBootstrap() {
            @Override
            public Set<ResourceKey<? extends Registry<?>>> requestedRegistries() {
                return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
            }

            @Override
            public void run(MultiRegistryBootstrap.BootstrapGetter registries) {
                new ModRecipeProvider(registries.get(Registries.RECIPE), registries.get(Registries.ADVANCEMENT)).buildRecipes();
            }
        };
    }
}
