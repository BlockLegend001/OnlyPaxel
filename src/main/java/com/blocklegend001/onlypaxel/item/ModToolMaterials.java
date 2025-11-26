package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.ModConfigs;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements Tier {

    WOODEN_PAXEL(0, ModConfigs.durabilityWoodenPaxel, 2.0F, 5.0F, 15, () -> Ingredient.of(ItemTags.PLANKS)),
    STONE_PAXEL(1, ModConfigs.durabilityStonePaxel, 4.0F, 6.0F, 5, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_PAXEL(2, ModConfigs.durabilityIronPaxel, 6.0F, 7.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    GOLDEN_PAXEL(0, ModConfigs.durabilityGoldenPaxel, 12.0F, 5.0F, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    DIAMOND_PAXEL(3, ModConfigs.durabilityDiamondPaxel, 8.0F, 8.0F, 10, () -> Ingredient.of(Items.DIAMOND)),
    NETHERITE_PAXEL(4, ModConfigs.durabilityNetheritePaxel, 9.0F, 9.0F, 15, () -> Ingredient.of(Items.NETHERITE_INGOT));

    private final int level;
    private final int durability;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            int level,
            int durability,
            float speed,
            float attackDamageBonus,
            int enchantmentValue,
            Supplier<Ingredient> repairIngredient
    ) {
        this.level = level;
        this.durability = durability;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}