package com.blocklegend001.onlypaxel;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfigs {
    public static final ForgeConfigSpec.Builder mycfg = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue DurabilityWoodenPaxel = mycfg
            .comment("Durability of the wooden paxel")
            .defineInRange("DurabilityWoodenPaxel", 177, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityStonePaxel = mycfg
            .comment("Durability of the stone paxel")
            .defineInRange("DurabilityStonePaxel", 393, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityIronPaxel = mycfg
            .comment("Durability of the iron paxel")
            .defineInRange("DurabilityIronPaxel", 750, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityGoldenPaxel = mycfg
            .comment("Durability of the golden paxel")
            .defineInRange("DurabilityGoldenPaxel", 96, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityDiamondPaxel = mycfg
            .comment("Durability of the diamond paxel")
            .defineInRange("DurabilityDiamondPaxel", 4683, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.IntValue DurabilityNetheritePaxel = mycfg
            .comment("Durability of the netherite paxel")
            .defineInRange("DurabilityNetheritePaxel", 6093, 0, Integer.MAX_VALUE);

    public static ForgeConfigSpec SPEC = mycfg.build();

    public static int durabilityWoodenPaxel;
    public static int durabilityStonePaxel;
    public static int durabilityIronPaxel;
    public static int durabilityGoldenPaxel;
    public static int durabilityDiamondPaxel;
    public static int durabilityNetheritePaxel;

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig config = CommentedFileConfig.builder(path).sync().autoreload().build();
        config.load();
        spec.setConfig(config);

        durabilityWoodenPaxel = DurabilityWoodenPaxel.get();
        durabilityStonePaxel = DurabilityStonePaxel.get();
        durabilityIronPaxel = DurabilityIronPaxel.get();
        durabilityGoldenPaxel = DurabilityGoldenPaxel.get();
        durabilityDiamondPaxel = DurabilityDiamondPaxel.get();
        durabilityNetheritePaxel = DurabilityNetheritePaxel.get();
    }
}
