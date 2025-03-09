package com.blocklegend001.onlypaxel.utils;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PAXEL_MINEABLE =
                tag("mineable/paxel_mineable");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(OnlyPaxel.MODID, name));
        }
    }
}
