package io.github.harrap202333534.backrooms.world.dimension;

import io.github.harrap202333534.backrooms.Backrooms;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
	public static final RegistryKey<DimensionOptions> LVL0_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
			new Identifier(Backrooms.MOD_ID, "lvl0"));
	public static final RegistryKey<World> LVL0_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD, LVL0_KEY.getValue());
	public static final RegistryKey<DimensionType> LVL0_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
			new Identifier(Backrooms.MOD_ID, "lvl0_type"));


	public static void init() {

	}
}
