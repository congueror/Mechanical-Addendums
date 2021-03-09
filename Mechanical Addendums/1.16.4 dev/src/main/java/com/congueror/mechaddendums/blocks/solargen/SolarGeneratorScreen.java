package com.congueror.mechaddendums.blocks.solargen;

import java.util.ArrayList;
import java.util.List;

import com.congueror.mechaddendums.MechAddendums;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class SolarGeneratorScreen extends ContainerScreen<SolarGeneratorContainer> 
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(MechAddendums.MOD_ID, "textures/gui/solar_gen.png");
    private final SolarGeneratorTileEntity tile;

	public SolarGeneratorScreen(SolarGeneratorContainer container, PlayerInventory inv, ITextComponent name) {
		super(container, inv, name);
        this.tile = container.tile;
	}

	@Override
    public void render(MatrixStack mStack, int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground(mStack);
        super.render(mStack, mouseX, mouseY, partialTicks);
        
        List<ITextComponent> energy_bar = new ArrayList<>();
        energy_bar.add(new TranslationTextComponent("tooltip.mechaddendums.solargen.energy").appendString(": " + getPercent() + "%" + " (" + tile.energyClient + "FE)"));
        energy_bar.add(new TranslationTextComponent("tooltip.mechaddendums.solargen.generation").appendString(": " + tile.energyProductionClient + "FE"));
        
        this.renderHoveredTooltip(mStack, mouseX, mouseY);
        if(mouseX > guiLeft + 7 && mouseX < guiLeft + 29 && mouseY > guiTop + 10 && mouseY < guiTop + 74)
            this.func_243308_b(mStack, energy_bar, mouseX, mouseY);
    }
	
	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack mStack, int mouseX, int mouseY)
	{
		String title = new TranslationTextComponent("gui.mechaddendums.solargen.title").getString();
		this.font.drawString(mStack, title, (xSize / 2 - font.getStringWidth(title) / 2) + 5, 6, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {	
		 this.minecraft.getTextureManager().bindTexture(TEXTURES);
	        this.blit(matrixStack, this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	        
	        // Energy
	        int z = this.getEnergyScaled(60);
	        this.blit(matrixStack, this.guiLeft + 10, this.guiTop + 12 + z, this.xSize, 0, 16, 60 - z);
	        
	        this.blit(matrixStack, this.guiLeft + 10, this.guiTop + 12, this.xSize + 16, 0, 16, 60);
	}

    private int getEnergyScaled(int pixels)
    {
        return pixels - (pixels * getPercent() / 100);
    }

    private int getPercent()
    {
        Long currentEnergy = new Long(tile.energyClient);
        int maxEnergy = tile.maxEnergy;

        long result = currentEnergy * 100 / maxEnergy;

        return (int) result;
    }
}
