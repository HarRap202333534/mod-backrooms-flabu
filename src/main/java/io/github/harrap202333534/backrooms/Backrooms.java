package io.github.harrap202333534.backrooms;

import io.github.harrap202333534.backrooms.blocks.ModBlocks;
import io.github.harrap202333534.backrooms.items.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Backrooms implements ModInitializer {
	public static final String MOD_ID = "backrooms";
    public static final Logger LOGGER = LoggerFactory.getLogger("Backrooms");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
    }
}
