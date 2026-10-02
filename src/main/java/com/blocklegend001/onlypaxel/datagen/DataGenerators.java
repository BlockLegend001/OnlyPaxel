package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.minecraft.core.RegistrySetBuilder;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = OnlyPaxel.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        var builder = new RegistrySetBuilder()
                .add(ModRecipeProvider.create());
        event.createReloadableRegistryObjects(builder);
        event.createProvider(ModBlockTagProvider::new);
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModItemTagProvider::new);
    }
}