package net.co5mowulf.mccourse.datagen;

import net.co5mowulf.mccourse.datagen.recipe.GemEmpoweringRecipeBuilder;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.co5mowulf.mccourse.block.ModBlocks;
import net.co5mowulf.mccourse.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET)
                .pattern("SSS")
                .pattern("SPS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('P', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_PINK_GARNET) + "_"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BUTTON, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_STAIRS, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_SLAB, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE_GATE, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_DOOR, ModBlocks.PINK_GARNET_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_TRAPDOOR, ModBlocks.PINK_GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SWORD)
                        .pattern(" S ")
                        .pattern(" S ")
                        .pattern(" P ")
                        .input('S', ModItems.PINK_GARNET)
                        .input('P', Items.STICK)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_PICKAXE)
                .pattern("SSS")
                .pattern(" P ")
                .pattern(" P ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_SHOVEL)
                .pattern(" S ")
                .pattern(" P ")
                .pattern(" P ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_AXE)
                .pattern(" SS")
                .pattern(" PS")
                .pattern(" P ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_HOE)
                .pattern(" SS")
                .pattern(" P ")
                .pattern(" P ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_PAXEL)
                .pattern("SSS")
                .pattern(" PS")
                .pattern(" P ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PAXEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.METAL_DETECTOR)
                .pattern(" PP")
                .pattern(" S ")
                .pattern("BP ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Items.STICK)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_HELMET)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_BOOTS)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_GARNET_LAMP_BLOCK)
                .pattern(" S ")
                .pattern("SPS")
                .pattern(" S ")
                .input('S', ModItems.PINK_GARNET)
                .input('P', Blocks.REDSTONE_LAMP)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_LAMP_BLOCK)));

        //Driftwood
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIFTWOOD_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.DRIFTWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.DRIFTWOOD_PLANKS), conditionsFromItem(ModBlocks.DRIFTWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRIFTWOOD_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIFTWOOD_SLAB, ModBlocks.DRIFTWOOD_PLANKS);
        offerShapelessRecipe(exporter, ModBlocks.DRIFTWOOD_BUTTON, ModBlocks.DRIFTWOOD_PLANKS, "driftwood_planks", 1);
        offerPressurePlateRecipe(exporter, ModBlocks.DRIFTWOOD_PRESSURE_PLATE, ModBlocks.DRIFTWOOD_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIFTWOOD_FENCE, 3)
                .pattern("   ")
                .pattern("SPS")
                .pattern("SPS")
                .input('S', ModBlocks.DRIFTWOOD_PLANKS)
                .input('P', Items.STICK)
                .criterion(hasItem(ModBlocks.DRIFTWOOD_PLANKS), conditionsFromItem(ModBlocks.DRIFTWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRIFTWOOD_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIFTWOOD_FENCE_GATE, 1)
                .pattern("   ")
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.DRIFTWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.DRIFTWOOD_PLANKS), conditionsFromItem(ModBlocks.DRIFTWOOD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRIFTWOOD_FENCE_GATE)));

        offerShapelessRecipe(exporter, ModBlocks.DRIFTWOOD_PLANKS, ModBlocks.DRIFTWOOD_LOG, "driftwood_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.DRIFTWOOD_PLANKS, ModBlocks.DRIFTWOOD_WOOD, "driftwood_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.DRIFTWOOD_PLANKS, ModBlocks.STRIPPED_DRIFTWOOD_LOG, "driftwood_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.DRIFTWOOD_PLANKS, ModBlocks.STRIPPED_DRIFTWOOD_WOOD, "driftwood_planks", 4);

        offerSmelting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_STONE_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 200, "pink_garnet");
        offerBlasting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_STONE_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 100, "pink_garnet");

        new GemEmpoweringRecipeBuilder(ModItems.RAW_PINK_GARNET, ModItems.PINK_GARNET, 3)
            .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
            .offerTo(exporter);
        new GemEmpoweringRecipeBuilder(Items.STICK, Items.END_ROD, 1)
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .offerTo(exporter);
        new GemEmpoweringRecipeBuilder(Items.COAL, Items.DIAMOND, 1)
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(exporter);
        new GemEmpoweringRecipeBuilder(Items.PRISMARINE_SHARD, Items.PRISMARINE_CRYSTALS, 1)
                .criterion(hasItem(Items.PRISMARINE_SHARD), conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter);
        new GemEmpoweringRecipeBuilder(Items.GOLDEN_APPLE, Items.ENCHANTED_GOLDEN_APPLE, 1)
                .criterion(hasItem(Items.GOLDEN_APPLE), conditionsFromItem(Items.GOLDEN_APPLE))
                .offerTo(exporter);
    }
}
