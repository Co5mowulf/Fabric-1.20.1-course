package net.co5mowulf.mccourse.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.co5mowulf.mccourse.MCCourseMod;
import net.co5mowulf.mccourse.networking.packet.ItemStackSyncS2CPacket;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier ITEM_SYNC = new Identifier(MCCourseMod.MOD_ID, "item_sync");


    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ITEM_SYNC, ItemStackSyncS2CPacket::receive);
    }
}