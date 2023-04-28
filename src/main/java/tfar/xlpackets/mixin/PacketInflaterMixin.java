package tfar.xlpackets.mixin;

import net.minecraft.network.CompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CompressionDecoder.class)
public class PacketInflaterMixin {
	@ModifyConstant(method = "decode",constant = @Constant(intValue = 8388608))
	private int xlPackets(int old) {
		return 2000000000;
	}
}
