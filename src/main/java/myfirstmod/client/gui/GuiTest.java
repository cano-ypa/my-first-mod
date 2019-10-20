package myfirstmod.client.gui;

import myfirstmod.blocks.tile.TileNull;
import myfirstmod.client.gui.element.GuiButtonElement;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiTest extends GuiBase {

  public GuiTest(IInventory inventory, TileNull tile) {
    this.addGuiElement(new GuiButtonElement("Button", 0, 0, 200, 20));
  }

}
