package io.github.harrap202333534.backrooms.world.biome;

import com.mojang.serialization.Codec;
import io.github.harrap202333534.backrooms.Backrooms;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;

public class ModBiomes {
	public static final RegistryKey<Biome> LVL0_BIOME = RegistryKey.of(RegistryKeys.BIOME,
			new Identifier(Backrooms.MOD_ID, "lvl0_biome"));

	public static void init() {

	}

	public static <C extends ChunkGenerator, D extends Codec<C>> D get(String id, D chunkGeneratorCodec) {
		return (D)Registry.register(Registries.CHUNK_GENERATOR, new Identifier(Backrooms.MOD_ID, id), chunkGeneratorCodec);
	}
}
