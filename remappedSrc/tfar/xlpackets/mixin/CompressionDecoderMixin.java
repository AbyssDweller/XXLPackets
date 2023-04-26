package tfar.xlpackets.mixin;

import net.minecraft.network.PacketInflater;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PacketInflater.class)
public class CompressionDecoderMixin {
	@ModifyConstant(method = "decode",constant = @Constant(intValue = 2097152))
	private int xlPackets(int old) {
		return 2147483647;
	}
}
