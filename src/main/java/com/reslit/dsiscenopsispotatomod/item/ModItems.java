package com.reslit.dsiscenopsispotatomod.item;

import com.reslit.dsiscenopsispotatomod.DsiScenopsisPotatoMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, DsiScenopsisPotatoMod.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM =
        ITEMS.register("example_item", () -> new ModSwordItem());
        // ITEMS.register("example_item", () -> new Item(new Item.Properties()));

    // public static final DeferredRegister<Item> Potato
    // = DeferredRegister.create(ForegeRegistries.ITEMS, DsiScenopsisPotatoMod.MOD_ID);

    // public static final RegistryObject<Item> ITEM_NAME = Potato.register("ITEM_NAME",
    // () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB.MISC)));
}
