package myfirstmod.common;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.client.gui.GuiMyFirstGui;
import myfirstmod.gui.MyFirstGUI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

  public static final int MY_FIRST_GUI = 0;

  @Override
  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return new MyFirstGUI(player.inventory, (TileMyFirstGui) world.getTileEntity(new BlockPos(x, y, z)));
  }

  @Override
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return new GuiMyFirstGui(player.inventory, (TileMyFirstGui) world.getTileEntity(new BlockPos(x, y, z)));
  }
  
}
