package com.btbob.mcplus.screen;

import com.btbob.mcplus.MCPlus;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class MushroomGrowingBoxScreen extends AbstractContainerScreen<MushroomGrowingBoxMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MCPlus.MODID, "textures/gui/mushroom_growing_box.png");

    public MushroomGrowingBoxScreen(MushroomGrowingBoxMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        this.inventoryLabelY = 50;
        this.titleLabelY = 20;
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (width - imageWidth) /2;
        int y = (width - imageWidth) /2;

        pGuiGraphics.blit(TEXTURE,x,y,0,-50,imageWidth,imageHeight);

        renderMyceliumGrowth(pGuiGraphics,x,y);
    }

    private void renderMyceliumGrowth(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isGrowing()) {
            guiGraphics.blit(TEXTURE, x + 85, y + 30, 176, 0, 64, menu.getScaledProgress());
        }
    }

    @Override
    public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pGuiGraphics);
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pGuiGraphics, pMouseX, pMouseY);
    }
}