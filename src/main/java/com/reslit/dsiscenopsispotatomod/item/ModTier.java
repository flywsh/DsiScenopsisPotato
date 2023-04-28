package com.reslit.dsiscenopsispotatomod.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public final class ModTier implements Tier {
    private final int maxUses;
    private final float speed;
    private final float attackBonus;
    private final int level;
    private int enchantValue;

    ModTier(int maxUses, float speed, float attackBonus, int level, int enchantValue) {
        this.maxUses = maxUses;
        this.speed = speed;
        this.attackBonus = attackBonus;
        this.level = level;
        this.enchantValue = enchantValue;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(new ItemStack(Blocks.STONE));
    }
}
