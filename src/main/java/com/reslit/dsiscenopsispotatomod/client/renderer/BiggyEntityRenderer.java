package com.reslit.dsiscenopsispotatomod.client.renderer;

import com.reslit.dsiscenopsispotatomod.DsiScenopsisPotatoMod;
import com.reslit.dsiscenopsispotatomod.client.model.BiggyEntityModel;
import com.reslit.dsiscenopsispotatomod.entity.BiggyEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BiggyEntityRenderer extends MobRenderer<BiggyEntity, BiggyEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DsiScenopsisPotatoMod.MODID, "textures/entities/biggy_entity.png");
    public BiggyEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new BiggyEntityModel(ctx.bakeLayer(BiggyEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(BiggyEntity entity) {
        return TEXTURE;
    }
}