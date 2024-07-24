package io.github.harrap202333534.backrooms.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LightBlock extends net.minecraft.block.LightBlock {
	public LightBlock(Settings settings) {
		super(settings);
		setDefaultState(this.getDefaultState().with(LEVEL_15, 15));
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return Block.createCuboidShape(0,0,0,16,16,16);
	}
}
