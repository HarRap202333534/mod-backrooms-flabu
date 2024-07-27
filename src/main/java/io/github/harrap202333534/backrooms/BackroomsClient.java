package io.github.harrap202333534.backrooms;

import io.github.harrap202333534.backrooms.blocks.entity.CustomJigsawBlockEntity;
import io.github.harrap202333534.backrooms.world.dimension.ModDimensions;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.block.JigsawBlock;
import net.minecraft.block.StructureBlock;
import net.minecraft.block.entity.JigsawBlockEntity;
import net.minecraft.block.entity.StructureBlockBlockEntity;
import net.minecraft.block.enums.JigsawOrientation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.multiplayer.chat.LoggedChatEvent;
import net.minecraft.registry.Holder;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.structure.Structure;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import java.beans.EventSetDescriptor;

public class BackroomsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {

		try {
			ServerWorld world = MinecraftClient.getInstance().world.getServer().getWorld(ModDimensions.LVL0_LEVEL_KEY);
			BlockPos blockPos = MinecraftClient.getInstance().player.getBlockPos();
			Registry<StructurePool> registry = world.getRegistryManager().get(RegistryKeys.STRUCTURE_POOL);
			RegistryKey<StructurePool> pool = RegistryKey.of(RegistryKeys.STRUCTURE_POOL, new Identifier(Backrooms.MOD_ID, "lvl0"));
			Holder<StructurePool> holder = registry.getHolderOrThrow(pool);

			StructurePoolBasedGenerator.generate(world, holder, new Identifier(Backrooms.MOD_ID, "room1"), 10, blockPos, false);
		} catch (Exception exception) {}



	}
}
