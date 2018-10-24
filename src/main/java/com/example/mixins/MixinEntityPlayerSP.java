package com.example.mixins;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.client.C01PacketChatMessage;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

/**
 * Mixin class for {@link EntityPlayerSP}
 */
@Mixin(EntityPlayerSP.class)
public class MixinEntityPlayerSP {

    @Shadow
    @Final
    public NetHandlerPlayClient sendQueue;

    /**
     * Example mixin usage
     *
     * @param message Message to send
     * @author ExampleDude
     */
    @Overwrite
    public void sendChatMessage(String message) {
        this.sendQueue.addToSendQueue(new C01PacketChatMessage(message));
        System.out.println("The client sent the message: " + message);
    }
}
