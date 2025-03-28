package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.ModConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModToolMaterials implements Tier {

    WOODEN_PAXEL(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ModConfigs.durabilityWoodenPaxel, 2.0F, 5.0F, 15, () -> Ingredient.of(ItemTags.PLANKS)),
    STONE_PAXEL(BlockTags.INCORRECT_FOR_STONE_TOOL, ModConfigs.durabilityStonePaxel, 4.0F, 6.0F, 5, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_PAXEL(BlockTags.INCORRECT_FOR_IRON_TOOL, ModConfigs.durabilityIronPaxel, 6.0F, 7.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    GOLDEN_PAXEL(BlockTags.INCORRECT_FOR_GOLD_TOOL, ModConfigs.durabilityGoldenPaxel, 12.0F, 5.0F, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    DIAMOND_PAXEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ModConfigs.durabilityDiamondPaxel, 8.0F, 8.0F, 10, () -> Ingredient.of(Items.DIAMOND)),
    NETHERITE_PAXEL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ModConfigs.durabilityNetheritePaxel, 9.0F, 9.0F, 15, () -> Ingredient.of(Items.NETHERITE_INGOT));

    private final TagKey<Block> incorrect;
    private final int uses;
    private float attackSpeed;
    private float attackDamage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    ModToolMaterials(TagKey<Block> incorrect, int uses, float attackSpeed, float attackDamage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
        this.uses = uses;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.attackSpeed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
