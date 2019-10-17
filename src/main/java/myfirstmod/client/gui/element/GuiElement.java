package myfirstmod.client.gui.element;

import net.minecraft.client.Minecraft;

public abstract class GuiElement {

  public static final Minecraft minecraft = Minecraft.getMinecraft();

  public GuiElement() {
  }

  public abstract void draw();

}
