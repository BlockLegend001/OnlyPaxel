package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.config.ModConfigs;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    WOODEN_PAXEL(0, ModConfigs.DurabilityWoodenPaxel, 2.0F, 5.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_PAXEL(1, ModConfigs.DurabilityStonePaxel, 4.0F, 6.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_PAXEL(2, ModConfigs.DurabilityIronPaxel, 6.0F, 7.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLDEN_PAXEL(0, ModConfigs.DurabilityGoldenPaxel, 12.0F, 5.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    DIAMOND_PAXEL(3, ModConfigs.DurabilityDiamondPaxel, 8.0F, 8.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE_PAXEL(4, ModConfigs.DurabilityNetheritePaxel, 9.0F, 9.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
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
    public int getMiningLevel() {
        return this.miningLevel;
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