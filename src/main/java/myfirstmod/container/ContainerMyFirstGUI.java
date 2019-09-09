package myfirstmod.container;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.container.slots.MyFirstGUISlot;
import myfirstmod.container.slots.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerMyFirstGUI extends ContainerBasic {

  public ContainerMyFirstGUI(IInventory inventory, TileMyFirstGui tile) {
    super();

    IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);

    addSlots(new MyFirstGUISlot(itemHandler, 62, 17));
    addSlots(new PlayerInventory(inventory, 8, 84));
  }

}
