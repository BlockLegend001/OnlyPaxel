package com.blocklegend001.onlypaxel;

import com.blocklegend001.onlypaxel.item.ModCreativeModeTabs;
import com.blocklegend001.onlypaxel.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(OnlyPaxel.MODID)
public class OnlyPaxel {
    public static final String MODID = "onlypaxel";

    public OnlyPaxel(IEventBus modEventBus) {
        ModConfigs.loadConfig();
        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
    }
}
