package tfar.xlpackets.mixin;

import net.minecraft.network.PacketEncoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PacketEncoder.class)
public class PackeEncoderMixin {
	@ModifyConstant(method = "encode",constant = @Constant(intValue = 2097152))
	private int xlPackets(int old) {
		return 2147483647;
	}
}