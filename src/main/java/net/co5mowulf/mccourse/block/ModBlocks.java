package net.co5mowulf.mccourse.block;

import net.co5mowulf.mccourse.block.custom.*;
import net.co5mowulf.mccourse.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.co5mowulf.mccourse.MCCourseMod;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.UndergroundConfiguredFeatures;

import javax.swing.text.html.HTML;
import java.awt.*;

public class ModBlocks {

    //Normal Blocks
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    //Ore Blocks
    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(3, 6)));
    public static final Block DEEPSLATE_PINK_GARNET_ORE = registerBlock("deepslate_pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE), UniformIntProvider.create(3, 6)));
    public static final Block END_STONE_PINK_GARNET_ORE = registerBlock("end_stone_pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE), UniformIntProvider.create(3, 6)));
    public static final Block NETHER_PINK_GARNET_ORE = registerBlock("nether_pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK), UniformIntProvider.create(3, 6)));


    //Special Blocks
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block PINK_GARNET_LAMP_BLOCK = registerBlock("pink_garnet_lamp_block",
            new PinkGarnetLampBlock(FabricBlockSettings.create().mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(Instrument.BASEDRUM).strength(4f).requiresTool()
                    .luminance(state -> state.get(PinkGarnetLampBlock.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.PINK_GARNET_LAMP_SOUNDS)));
    public static final Block GEM_EMPOWERING_STATION = registerBlock("gem_empowering_station",
            new GemEmpoweringStationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));


    //Shaped Blocks
    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.IRON, 20, true));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.IRON));
    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.ACACIA));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.ACACIA));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(), BlockSetType.ACACIA));

    //Plants
    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block PETUNIA = registerBlock("petunia",
            new FlowerBlock(StatusEffects.BAD_OMEN, 4, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque()));
    public static final Block POTTED_PETUNIA = registerBlockWithoutBlockItem("potted_petunia",
            new FlowerPotBlock(PETUNIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    //Glow
    public static final Block GLOW_MOSS_BLOCK = registerBlock("glow_moss_block",
            new GlowMossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).luminance(12)));
    public static final Block GLOW_MOSS_CARPET = registerBlock("glow_moss_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).luminance(12)));
    public static final Block ORANGE_GLOW_MUSHROOM_BLOCK = registerBlock("orange_glow_mushroom_block",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).luminance(12)));
    public static final Block ORANGE_GLOW_MUSHROOM = registerBlock("orange_glow_mushroom",
            new FlowerBlock(StatusEffects.BAD_OMEN, 4, FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).nonOpaque().luminance(12)));
    public static final Block POTTED_ORANGE_GLOW_MUSHROOM = registerBlockWithoutBlockItem("potted_orange_glow_mushroom",
            new FlowerPotBlock(ORANGE_GLOW_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque().luminance(12)));

    //Methods
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
    }
}
