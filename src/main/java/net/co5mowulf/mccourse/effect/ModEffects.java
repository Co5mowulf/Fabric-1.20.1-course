package net.co5mowulf.mccourse.effect;

import net.co5mowulf.mccourse.MCCourseMod;
import net.co5mowulf.mccourse.effect.custom.SlimyEffect;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final StatusEffect SLIMY = registerStatusEffect("slimy",
            new SlimyEffect(StatusEffectCategory.NEUTRAL, 0x36ebab)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            "7107DE5E-7CE8-4030-940E-514C1F160890", -.25f,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));


    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MCCourseMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        MCCourseMod.LOGGER.info("Registering Mod Effects for: " + MCCourseMod.MOD_ID);
    }
}
