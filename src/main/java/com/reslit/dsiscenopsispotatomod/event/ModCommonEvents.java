package com.event;

import com.reslit.dsiscenopsispotatomod.DsiScenopsisPotatoMod;
import com.reslit.dsiscenopsispotatomod.entity.BiggyEntity;
import com.reslit.dsiscenopsispotatomod.entity.ModEntities;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = DsiScenopsisPotatoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        // event.enqueueWork(() -> {
        //     ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.EXAMPLE_FLOWER.getId(), 
        //         ModBlocks.EXAMPLE_FLOWER_POT);
        // });
    }
    
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BIGGY.get(), BiggyEntity.getBiggyAttributes().build());
    }
}
