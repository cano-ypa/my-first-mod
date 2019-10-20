package myfirstmod.client.gui.element;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;

public abstract class GuiElement {

  public static final Minecraft minecraft = Minecraft.getMinecraft();

  protected final ResourceLocation RESOURCE;

  public GuiElement(ResourceLocation resource) {
    this.RESOURCE = resource;
  }

  public abstract void draw(Gui gui);

}
