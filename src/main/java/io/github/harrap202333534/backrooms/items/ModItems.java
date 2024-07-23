package io.github.harrap202333534.backrooms.items;

import io.github.harrap202333534.backrooms.Backrooms;
import io.github.harrap202333534.backrooms.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item LVL0_WALL_BASE_1 = registerItem("lvl0_wall_base_1", new BlockItem(ModBlocks.LVL0_WALL_BASE_1, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_2 = registerItem("lvl0_wall_base_2", new BlockItem(ModBlocks.LVL0_WALL_BASE_2, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_3 = registerItem("lvl0_wall_base_3", new BlockItem(ModBlocks.LVL0_WALL_BASE_3, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_4 = registerItem("lvl0_wall_base_4", new BlockItem(ModBlocks.LVL0_WALL_BASE_4, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_5 = registerItem("lvl0_wall_base_5", new BlockItem(ModBlocks.LVL0_WALL_BASE_5, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_6 = registerItem("lvl0_wall_base_6", new BlockItem(ModBlocks.LVL0_WALL_BASE_6, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_7 = registerItem("lvl0_wall_base_7", new BlockItem(ModBlocks.LVL0_WALL_BASE_7, new QuiltItemSettings()));
	public static final Item LVL0_WALL_BASE_8 = registerItem("lvl0_wall_base_8", new BlockItem(ModBlocks.LVL0_WALL_BASE_8, new QuiltItemSettings()));
	public static final Item LVL0_WALL_TOP_1 = registerItem("lvl0_wall_top_1", new BlockItem(ModBlocks.LVL0_WALL_TOP_1, new QuiltItemSettings()));
	public static final Item LVL0_WALL = registerItem("lvl0_wall", new BlockItem(ModBlocks.LVL0_WALL, new QuiltItemSettings()));
	public static final Item LVL0_FLOOR = registerItem("lvl0_floor", new BlockItem(ModBlocks.LVL0_FLOOR, new QuiltItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Backrooms.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Backrooms.LOGGER.info("Registering Mod Items for " + Backrooms.MOD_ID);
	}

}
