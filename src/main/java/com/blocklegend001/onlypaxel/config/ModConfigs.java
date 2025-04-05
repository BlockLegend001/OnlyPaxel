package com.blocklegend001.onlypaxel.config;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int DurabilityWoodenPaxel;
    public static int DurabilityStonePaxel;
    public static int DurabilityIronPaxel;
    public static int DurabilityGoldenPaxel;
    public static int DurabilityDiamondPaxel;
    public static int DurabilityNetheritePaxel;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OnlyPaxel.MODID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("DurabilityWoodenPaxel", 177), "Durability of Wooden Paxel");
        configs.addKeyValuePair(new Pair<>("DurabilityStonePaxel", 393), "Durability of Stone Paxel");
        configs.addKeyValuePair(new Pair<>("DurabilityIronPaxel", 750), "Durability of Iron Paxel");
        configs.addKeyValuePair(new Pair<>("DurabilityGoldenPaxel", 96), "Durability of Golden Paxel");
        configs.addKeyValuePair(new Pair<>("DurabilityDiamondPaxel", 4683), "Durability of Diamond Paxel");
        configs.addKeyValuePair(new Pair<>("DurabilityNetheritePaxel", 6093), "Durability of Netherite Paxel");
    }

    private static void assignConfigs() {
        DurabilityWoodenPaxel = CONFIG.getOrDefault("DurabilityWoodenPaxel", 177);
        DurabilityStonePaxel = CONFIG.getOrDefault("DurabilityStonePaxel", 393);
        DurabilityIronPaxel = CONFIG.getOrDefault("DurabilityIronPaxel", 750);
        DurabilityGoldenPaxel = CONFIG.getOrDefault("DurabilityGoldenPaxel", 96);
        DurabilityDiamondPaxel = CONFIG.getOrDefault("DurabilityDiamondPaxel", 4683);
        DurabilityNetheritePaxel = CONFIG.getOrDefault("DurabilityNetheritePaxel", 6093);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
