package com.inverseglass.ufunction.datagen;

import com.inverseglass.ufunction.block.ModBlocks;
import com.inverseglass.ufunction.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ARGENTITE_ORE_BLOCK, oreDrops(ModBlocks.ARGENTITE_ORE_BLOCK, ModItems.ARGENTITE_ORE_ITEM));

    }
}
