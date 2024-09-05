package net.strikezone.mupdate;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.strikezone.mupdate.MojangUpdate;

public class ModItems {

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));

    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MojangUpdate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MojangUpdate.LOGGER.info("Registering Mod Items for " + MojangUpdate.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ENDERITE_INGOT);
        });
    }
}
