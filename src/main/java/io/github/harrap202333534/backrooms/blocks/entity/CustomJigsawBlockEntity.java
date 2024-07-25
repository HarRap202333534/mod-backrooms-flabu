package io.github.harrap202333534.backrooms.blocks.entity;

import io.github.harrap202333534.backrooms.Backrooms;
import net.minecraft.block.BlockState;
import net.minecraft.block.JigsawBlock;
import net.minecraft.block.entity.JigsawBlockEntity;
import net.minecraft.block.enums.JigsawOrientation;
import net.minecraft.registry.Holder;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class CustomJigsawBlockEntity extends JigsawBlockEntity {

	public CustomJigsawBlockEntity(BlockPos pos, BlockState state) {
		super(pos, state);
	}

	@Override
	public void generate(ServerWorld world, int maxDepth, boolean keepJigsaws) {
		BlockPos blockPos = this.getPos().offset(((JigsawOrientation)this.getCachedState().get(JigsawBlock.ORIENTATION)).getFacing());
		Registry<StructurePool> registry = world.getRegistryManager().get(RegistryKeys.STRUCTURE_POOL);
		Holder<StructurePool> holder = registry.getHolderOrThrow(this.getPool());
		StructurePoolBasedGenerator.generate(world, holder, this.getTarget(), 500, blockPos, keepJigsaws);
	}
}
