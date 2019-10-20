package myfirstmod.client.gui.element;

import myfirstmod.client.gui.GuiBase;
import net.minecraft.util.ResourceLocation;

public class GuiButtonElement extends GuiElement {

  private String text;
  private int posX = 0;
  private int posY = 0;
  private int width = 200;
  private int height = 20;

  public GuiButtonElement(String text, int posX, int posY, int width, int height) {
    super(new ResourceLocation("textures/gui/widgets.png"));

    this.text = text;
    this.posX = posX;
    this.posY = posY;
    this.width = width;
    this.height = height;
  }

  public void draw(GuiBase gui) {
    minecraft.renderEngine.bindTexture(this.RESOURCE);

    gui.drawTexturedRect(this.posX, this.posY, 0, 46, this.width / 2, this.height);
    gui.drawTexturedRect(this.posX + this.width / 2, this.posY, 200 - this.width / 2, 46, this.width / 2, this.height);
    gui.drawString(this.text, this.posX + this.width / 2, this.posY + (this.height - 8) / 2, 14737632);
  }

}
