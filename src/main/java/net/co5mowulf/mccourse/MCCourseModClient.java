package net.co5mowulf.mccourse;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.co5mowulf.mccourse.block.entity.ModBlockEntities;
import net.co5mowulf.mccourse.block.entity.renderer.GemEmpoweringBlockEntityRenderer;
import net.co5mowulf.mccourse.entity.ModBoats;
import net.co5mowulf.mccourse.entity.ModEntities;
import net.co5mowulf.mccourse.entity.client.MagicProjectileModel;
import net.co5mowulf.mccourse.entity.client.MagicProjectileRenderer;
import net.co5mowulf.mccourse.entity.client.PorcupineModel;
import net.co5mowulf.mccourse.entity.client.PorcupineRenderer;
import net.co5mowulf.mccourse.entity.layer.ModModelLayers;
import net.co5mowulf.mccourse.networking.ModMessages;
import net.co5mowulf.mccourse.particle.GlowMossParticle;
import net.co5mowulf.mccourse.util.ModWoodTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.co5mowulf.mccourse.block.ModBlocks;
import net.co5mowulf.mccourse.fluid.ModFluids;
import net.co5mowulf.mccourse.particle.ModParticles;
import net.co5mowulf.mccourse.particle.PinkGarnetParticle;
import net.co5mowulf.mccourse.screen.GemEmpoweringScreen;
import net.co5mowulf.mccourse.screen.ModScreenHandlers;
import net.co5mowulf.mccourse.util.ModModelPredicateProvider;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.ModelIdentifier;

public class MCCourseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PETUNIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PETUNIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLOW_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ORANGE_GLOW_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLOW_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_SPROUTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRIFTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DRIFTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CATTAIL_CROP, RenderLayer.getCutout());

        ModModelPredicateProvider.registerModModels();

        ParticleFactoryRegistry.getInstance().register(ModParticles.PINK_GARNET_PARTICLE, PinkGarnetParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GLOW_MOSS_PARTICLE, GlowMossParticle.Factory::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SOAP_WATER, ModFluids.FLOWING_SOAP_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1E038D0));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SOAP_WATER, ModFluids.FLOWING_SOAP_WATER);

        ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> new ModelIdentifier(MCCourseMod.MOD_ID, "radiation_staff_3d", "inventory"));

        HandledScreens.register(ModScreenHandlers.GEM_EMPOWERING_SCREEN_HANDLER, GemEmpoweringScreen::new);

        ModMessages.registerS2CPackets();

        BlockEntityRendererFactories.register(ModBlockEntities.GEM_EMPOWERING_STATION_BE, GemEmpoweringBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOD_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOD_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.DRIFTWOOD, TexturedRenderLayers.getSignTextureId(ModWoodTypes.DRIFTWOOD));

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MAGIC_PROJECTILE, MagicProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityRendererRegistry.register(ModEntities.THROWN_DICE_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.MAGIC_PROJECTILE, MagicProjectileRenderer::new);

        TerraformBoatClientHelper.registerModelLayers(ModBoats.DRIFTWOOD_BOAT_ID, false);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos)
                : FoliageColors.getDefaultColor(), ModBlocks.COLOURED_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.COLOURED_LEAVES);
    }
}