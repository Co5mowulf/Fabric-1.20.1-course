package net.co5mowulf.mccourse.item;

import net.co5mowulf.mccourse.fluid.ModFluids;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.co5mowulf.mccourse.MCCourseMod;
import net.co5mowulf.mccourse.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.CATTAIL_SEEDS);
                        entries.add(ModItems.CATTAIL);
                        entries.add(ModItems.PEAT_BRICK);
                        entries.add(ModItems.RADIATION_STAFF);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.DATA_TABLET);
                        entries.add(ModItems.BAR_BRAWL_MUSIC_DISC);
                        entries.add(ModFluids.SOAP_WATER_BUCKET);

                        entries.add(ModItems.PINK_GARNET_SWORD);
                        entries.add(ModItems.PINK_GARNET_PICKAXE);
                        entries.add(ModItems.PINK_GARNET_SHOVEL);
                        entries.add(ModItems.PINK_GARNET_AXE);
                        entries.add(ModItems.PINK_GARNET_HOE);
                        entries.add(ModItems.PINK_GARNET_PAXEL);
                        entries.add(ModItems.PINK_GARNET_BOW);
                        entries.add(ModItems.PINK_GARNET_SHIELD);

                        entries.add(ModItems.PINK_GARNET_HELMET);
                        entries.add(ModItems.PINK_GARNET_CHESTPLATE);
                        entries.add(ModItems.PINK_GARNET_LEGGINGS);
                        entries.add(ModItems.PINK_GARNET_BOOTS);

                        entries.add(ModItems.PINK_GARNET_HORSE_ARMOR);

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);

                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.DICE);
                        entries.add(ModBlocks.PINK_GARNET_LAMP_BLOCK);
                        entries.add(ModBlocks.GEM_EMPOWERING_STATION);

                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);

                        entries.add(ModBlocks.DRIFTWOOD_LOG);
                        entries.add(ModBlocks.DRIFTWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
                        entries.add(ModBlocks.DRIFTWOOD_PLANKS);
                        entries.add(ModBlocks.DRIFTWOOD_SAPLING);
                        entries.add(ModBlocks.DRIFTWOOD_LEAVES);
                        entries.add(ModBlocks.COLOURED_LEAVES);
                        entries.add(ModBlocks.DRIFTWOOD_STAIRS);
                        entries.add(ModBlocks.DRIFTWOOD_SLAB);
                        entries.add(ModBlocks.DRIFTWOOD_BUTTON);
                        entries.add(ModBlocks.DRIFTWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.DRIFTWOOD_FENCE);
                        entries.add(ModBlocks.DRIFTWOOD_FENCE_GATE);
                        entries.add(ModItems.DRIFTWOOD_SIGN);
                        entries.add(ModItems.DRIFTWOOD_HANGING_SIGN);
                        entries.add(ModItems.DRIFTWOOD_BOAT);
                        entries.add(ModItems.DRIFTWOOD_CHEST_BOAT);

                        entries.add(ModBlocks.PETUNIA);
                        entries.add(ModBlocks.GLOW_MOSS_BLOCK);
                        entries.add(ModBlocks.GLOW_MOSS_CARPET);
                        entries.add(ModBlocks.ORANGE_GLOW_MUSHROOM_BLOCK);
                        entries.add(ModBlocks.ORANGE_GLOW_MUSHROOM);
                        entries.add(ModItems.GLOW_SPROUTS);
                        entries.add(ModBlocks.YELLOW_GLOW_MUSHROOM);

                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups() {

    }
}
