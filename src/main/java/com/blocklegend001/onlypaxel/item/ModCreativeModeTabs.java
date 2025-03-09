package com.blocklegend001.onlypaxel.item;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OnlyPaxel.MODID);

    public static final Supplier<CreativeModeTab> ONLY_PAXEL = CREATIVE_MODE_TAB.register("only_paxel",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_PAXEL.get()))
                    .title(Component.translatable("itemGroup.onlypaxel"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.WOODEN_PAXEL.get());
                        pOutput.accept(ModItems.STONE_PAXEL.get());
                        pOutput.accept(ModItems.IRON_PAXEL.get());
                        pOutput.accept(ModItems.GOLDEN_PAXEL.get());
                        pOutput.accept(ModItems.DIAMOND_PAXEL.get());
                        pOutput.accept(ModItems.NETHERITE_PAXEL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
