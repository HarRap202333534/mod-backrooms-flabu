package io.github.harrap202333534.backrooms.world.biome;

import net.minecraft.registry.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.event.listener.GameEventListener;

public class CustomModBiomes {

	public static Biome create() {
		Biome.Builder biome = new Biome.Builder();
		SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
		GenerationSettings.PlainBuilder generationSettings = new GenerationSettings.PlainBuilder();
		BiomeEffects.Builder biomeEffects = new BiomeEffects.Builder();
		biomeEffects.skyColor(8103167);
		biomeEffects.waterColor(8055784);
		biomeEffects.waterFogColor(8055784);
		biomeEffects.fogColor(12638463);
		biomeEffects.grassColor(13818488);
		BiomeEffects effects = biomeEffects.build();
		biome.spawnSettings(spawnSettings.build());
		biome.generationSettings(generationSettings.build());
		biome.effects(effects);
		biome.hasPrecipitation(false);
		biome.temperature(1.0f);
		biome.downfall(1.0f);
		return biome.build();
	}
}
