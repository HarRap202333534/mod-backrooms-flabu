package io.github.harrap202333534.backrooms.blocks;

import io.github.harrap202333534.backrooms.blocks.entity.CustomJigsawBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.JigsawBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CustomJigsawBlock extends JigsawBlock {
	public CustomJigsawBlock(Settings settings) {
		super(settings);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new CustomJigsawBlockEntity(pos, state);
	}
}
