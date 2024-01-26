package org.example1.da.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static <T extends Block> T register(T block, String name, boolean shouldRegisterItem) {
        Identifier id = new Identifier("da", name);

        if(shouldRegisterItem) {
            Registry.register(Registries.ITEM, id,  new BlockItem(block, new Item.Settings()));
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block KUBERNETES_BLOCK = register(
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.ANVIL).strength(4.0f).requiresTool()),
            "kubernetes_block", true);

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS)
                .register((itemGroup) -> itemGroup.add(ModBlocks.KUBERNETES_BLOCK.asItem()));
    }
}
