package com.inverseglass.ufunction.block;

import com.inverseglass.ufunction.UFUNCTION;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    ///////////////////////////////////////////////////////////////////////
    /// Blocks

    public static final Block BLOCK_OF_STATIC = registerBlock("block_of_static",
            new Block(AbstractBlock.Settings.create().strength(10f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ARGENTITE_ORE_BLOCK = registerBlock("argentite_ore_block",
            new Block(AbstractBlock.Settings.create().strength(10f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));



    ////////////////////////////////////////////////////////////////////////
    /// assembly

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(UFUNCTION.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(UFUNCTION.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        UFUNCTION.LOGGER.info("Registering " + UFUNCTION.MOD_ID + " Blocks...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.ARGENTITE_ORE_BLOCK);
        });
    }
}
