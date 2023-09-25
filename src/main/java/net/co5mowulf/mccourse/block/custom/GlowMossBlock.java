/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.co5mowulf.mccourse.block.custom;

import net.co5mowulf.mccourse.particle.ModParticles;
import net.co5mowulf.mccourse.world.ModConfiguredFeatures;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.UndergroundConfiguredFeatures;

public class GlowMossBlock
        extends Block
        implements Fertilizable {
    public GlowMossBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.getRegistryManager().getOptional(RegistryKeys.CONFIGURED_FEATURE).flatMap(registry -> registry.getEntry(ModConfiguredFeatures.GLOW_MOSS_BONEMEAL_KEY)).ifPresent(reference -> ((ConfiguredFeature)reference.value()).generate(world, world.getChunkManager().getChunkGenerator(), random, pos.up()));
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            world.addParticle(ModParticles.GLOW_MOSS_PARTICLE, (double)pos.getX() + random.nextDouble(), (double)pos.getY() + 1.1, (double)pos.getZ() + random.nextDouble(), 0.0, 0.05, 0.0);
        }
    }
}

