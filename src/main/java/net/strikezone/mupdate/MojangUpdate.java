package net.strikezone.mupdate;

import net.fabricmc.api.ModInitializer;

import net.strikezone.mupdate.block.ModBlocks;
import net.strikezone.mupdate.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MojangUpdate implements ModInitializer {
	public static final String MOD_ID = "mupdate";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}