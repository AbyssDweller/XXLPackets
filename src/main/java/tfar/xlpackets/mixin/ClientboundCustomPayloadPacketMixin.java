package tfar.xlpackets.mixin;

import net.minecraft.network.protocol.game.ClientboundCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientboundCustomPayloadPacket.class)
public class ClientboundCustomPayloadPacketMixin {

    @ModifyConstant(method = {"<init>(Lnet/minecraft/network/FriendlyByteBuf;)V","<init>(Lnet/minecraft/resources/ResourceLocation;Lnet/minecraft/network/FriendlyByteBuf;)V"},
            constant = @Constant(intValue = 1048576))
    private int xlPackets(int old) {
        return 2147483647;
    }
}
