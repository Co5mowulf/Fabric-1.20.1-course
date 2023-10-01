package net.co5mowulf.mccourse.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGeneration() {
        ModGeodeGeneration.generateGeodes();
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModFlowerGeneration.generateFlowers();
        ModEntitySpawns.addSpawns();
    }
}
