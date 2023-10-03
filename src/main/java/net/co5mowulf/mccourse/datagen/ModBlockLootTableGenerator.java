package net.co5mowulf.mccourse.datagen;

import dev.architectury.platform.Mod;
import net.co5mowulf.mccourse.block.custom.CauliflowerCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.co5mowulf.mccourse.block.ModBlocks;
import net.co5mowulf.mccourse.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.MushroomBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PINK_GARNET_BLOCK);
        addDrop(ModBlocks.RAW_PINK_GARNET_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);
        addDrop(ModBlocks.PINK_GARNET_BUTTON);
        addDrop(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_GARNET_FENCE);
        addDrop(ModBlocks.PINK_GARNET_FENCE_GATE);
        addDrop(ModBlocks.PINK_GARNET_WALL);
        addDrop(ModBlocks.PINK_GARNET_DOOR, doorDrops(ModBlocks.PINK_GARNET_DOOR));
        addDrop(ModBlocks.PINK_GARNET_TRAPDOOR);

        addDrop(ModBlocks.DRIFTWOOD_LOG);
        addDrop(ModBlocks.DRIFTWOOD_WOOD);
        addDrop(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
        addDrop(ModBlocks.DRIFTWOOD_PLANKS);
        addDrop(ModBlocks.DRIFTWOOD_STAIRS);
        addDrop(ModBlocks.DRIFTWOOD_SLAB);
        addDrop(ModBlocks.DRIFTWOOD_BUTTON);
        addDrop(ModBlocks.DRIFTWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.DRIFTWOOD_FENCE);
        addDrop(ModBlocks.DRIFTWOOD_FENCE_GATE);
        addDrop(ModBlocks.GLOW_MOSS_BLOCK);
        addDrop(ModBlocks.GLOW_MOSS_CARPET);
        addDrop(ModBlocks.ORANGE_GLOW_MUSHROOM);
        addDrop(ModBlocks.GLOW_SPROUTS, dropsWithShears(ModBlocks.GLOW_SPROUTS));
        addDrop(ModBlocks.DRIFTWOOD_SAPLING);

        addDrop(ModBlocks.DRIFTWOOD_SIGN, ModItems.DRIFTWOOD_SIGN);
        addDrop(ModBlocks.DRIFTWOOD_WALL_SIGN, ModItems.DRIFTWOOD_SIGN);
        addDrop(ModBlocks.DRIFTWOOD_HANGING_SIGN, ModItems.DRIFTWOOD_HANGING_SIGN);
        addDrop(ModBlocks.DRIFTWOOD_HANGING_WALL_SIGN, ModItems.DRIFTWOOD_HANGING_SIGN);

        addDrop(ModBlocks.ORANGE_GLOW_MUSHROOM_BLOCK, mushroomBlockDrops(ModBlocks.ORANGE_GLOW_MUSHROOM_BLOCK, ModBlocks.ORANGE_GLOW_MUSHROOM));

        addDrop(ModBlocks.PINK_GARNET_ORE, oreDrops(ModBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.DEEPSLATE_PINK_GARNET_ORE, oreDrops(ModBlocks.DEEPSLATE_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.END_STONE_PINK_GARNET_ORE, oreDrops(ModBlocks.END_STONE_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.NETHER_PINK_GARNET_ORE, oreDrops(ModBlocks.NETHER_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));

        addDrop(ModBlocks.PINK_GARNET_STAIRS);
        addDrop(ModBlocks.PINK_GARNET_SLAB, slabDrops(ModBlocks.PINK_GARNET_SLAB));

        LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, 6));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP,
                ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));

    }
}
