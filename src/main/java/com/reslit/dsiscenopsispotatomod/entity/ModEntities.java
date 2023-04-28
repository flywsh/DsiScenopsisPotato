package com.reslit.dsiscenopsispotatomod.entity;

import com.reslit.dsiscenopsispotatomod.DsiScenopsisPotatoMod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
         DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DsiScenopsisPotatoMod.MODID);

    public static final RegistryObject<EntityType<BiggyEntity>> BIGGY =
        ENTITIES.register("biggy", () -> EntityType.Builder.of(
            BiggyEntity::new, MobCategory.CREATURE).build(DsiScenopsisPotatoMod.MODID + ":biggy"));
}
