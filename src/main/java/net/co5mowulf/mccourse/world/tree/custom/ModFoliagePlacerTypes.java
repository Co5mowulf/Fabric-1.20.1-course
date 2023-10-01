package net.co5mowulf.mccourse.world.tree;

import net.co5mowulf.mccourse.MCCourseMod;
import net.co5mowulf.mccourse.mixin.FoliagePlacerTypeInvoker;
import net.co5mowulf.mccourse.world.tree.custom.DriftwoodFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> DRIFTWOOD_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister(
            "driftwood_foliage_placer", DriftwoodFoliagePlacer.CODEC);

    public static void register() {
        MCCourseMod.LOGGER.info("Registering the Foliage Placers for " + MCCourseMod.MOD_ID);
    }
}