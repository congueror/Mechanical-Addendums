package com.congueror.mechaddendums.blocks.coalgen;

import com.congueror.mechaddendums.MechAddendums;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class CoalGeneratorScreen extends ContainerScreen<CoalGeneratorContainer> {

    private ResourceLocation GUI = new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/coal_gen.png");
    CoalGeneratorTileEntity tile;

    public CoalGeneratorScreen(CoalGeneratorContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
        this.tile = container.tile;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
        if(mouseX > guiLeft + 7 && mouseX < guiLeft + 29 && mouseY > guiTop + 10 && mouseY < guiTop + 77)
            this.renderTooltip(matrixStack, new StringTextComponent("Energy: " + getPercent() + "%"), mouseX, mouseY);
    }

	@Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mouseX, int mouseY) {
		String generation = new TranslationTextComponent("gui." + MechAddendums.MOD_ID + "furnacegen.generation").appendString(" " + tile.currentAmountEnergyProduced() + " FE/t").getString();
	     this.font.drawString(matrixStack, generation, (xSize / 2 - font.getStringWidth(generation) / 2) + 14, 40, 4210752);
    }

    @SuppressWarnings("deprecation")
	@Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        this.blit(matrixStack, this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        
//        if (this.container.isBurning()) {
//            int k = this.container.getBurnLeftScaled();
//            this.blit(matrixStack, i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
//        }
        
        //Energy
        int z = this.getEnergyScaled(60);
        this.blit(matrixStack, this.guiLeft + 8, this.guiTop + 10 + z, this.xSize, 0, 16, 60 - z);
        
        this.blit(matrixStack, this.guiLeft + 8, this.guiTop + 10, this.xSize + 16, 0, 16, 60);
    }
    
    private int getEnergyScaled(int pixels)
    {
        return pixels - (pixels * getPercent() / 100);
    }
    
    private int getPercent()
    {
        Long currentEnergy = new Long(tile.maxEnergy);
        int maxEnergy = tile.maxEnergy;

        long result = currentEnergy * 100 / maxEnergy;

        return (int) result;
    }
}