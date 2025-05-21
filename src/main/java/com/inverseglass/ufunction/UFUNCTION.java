package com.inverseglass.ufunction;

import com.inverseglass.ufunction.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UFUNCTION implements ModInitializer {
	public static final String MOD_ID = "ufunction";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}