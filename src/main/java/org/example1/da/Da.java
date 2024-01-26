package org.example1.da;

import net.fabricmc.api.ModInitializer;
import org.example1.da.blocks.ModBlocks;
import org.example1.da.items.ModItems;

public class Da implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
    }
}
