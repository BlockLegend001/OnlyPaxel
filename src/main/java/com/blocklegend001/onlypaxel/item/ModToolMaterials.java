package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.config.ModConfigs;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class ModToolMaterials {

    public static final ToolMaterial WOODEN_PAXEL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            ModConfigs.DurabilityWoodenPaxel, 2.0F, 5.0F, 15, ItemTags.WOODEN_TOOL_MATERIALS);

    public static final ToolMaterial STONE_PAXEL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
            ModConfigs.DurabilityStonePaxel, 4.0F, 6.0F, 5, ItemTags.STONE_TOOL_MATERIALS);

    public static final ToolMaterial IRON_PAXEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            ModConfigs.DurabilityIronPaxel, 6.0F, 7.0F, 14, ItemTags.IRON_TOOL_MATERIALS);

    public static final ToolMaterial GOLDEN_PAXEL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL,
            ModConfigs.DurabilityGoldenPaxel, 12.0F, 5.0F, 22, ItemTags.GOLD_TOOL_MATERIALS);

    public static final ToolMaterial DIAMOND_PAXEL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            ModConfigs.DurabilityDiamondPaxel, 8.0F, 8.0F, 10, ItemTags.DIAMOND_TOOL_MATERIALS);

    public static final ToolMaterial NETHERITE_PAXEL= new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            ModConfigs.DurabilityNetheritePaxel, 9.0F, 9.0F, 15, ItemTags.NETHERITE_TOOL_MATERIALS);
}