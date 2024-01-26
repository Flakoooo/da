package org.example1.da;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static <T extends Item> T register(T item, String ID) {
        return Registry.register(Registries.ITEM, new Identifier("da", ID), item);
    }

    public static final Item KUBERNETES = register(
            new Item(new FabricItemSettings()),
            "kubernetes"
    );

    public static void initialize() {
        ItemGroupEvents
                .modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.KUBERNETES));
    }
}
