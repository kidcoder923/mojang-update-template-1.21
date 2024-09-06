package net.strikezone.mupdate.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.strikezone.mupdate.MojangUpdate;
import net.strikezone.mupdate.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MOJANG_UPDATE_END = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MojangUpdate.MOD_ID, "mojang_update_end"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENDERITE_INGOT))
                    .displayName(Text.translatable("itemgroup.mupdate.mojang_update_end"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDERITE_INGOT);

                        entries.add(ModBlocks.SCORCHED_ENDSTONE);

                    }).build());



    public static void registerItemGroups() {
        MojangUpdate.LOGGER.info("registering Item Groups for " + MojangUpdate.MOD_ID);
    }
}
