//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.co5mowulf.mccourse.features;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModUndergroundConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOW_MOSS_PATCH_BONEMEAL = ConfiguredFeatures.of("glow_moss_patch_bonemeal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOW_MOSS_VEGETATION = ConfiguredFeatures.of("glow_moss_vegetation");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        ConfiguredFeatures.register(featureRegisterable, GLOW_MOSS_PATCH_BONEMEAL, Feature.VEGETATION_PATCH, new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.of(Blocks.MOSS_BLOCK), PlacedFeatures.createEntry(registryEntryLookup.getOrThrow(GLOW_MOSS_VEGETATION), new PlacementModifier[0]), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F));    }
}
