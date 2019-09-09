package myfirstmod.client.gui;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.container.MyFirstGUI;
import myfirstmod.util.MyFirstModUtils;
import myfirstmod.util.MyFirstModUtils.ResourceType;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiMyFirstGui extends GuiContainer {

  public GuiMyFirstGui(IInventory inventory, TileMyFirstGui tile) {
    super(new MyFirstGUI(inventory, tile));
  }

  @Override
  protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    fontRenderer.drawString("My First GUI", 0, 0, 4210752);
  }

  @Override
  protected void drawGuiContainerBackgroundLayer(float arg0, int arg1, int arg2) {
    this.drawDefaultBackground();
    this.mc.getTextureManager().bindTexture(MyFirstModUtils.getResource(ResourceType.GUI, "my_first_gui.png"));
    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 176, 166);
  }

}
