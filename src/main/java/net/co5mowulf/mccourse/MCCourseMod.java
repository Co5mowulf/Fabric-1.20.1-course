package net.co5mowulf.mccourse;

import net.co5mowulf.mccourse.entity.ModEntities;
import net.co5mowulf.mccourse.recipe.ModRecipes;
import net.co5mowulf.mccourse.world.gen.ModWorldGeneration;
import net.co5mowulf.mccourse.world.tree.ModFoliagePlacerTypes;
import net.co5mowulf.mccourse.world.tree.ModTrunkPlacerTypes;
import net.fabricmc.api.ModInitializer;

import net.co5mowulf.mccourse.block.ModBlocks;
import net.co5mowulf.mccourse.block.entity.ModBlockEntities;
import net.co5mowulf.mccourse.effect.ModEffects;
import net.co5mowulf.mccourse.enchantment.ModEnchantments;
import net.co5mowulf.mccourse.fluid.ModFluids;
import net.co5mowulf.mccourse.item.ModItemGroup;
import net.co5mowulf.mccourse.item.ModItems;
import net.co5mowulf.mccourse.painting.ModPaintings;
import net.co5mowulf.mccourse.particle.ModParticles;
import net.co5mowulf.mccourse.potion.ModPotions;
import net.co5mowulf.mccourse.screen.ModScreenHandlers;
import net.co5mowulf.mccourse.sound.ModSounds;
import net.co5mowulf.mccourse.util.ModLootTableModifiers;
import net.co5mowulf.mccourse.util.ModRegistries;
import net.co5mowulf.mccourse.villager.ModVillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();

		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();

		ModPaintings.registerPaintings();
		ModEffects.registerEffects();

		ModPotions.registerPotions();
		ModParticles.registerParticles();

		ModVillagerProfession.registerVillagers();
		ModFluids.registerFluids();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandler();

		ModRecipes.registerRecipes();
		ModWorldGeneration.generateModWorldGeneration();

		ModEntities.registerModEntities();
		ModTrunkPlacerTypes.register();
		ModFoliagePlacerTypes.register();
	}
}