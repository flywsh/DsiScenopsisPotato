package com.reslit.dsiscenopsispotatomod.screen;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.components.CenteredStringWidget;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class DsiScreen extends Screen {
    public DsiScreen(Component title) {
        super(title);
    }
    
    protected void init() {
        super.init();

        this.addRenderableWidget(new CenteredStringWidget(width, height, title, font));
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public void render(PoseStack pose, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(pose);
        super.render(pose, mouseX, mouseY, partialTick);
    }

    @Override
    public void onClose() {
        super.onClose();
    }

    @Override
    public void removed() {
        super.removed();
    }
}
