package com.inverseglass.ufunction.item;

import com.inverseglass.ufunction.UFUNCTION;
import com.inverseglass.ufunction.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup UFUNCTION_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(UFUNCTION.MOD_ID, "u-function_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STRANGE_GEOMETRY))
                    .displayName(Text.translatable("itemgroup.ufunction.ufunction_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STRANGE_GEOMETRY);
                        entries.add(ModBlocks.BLOCK_OF_STATIC);
                    })
                    .build());



    public static void registerItemGroups(){
        UFUNCTION.LOGGER.info("Registering " + UFUNCTION.MOD_ID + " Item Groups...");
    }
}
