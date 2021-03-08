package com.congueror.mechaddendums.blocks.furnacegen;

import java.util.ArrayList;
import java.util.List;

import com.congueror.mechaddendums.MechAddendums;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class FurnaceGeneratorScreen extends ContainerScreen<FurnaceGeneratorContainer> {

    private ResourceLocation GUI = new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/furnace_gen.png");
    FurnaceGeneratorTileEntity tile;
    

    public FurnaceGeneratorScreen(FurnaceGeneratorContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
        this.tile = container.tile;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
         
        List<ITextComponent> energy_bar = new ArrayList<>();
        energy_bar.add(new TranslationTextComponent("tooltip.mechaddendums.furnacegen.energy_percent").appendString(": " + getPercent() + "%" + " (" + tile.getEnergy() + "FE)"));
        energy_bar.add(new TranslationTextComponent("tooltip.mechaddendums.furnacegen.generation").appendString(": " + tile.currentAmountEnergyProduced() + "FE"));
        
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
        if(mouseX > guiLeft + 5 && mouseX < guiLeft + 25 && mouseY > guiTop + 10 && mouseY < guiTop + 72) {
        	this.func_243308_b(matrixStack, energy_bar, mouseX, mouseY);
        }
    }

	@Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mouseX, int mouseY) {
		String title = new TranslationTextComponent("gui.mechaddendums.furnacegen.title").getString();
		this.font.drawString(matrixStack, title, (xSize / 2 - font.getStringWidth(title) / 2) + 5, 6, 4210752);
		
		String inv = new TranslationTextComponent("gui.mechaddendums.furnacegen.inv").getString();
		this.font.drawString(matrixStack, inv, (xSize / 2 - font.getStringWidth(inv) /2) - 55, 74, 4210752);
    }

    @SuppressWarnings("deprecation")
	@Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        this.blit(matrixStack, this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
      
        
        
        //Energy
        int z = this.getEnergyScaled(60);
        this.blit(matrixStack, this.guiLeft + 8, this.guiTop + 10 + z, this.xSize, 0, 16, 60 - z);
        
        this.blit(matrixStack, this.guiLeft + 8, this.guiTop + 10, this.xSize + 16, 0, 16, 60);
        
        //Burn
        if(container.isBurning()) {
            this.blit(matrixStack, this.guiLeft + 80, this.guiTop + 46, this.xSize + 32, 0, 14, 14);
        }
    }

    private int getEnergyScaled(int pixels)
    {
        return pixels - (pixels * getPercent() / 100);
    }
    
    private int getPercent()
    {
        Long currentEnergy = new Long(tile.getEnergy());
        int maxEnergy = tile.maxEnergy;

        long result = currentEnergy * 100 / maxEnergy;

        return (int) result;
    }
}