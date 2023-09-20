package net.co5mowulf.mccourse.util;

import net.co5mowulf.mccourse.block.ModBlocks;
import net.co5mowulf.mccourse.command.ReturnHomeCommand;
import net.co5mowulf.mccourse.command.SetHomeCommand;
import net.co5mowulf.mccourse.event.AttackEntityHandler;
import net.co5mowulf.mccourse.event.PlayerCopyHandler;
import net.co5mowulf.mccourse.mixin.BrewingRecipeRegistryMixin;
import net.co5mowulf.mccourse.potion.ModPotions;
import net.co5mowulf.mccourse.villager.ModVillagerProfession;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.co5mowulf.mccourse.item.ModItems;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
        registerPotionRecipe();
        registerCustomTrades();
        registerFlammables();
        registerStrippables();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200);
    }

    private static void registerModCompostables(){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.5f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER_SEEDS, 0.25f);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIFTWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIFTWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DRIFTWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIFTWOOD_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIFTWOOD_LEAVES, 30, 60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.DRIFTWOOD_LOG, ModBlocks.STRIPPED_DRIFTWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.DRIFTWOOD_WOOD, ModBlocks.STRIPPED_DRIFTWOOD_WOOD);
    }

    private static void registerEvents(){
        AttackEntityCallback.EVENT.register(new AttackEntityHandler());
        ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());
    }

    private static void registerPotionRecipe() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMY_POTION1);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.MUNDANE, Items.SLIME_BALL, ModPotions.SLIMY_POTION2);
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.CAULIFLOWER, 20),
                        new ItemStack(Items.EMERALD, 1), 6, 2, 0.02f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(ModItems.PINK_GARNET_PAXEL, 1), 3, 6, 0.08f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagerProfession.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.RADIATION_STAFF, 1), 10, 2, 0.02f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagerProfession.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1), 10, 5, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagerProfession.SOUND_MASTER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Blocks.NOTE_BLOCK, 1), 10, 10, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagerProfession.SOUND_MASTER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1), 10, 20, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagerProfession.SOUND_MASTER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 35),
                            new ItemStack(Blocks.JUKEBOX, 1), 10, 30, 0.05f
                    ));
                });
    }
}
