package me.jvav.disparticles.mixins;

import carpet.CarpetServer;
import me.jvav.disparticles.DisableParticlesExtension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(CarpetServer.class)
public abstract class CarpetServerMixin
{
    @Inject(
            method = "onGameStarted",
            at = @At(value = "HEAD"),
            remap = false
    )
    private static void registerCarpetExtension100Success(CallbackInfo ci)
    {
        DisableParticlesExtension.registerExtension();
    }
}
