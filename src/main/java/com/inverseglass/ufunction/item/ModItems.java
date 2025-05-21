package com.inverseglass.ufunction.item;

import com.inverseglass.ufunction.UFUNCTION;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STRANGE_GEOMETRY = registerItem("strange_geometry", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(UFUNCTION.MOD_ID, name), item);
    }

    public static void registerModItems(){
        UFUNCTION.LOGGER.info("Registering " + UFUNCTION.MOD_ID + " Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STRANGE_GEOMETRY);
        });
    }
}
