package myfirstmod.container.slots;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.inventory.Slot;

public class SlotList {

  private List<Slot> slotList = new ArrayList<Slot>();

  public final void pushSlot(Slot slot) {
    slotList.add(slot);
  }

  public final List<Slot> getList() {
    return slotList;
  }

}
