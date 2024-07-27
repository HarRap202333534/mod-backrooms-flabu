package io.github.harrap202333534.backrooms.util;

import io.github.harrap202333534.backrooms.Backrooms;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModTags {
	public static class Biomes {
		public static final TagKey<Biome> TEST = createTag("lvl0_biome");

		private static TagKey<Biome> createTag(String name){
			return TagKey.of(RegistryKeys.BIOME, new Identifier(Backrooms.MOD_ID, name));
		}
	}
}
