package net.co5mowulf.mccourse.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class SlimyEffect extends StatusEffect {
    public SlimyEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.horizontalCollision){
            Vec3d initialVec = entity.getVelocity();
            Vec3d climbingVec = new Vec3d(initialVec.x, 0.2D, initialVec.z);
            entity.setVelocity(climbingVec.x * 0.92D, climbingVec.y * 0.98D, climbingVec.z * 0.92D);
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
