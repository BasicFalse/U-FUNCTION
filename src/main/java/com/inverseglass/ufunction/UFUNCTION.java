package com.inverseglass.ufunction;

import com.inverseglass.ufunction.block.ModBlocks;
import com.inverseglass.ufunction.item.ModItemGroups;
import com.inverseglass.ufunction.item.ModItems;
import com.inverseglass.ufunction.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UFUNCTION implements ModInitializer {
	public static final String MOD_ID = "ufunction";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}