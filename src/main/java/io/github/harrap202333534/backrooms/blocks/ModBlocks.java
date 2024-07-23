package io.github.harrap202333534.backrooms.blocks;

import io.github.harrap202333534.backrooms.Backrooms;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {
	public static final Block LVL0_WALL_BASE_1 = registerBlock("lvl0_wall_base_1", new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_2 = registerBlock("lvl0_wall_base_2", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_3 = registerBlock("lvl0_wall_base_3", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_4 = registerBlock("lvl0_wall_base_4", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_5 = registerBlock("lvl0_wall_base_5", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_6 = registerBlock("lvl0_wall_base_6", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_7 = registerBlock("lvl0_wall_base_7", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_BASE_8 = registerBlock("lvl0_wall_base_8", new FacingBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL_TOP_1 = registerBlock("lvl0_wall_top_1", new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_WALL = registerBlock("lvl0_wall", new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block LVL0_FLOOR = registerBlock("lvl0_floor", new Block(QuiltBlockSettings.copyOf(Blocks.WHITE_WOOL)));

	private static void addBlockItemsToBuildingBlocksTab(FabricItemGroupEntries entries){
		entries.addItem(LVL0_WALL_BASE_1);
		entries.addItem(LVL0_WALL_BASE_2);
		entries.addItem(LVL0_WALL_BASE_3);
		entries.addItem(LVL0_WALL_BASE_4);
		entries.addItem(LVL0_WALL_BASE_5);
		entries.addItem(LVL0_WALL_BASE_6);
		entries.addItem(LVL0_WALL_BASE_7);
		entries.addItem(LVL0_WALL_BASE_8);
		entries.addItem(LVL0_WALL_TOP_1);
		entries.addItem(LVL0_WALL);
		entries.addItem(LVL0_FLOOR);
	}

	private static Block registerBlock(String id, Block block) {
		return Registry.register(Registries.BLOCK, new Identifier(Backrooms.MOD_ID, id), block);
	}



	public static void registerModBlocks(){
		Backrooms.LOGGER.info("Registering Blocks for "+Backrooms.MOD_ID);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlockItemsToBuildingBlocksTab);
	}
}
