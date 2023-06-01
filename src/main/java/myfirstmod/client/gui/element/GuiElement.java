package myfirstmod.client.gui.element;

import myfirstmod.client.gui.GuiBase;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public abstract class GuiElement {

  public static final Minecraft minecraft = Minecraft.getMinecraft();

  protected final ResourceLocation RESOURCE;

  public GuiElement(ResourceLocation resource) {
    this.RESOURCE = resource;
  }

  public abstract void draw(GuiBase gui);

  public abstract void onClick();

}
