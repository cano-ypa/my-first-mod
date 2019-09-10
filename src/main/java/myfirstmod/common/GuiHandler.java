package myfirstmod.common;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.blocks.tile.TileNull;
import myfirstmod.client.gui.GuiMyFirstGui;
import myfirstmod.client.gui.GuiTest;
import myfirstmod.container.ContainerMyFirstGui;
import myfirstmod.container.ContainerNull;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

  public static final int MY_FIRST_GUI = 0;
  public static final int GUI_TEST = 1;

  @Override
  public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    switch (id) {
    case MY_FIRST_GUI:
      return new ContainerMyFirstGui(player.inventory, (TileMyFirstGui) world.getTileEntity(new BlockPos(x, y, z)));
    case GUI_TEST:
      return new ContainerNull();
    }

    return null;
  }

  @Override
  public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    switch (id) {
    case MY_FIRST_GUI:
      return new GuiMyFirstGui(player.inventory, (TileMyFirstGui) world.getTileEntity(new BlockPos(x, y, z)));
    case GUI_TEST:
      return new GuiTest(player.inventory, (TileNull) world.getTileEntity(new BlockPos(x, y, z)));
    }

    return null;
  }

}
