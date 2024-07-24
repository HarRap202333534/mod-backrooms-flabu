package io.github.harrap202333534.backrooms.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class IntersticeBlock extends FacingBlock{
	protected IntersticeBlock(Settings settings) {
		super(settings);
	}


	VoxelShape NORTH1 = Block.createCuboidShape(0,0,0,5,16,16);
	VoxelShape NORTH2 = Block.createCuboidShape(11,0,0,16,16,16);
	VoxelShape EAST1 = Block.createCuboidShape(0,0,0,16,16,5);
	VoxelShape EAST2 = Block.createCuboidShape(0,0,11,16,16,16);

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		if(state == state.with(FACING, Direction.NORTH) || state == state.with(FACING, Direction.SOUTH)){
			return VoxelShapes.union(NORTH1,NORTH2);
		}
		else{
			return VoxelShapes.union(EAST1,EAST2);
		}
	}
}
