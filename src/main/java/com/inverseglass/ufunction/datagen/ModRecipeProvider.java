package com.inverseglass.ufunction.datagen;

import com.inverseglass.ufunction.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> ARGENTITE_SMELTING = List.of(ModItems.ARGENTITE_ORE_ITEM);
        List<ItemConvertible> ARGENTITE_BLASTING = List.of(ModItems.ARGENTITE_SHAPED);

        offerSmelting(recipeExporter, ARGENTITE_SMELTING, RecipeCategory.MISC, ModItems.ARGENTITE_SHAPED, .5f, 800, "argentite");
        offerBlasting(recipeExporter, ARGENTITE_BLASTING, RecipeCategory.MISC, ModItems.ARGENTITE_ORE_ITEM, .5f, 500, "argentite");

    }
}
