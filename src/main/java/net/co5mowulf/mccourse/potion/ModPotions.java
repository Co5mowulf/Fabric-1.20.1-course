package net.co5mowulf.mccourse.potion;

import net.co5mowulf.mccourse.MCCourseMod;
import net.co5mowulf.mccourse.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final Potion SLIMY_POTION1 = registerPotion("slimy_potion1",
            new Potion(new StatusEffectInstance(ModEffects.SLIMY, 2400, 0)));

    public static final Potion SLIMY_POTION2 = registerPotion("slimy_potion2",
            new Potion(new StatusEffectInstance(ModEffects.SLIMY, 6000, 0)));

    private static Potion registerPotion(String name, Potion potion) {
        return Registry .register(Registries.POTION, new Identifier(MCCourseMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        MCCourseMod.LOGGER.info("Registering Potions for: " + MCCourseMod.MOD_ID);
    }
}
