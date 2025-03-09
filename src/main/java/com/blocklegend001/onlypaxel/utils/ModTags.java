package com.blocklegend001.onlypaxel.utils;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PAXEL_MINEABLE =
                tag("mineable/paxel_mineable");

        private static TagKey<Block> tag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(OnlyPaxel.MODID, name));
        }
    }
}
