package org.example1.da;

import net.fabricmc.api.ModInitializer;

public class Da implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}
