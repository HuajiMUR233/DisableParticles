package me.jvav.disparticles;

import carpet.settings.Rule;
import carpet.settings.RuleCategory;

public class DisableParticlesSettings {
    @Rule(
            desc = "Disable to send packets of particle to clients",
            options = {"true", "false"},
            category = {RuleCategory.SURVIVAL}
    )
    public static String disableParticlesPackets = "false";
}
