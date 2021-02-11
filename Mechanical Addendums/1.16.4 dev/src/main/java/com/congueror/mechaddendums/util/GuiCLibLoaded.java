package com.congueror.mechaddendums.util;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.Util;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.loading.FMLPaths;

public class GuiCLibLoaded extends Screen{

	public GuiCLibLoaded() {
		super(new TranslationTextComponent("gui.mechaddendums.clibloaded.text"));
	}

	@Override
	public void init() {		
		this.addButton(new Button(this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, new TranslationTextComponent("gui.mechaddendums.clibloaded.gotomenu"), (button) -> {
			this.minecraft.displayGuiScreen(new MainMenuScreen());
		}));
		
		this.addButton(new Button(this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, new TranslationTextComponent("gui.mechaddendums.clibloaded.quit"), (button) -> {
			this.minecraft.shutdown();
		}));
		
		this.addButton(new Button(this.width / 2 - 100, this.height / 6 + 96 - 6, 200, 20, new TranslationTextComponent("gui.mechaddendums.clibloaded.openmods"), (button) -> {
			Util.getOSType().openFile(FMLPaths.MODSDIR.get().toFile());
			this.minecraft.shutdown();
		}));
	}
	
	@Override
	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(matrixStack);
		drawCenteredString(matrixStack, this.font, this.title, this.width / 2, 50, 808080);
		drawCenteredString(matrixStack, this.font, new TranslationTextComponent("gui.mechaddendums.clibloaded.text2"), this.width / 2, 60, 808080);
		drawCenteredString(matrixStack, this.font, new TranslationTextComponent("gui.mechaddendums.clibloaded.text3"), this.width / 2, 70, 808080);
		drawCenteredString(matrixStack, this.font, new TranslationTextComponent("gui.mechaddendums.clibloaded.text4"), this.width / 2, 80, 808080);
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}
}
