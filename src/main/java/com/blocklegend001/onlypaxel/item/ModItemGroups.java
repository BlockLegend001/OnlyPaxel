package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ONLY_PAXEL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OnlyPaxel.MODID, "onlypaxel"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NETHERITE_PAXEL))
                    .displayName(Text.translatable("itemGroup.onlypaxel"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_PAXEL);
                        entries.add(ModItems.STONE_PAXEL);
                        entries.add(ModItems.IRON_PAXEL);
                        entries.add(ModItems.GOLDEN_PAXEL);
                        entries.add(ModItems.DIAMOND_PAXEL);
                        entries.add(ModItems.NETHERITE_PAXEL);
                    }).build());

    public static void registerItemGroups() {
        OnlyPaxel.LOGGER.info("Registering Mod Item Groups for " + OnlyPaxel.MODID);
    }
}
