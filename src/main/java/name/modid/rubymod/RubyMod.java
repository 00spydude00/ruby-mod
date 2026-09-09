package name.modid.rubymod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import name.modid.rubymod.item.ModBlocks;
import name.modid.rubymod.item.ModItemIds;
import name.modid.rubymod.item.ModItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.core.registries.Registries;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "ruby-mod";

    public static final ResourceKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY =
        ResourceKey.create(
            Registries.PLACED_FEATURE,
            Identifier.fromNamespaceAndPath("ruby-mod", "ruby_ore")
        );


	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// ModItems.();
		ModItemIds.initialize();
		ModItems.initialize();
		ModBlocks.initialize();
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);

		LOGGER.info("Hello Fabric world!");

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
