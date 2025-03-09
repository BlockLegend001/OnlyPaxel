package com.blocklegend001.onlypaxel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfigs {
    private static final File CONFIG_FILE = new File("config/onlypaxel.toml");

    public static int durabilityWoodenPaxel = 177;
    public static int durabilityStonePaxel = 393;
    public static int durabilityIronPaxel = 750;
    public static int durabilityGoldenPaxel = 96;
    public static int durabilityDiamondPaxel = 4683;
    public static int durabilityNetheritePaxel = 6093;

    public static void loadConfig() {
        File configDir = new File("config");
        if (!configDir.exists()) {
            configDir.mkdir();
        }

        if (!CONFIG_FILE.exists()) {
            saveConfig();
        } else {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();

                durabilityWoodenPaxel = config.get("durabilityWoodenPaxel").getAsInt();
                durabilityStonePaxel = config.get("durabilityStonePaxel").getAsInt();
                durabilityIronPaxel = config.get("durabilityIronPaxel").getAsInt();
                durabilityGoldenPaxel = config.get("durabilityGoldenPaxel").getAsInt();
                durabilityDiamondPaxel = config.get("durabilityDiamondPaxel").getAsInt();
                durabilityNetheritePaxel = config.get("durabilityNetheritePaxel").getAsInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        JsonObject config = new JsonObject();
        config.addProperty("durabilityWoodenPaxel", durabilityWoodenPaxel);
        config.addProperty("durabilityStonePaxel", durabilityStonePaxel);
        config.addProperty("durabilityIronPaxel", durabilityIronPaxel);
        config.addProperty("durabilityGoldenPaxel", durabilityGoldenPaxel);
        config.addProperty("durabilityDiamondPaxel", durabilityDiamondPaxel);
        config.addProperty("durabilityNetheritePaxel", durabilityNetheritePaxel);
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
