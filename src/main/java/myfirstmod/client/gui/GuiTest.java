package myfirstmod.client.gui;

import myfirstmod.blocks.tile.TileNull;
import myfirstmod.container.ContainerNull;
import myfirstmod.util.MyFirstModUtils;
import myfirstmod.util.MyFirstModUtils.ResourceType;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiTest extends GuiContainer {

  public GuiTest(IInventory inventory, TileNull tileNull) {
    super(new ContainerNull(inventory, tileNull));
  }

  @Override
  protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    this.drawDefaultBackground();
    this.mc.getTextureManager().bindTexture(MyFirstModUtils.getResource(ResourceType.GUI, "my_first_gui.png"));
    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 176, 166);
  }

  @Override
  public void initGui() {
    super.initGui();

    this.buttonList.add(new GuiButton(1, 0, 0, 100, 20, "Hello World!!"));
  }

}
