package myfirstmod.client.gui;

import java.util.ArrayList;

import myfirstmod.client.gui.element.GuiElement;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;

public class GuiBase extends GuiScreen {

  private FontRenderer fontRenderer = mc.fontRenderer;

  public ArrayList<GuiElement> elements = new ArrayList<GuiElement>();

  public GuiBase() {
  }

  @Override
  public void initGui() {
    super.initGui();
  }

  @Override
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    super.drawScreen(mouseX, mouseY, partialTicks);

    this.elements.forEach((GuiElement element) -> element.draw(this));
  }

  public void addGuiElement(GuiElement element) {
    this.elements.add(element);
  }

  public void drawTexturedRect(int x, int y, int textureX, int textureY, int width, int height) {
    this.drawTexturedModalRect(x, y, textureX, textureY, width, height);
  }

  public void drawString(String text, int x, int y, int color) {
    this.drawCenteredString(fontRenderer, text, x, y, color);
  }

}
