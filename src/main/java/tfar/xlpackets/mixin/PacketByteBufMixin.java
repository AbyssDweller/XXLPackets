package tfar.xlpackets.mixin;

import net.minecraft.network.FriendlyByteBuf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FriendlyByteBuf.class)
public class PacketByteBufMixin {

	@ModifyConstant(method = "readNbt()Lnet/minecraft/nbt/CompoundTag;",constant = @Constant(longValue = 2097152L))
	private long xlPackets(long old) {
		return 2_147_483_647L;
	}
}
