package committee.nova.hltgo.mixin;

import net.minecraft.world.entity.projectile.FishingHook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingHook.class)
public abstract class MixinFishingHook {
    @Inject(method = "isOpenWaterFishing", at = @At("HEAD"), cancellable = true)
    private void inject$isOpenWaterFishing(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
