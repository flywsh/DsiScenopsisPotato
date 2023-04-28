package com.reslit.dsiscenopsispotatomod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class ModSwordItem extends SwordItem {
    public ModSwordItem() {
        super(new ModTier(999, 9999999f, 9999999f, 9999, 9999), 3, 96f, new Item.Properties());
    }

}
