package com.blocklegend001.onlypaxel.datagen;

import com.blocklegend001.onlypaxel.OnlyPaxel;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = OnlyPaxel.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new ModRecipeProvider.Runner(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider);
        event.addProvider(blockTagsProvider);
        event.addProvider(new ModItemTagProvider(packOutput, lookupProvider));

        event.addProvider(new ModModelProvider(packOutput, OnlyPaxel.MODID));
    }
}