package com.reslit.dsiscenopsispotatomod.event;

import com.reslit.dsiscenopsispotatomod.DsiScenopsisPotatoMod;
import com.reslit.dsiscenopsispotatomod.client.model.BiggyEntityModel;
import com.reslit.dsiscenopsispotatomod.client.renderer.BiggyEntityRenderer;
import com.reslit.dsiscenopsispotatomod.entity.ModEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DsiScenopsisPotatoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        // ItemBlockRenderTypes.setRenderLayer();
    }
    
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.BIGGY.get(), BiggyEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BiggyEntityModel.LAYER_LOCATION, BiggyEntityModel::createBodyLayer);
    }
}
