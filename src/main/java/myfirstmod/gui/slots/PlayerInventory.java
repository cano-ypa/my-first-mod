package myfirstmod.gui.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class PlayerInventory extends SlotList {

  public PlayerInventory(IInventory inventory, int startX, int startY) {
    for (int h = 0; h < 9; h++) {
      pushSlot(new Slot(inventory, h, startX + h * 18, startY + 58));
    }

    for (int v = 0; v < 3; v++) {
      for (int h = 0; h < 9; h++) {
        pushSlot(new Slot(inventory, 9 + v * 9 + h, startX + h * 18, startY + v * 18));
      }
    }
  }

}
