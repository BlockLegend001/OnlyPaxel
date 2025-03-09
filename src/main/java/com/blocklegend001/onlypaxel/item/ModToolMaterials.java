package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.config.ModConfigs;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    WOODEN_PAXEL(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ModConfigs.DurabilityWoodenPaxel, 2.0F, 5.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_PAXEL(BlockTags.INCORRECT_FOR_STONE_TOOL, ModConfigs.DurabilityStonePaxel, 4.0F, 6.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_PAXEL(BlockTags.INCORRECT_FOR_IRON_TOOL, ModConfigs.DurabilityIronPaxel, 6.0F, 7.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLDEN_PAXEL(BlockTags.INCORRECT_FOR_GOLD_TOOL, ModConfigs.DurabilityGoldenPaxel, 12.0F, 5.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    DIAMOND_PAXEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ModConfigs.DurabilityDiamondPaxel, 8.0F, 8.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE_PAXEL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ModConfigs.DurabilityNetheritePaxel, 9.0F, 9.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed,
                     final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}