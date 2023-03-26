package dev.mundo.infinitymod;

import dev.mundo.infinitymod.item.InfinityModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Main implements ModInitializer {
	public static final String MOD_ID = "infinitymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("initializing Infinity Mod");

		InfinityModItems.registerModItems();

	}
}
