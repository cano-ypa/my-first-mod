package myfirstmod.container;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.container.slots.MyFirstGuiSlot;
import myfirstmod.container.slots.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerMyFirstGui extends ContainerBasic {

  public ContainerMyFirstGui(IInventory inventory, TileMyFirstGui tileNull) {
    super();

    IItemHandler itemHandler = tileNull.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);

    addSlots(new MyFirstGuiSlot(itemHandler, 62, 17));
    addSlots(new PlayerInventory(inventory, 8, 84));
  }

}
