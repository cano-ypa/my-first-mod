package myfirstmod.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiConfig extends GuiScreen {

  public GuiConfig(GuiScreen parentScreen) {
  }

  @Override
  public void initGui() {
    super.initGui();

    buttonList.add(new GuiButton(0, this.width / 2, this.height / 2, "Button"));
  }

  @Override
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    this.drawDefaultBackground();
    this.drawCenteredString(fontRenderer, "Config", this.width / 2, 20, 0xFFFFFF);

    super.drawScreen(mouseX, mouseY, partialTicks);
  }

}
