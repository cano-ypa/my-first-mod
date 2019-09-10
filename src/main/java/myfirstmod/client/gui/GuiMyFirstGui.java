package myfirstmod.client.gui;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.container.ContainerMyFirstGui;
import myfirstmod.util.MyFirstModUtils;
import myfirstmod.util.MyFirstModUtils.ResourceType;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiMyFirstGui extends GuiContainer {

  public GuiMyFirstGui(IInventory inventory, TileMyFirstGui tile) {
    super(new ContainerMyFirstGui(inventory, tile));
  }

  @Override
  protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    fontRenderer.drawString(I18n.format("container.inventory"), 0, 0, 0x404040);
  }

  @Override
  protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    this.drawDefaultBackground();
    this.mc.getTextureManager().bindTexture(MyFirstModUtils.getResource(ResourceType.GUI, "my_first_gui"));
    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 176, 166);
  }

}
