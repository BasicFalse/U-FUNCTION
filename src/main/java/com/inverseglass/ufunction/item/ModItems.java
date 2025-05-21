package com.inverseglass.ufunction.item;

import com.inverseglass.ufunction.UFUNCTION;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    ////////////////////////////////////////////////////////////////////
    /// Items

    public static final Item STRANGE_GEOMETRY = registerItem("strange_geometry", new Item(new Item.Settings()));

    public static final Item ARGENTITE_ORE_ITEM = registerItem("argentite_ore_item", new Item(new Item.Settings()));

    public static final Item ARGENTITE_SHAPED = registerItem("argentite_shaped", new Item(new Item.Settings()));

    ////////////////////////////////////////////////////////////////////
    /// Food Effects

    public static final FoodComponent STRANGE_ICECREAM_NTR = new FoodComponent.Builder().nutrition(2).saturationModifier(5).build();

    ////////////////////////////////////////////////////////////////////
    /// Food Items

    public static final Item STRANGE_ICECREAM = registerItem("strange_icecream", new Item(new Item.Settings().food(STRANGE_ICECREAM_NTR)));

    ////////////////////////////////////////////////////////////////////
    /// assembly

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(UFUNCTION.MOD_ID, name), item);
    }

    public static void registerModItems(){
        UFUNCTION.LOGGER.info("Registering " + UFUNCTION.MOD_ID + " Items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            //fabricItemGroupEntries.add(STRANGE_GEOMETRY);
            fabricItemGroupEntries.add(ARGENTITE_ORE_ITEM);
            fabricItemGroupEntries.add(ARGENTITE_SHAPED);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STRANGE_ICECREAM);
        });
    }
}
