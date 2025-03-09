package com.blocklegend001.onlypaxel;

import com.blocklegend001.onlypaxel.config.ModConfigs;
import com.blocklegend001.onlypaxel.item.ModItemGroups;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlyPaxel implements ModInitializer {
    public static final String MODID = "onlypaxel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModConfigs.registerConfigs();
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
    }
}
