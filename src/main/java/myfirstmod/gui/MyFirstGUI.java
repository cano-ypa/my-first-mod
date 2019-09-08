package myfirstmod.gui;

import myfirstmod.tile.TileMyFirstGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class MyFirstGUI extends Container {

  public MyFirstGUI(IInventory inventory, TileMyFirstGui tile) {
    IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);

    if (inventory != null) {
      addSlots(itemHandler);
      addInventorySlots(inventory);
    }
  }

  protected void addSlots(IItemHandler itemHandler) {
    addSlotToContainer(new SlotItemHandler(itemHandler, 0, 0, 16));
  }

  protected void addInventorySlots(IInventory inventory) {
    addSlotToContainer(new Slot(inventory, 0, 0, 32));
  }

  @Override
  public boolean canInteractWith(EntityPlayer player) {
    return true;
  }

  @Override
  public ItemStack transferStackInSlot(EntityPlayer player, int index) {
    ItemStack itemstack = ItemStack.EMPTY;
    Slot slot = inventorySlots.get(index);
    if (slot != null && slot.getHasStack()) {
      ItemStack itemstack1 = slot.getStack();
      itemstack = itemstack1.copy();
      int containerSlots = inventorySlots.size() - player.inventory.mainInventory.size();
      if (index < containerSlots) {
        if (!this.mergeItemStack(itemstack1, containerSlots, inventorySlots.size(), true)) {
          return ItemStack.EMPTY;
        }
      } else if (!this.mergeItemStack(itemstack1, 0, containerSlots, false)) {
        return ItemStack.EMPTY;
      }
      if (itemstack1.getCount() == 0) {
        slot.putStack(ItemStack.EMPTY);
      } else {
        slot.onSlotChanged();
      }
      if (itemstack1.getCount() == itemstack.getCount()) {
        return ItemStack.EMPTY;
      }
      slot.onTake(player, itemstack1);
    }
    return itemstack;
  }

}
