package myfirstmod.client.gui;

import java.util.ArrayList;

import myfirstmod.client.gui.element.GuiElement;
import net.minecraft.client.gui.GuiScreen;

public class GuiBase extends GuiScreen {

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

    this.elements.forEach((GuiElement element) -> element.draw());
  }

  public void addGuiElement(GuiElement element) {
    this.elements.add(element);
  }

}
