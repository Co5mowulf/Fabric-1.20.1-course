package net.co5mowulf.mccourse.datagen;

import net.co5mowulf.mccourse.block.custom.SoundBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.co5mowulf.mccourse.block.ModBlocks;
import net.co5mowulf.mccourse.util.ModTags;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE)
                .add(ModBlocks.NETHER_PINK_GARNET_ORE)
                .add(ModBlocks.END_STONE_PINK_GARNET_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_ORE,
                        ModBlocks.PINK_GARNET_BLOCK,
                        ModBlocks.RAW_PINK_GARNET_BLOCK,
                        ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.END_STONE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE,
                        ModBlocks.PINK_GARNET_STAIRS,
                        ModBlocks.PINK_GARNET_SLAB,
                        ModBlocks.PINK_GARNET_PRESSURE_PLATE,
                        ModBlocks.PINK_GARNET_FENCE,
                        ModBlocks.PINK_GARNET_FENCE_GATE,
                        ModBlocks.PINK_GARNET_WALL,
                        ModBlocks.PINK_GARNET_DOOR,
                        ModBlocks.PINK_GARNET_TRAPDOOR,
                        ModBlocks.GEM_EMPOWERING_STATION,
                        ModBlocks.SOUND_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.END_STONE_PINK_GARNET_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_ORE,
                        ModBlocks.PINK_GARNET_BLOCK,
                        ModBlocks.RAW_PINK_GARNET_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PINK_GARNET_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DRIFTWOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE,
                        ModBlocks.DRIFTWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.DRIFTWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.DRIFTWOOD_SLAB);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.PINK_GARNET_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.PINK_GARNET_TRAPDOOR);

        //Tag for netherite
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);

        //Tag for custom tool material
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.NETHER_PINK_GARNET_ORE);

        //Tag for Paxel
        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);

        //tag for Beacon Base
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.PINK_GARNET_BLOCK);

        //plant tags
        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.PETUNIA);
        getOrCreateTagBuilder(BlockTags.CROPS)
                .add(ModBlocks.CAULIFLOWER_CROP);

        //moss
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.GLOW_MOSS_BLOCK);

        //Burning Wood
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DRIFTWOOD_LOG, ModBlocks.DRIFTWOOD_WOOD, ModBlocks.STRIPPED_DRIFTWOOD_LOG, ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
    }
}
