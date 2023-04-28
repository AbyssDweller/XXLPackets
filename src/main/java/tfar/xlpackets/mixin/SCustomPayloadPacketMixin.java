package tfar.xlpackets.mixin;

import net.minecraft.network.protocol.game.ClientboundCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientboundCustomPayloadPacket.class)
public class SCustomPayloadPacketMixin {

    @ModifyConstant(method = {"<init>*"},constant = @Constant(intValue = 1048576))
    private int xlPackets(int constant) {
        return 2000000000;
    }
}
