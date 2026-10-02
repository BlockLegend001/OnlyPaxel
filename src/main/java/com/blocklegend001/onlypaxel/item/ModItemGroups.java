package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab ONLY_PAXEL = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(OnlyPaxel.MODID, "onlypaxel"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_PAXEL))
                    .title(Component.translatable("itemGroup.onlypaxel"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WOODEN_PAXEL);
                        output.accept(ModItems.STONE_PAXEL);
                        output.accept(ModItems.COPPER_PAXEL);
                        output.accept(ModItems.IRON_PAXEL);
                        output.accept(ModItems.GOLDEN_PAXEL);
                        output.accept(ModItems.DIAMOND_PAXEL);
                        output.accept(ModItems.NETHERITE_PAXEL);
                    }).build());

    public static void registerItemGroups() {
        OnlyPaxel.LOGGER.info("Registering Mod Item Groups for " + OnlyPaxel.MODID);
    }
}
