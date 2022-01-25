package me.jvav.disparticles;

import me.jvav.disparticles.DisableParticlesSettings;
import carpet.CarpetExtension;
import carpet.CarpetServer;

public class DisableParticlesExtension implements CarpetExtension {
    public static void registerExtension() {
        CarpetServer.manageExtension(new DisableParticlesExtension());
    }

    @Override
    public void onGameStarted() {
        CarpetServer.settingsManager.parseSettingsClass(DisableParticlesSettings.class);
    }
}
