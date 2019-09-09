package myfirstmod.blocks.tile;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileMyFirstGui extends TileEntity {
  private ItemStackHandler itemStackHandler = new ItemStackHandler(9);

  @Override
  public void readFromNBT(NBTTagCompound compound) {
    itemStackHandler.deserializeNBT(compound.getCompoundTag("inventory"));
    super.readFromNBT(compound);
  }

  @Override
  public NBTTagCompound writeToNBT(NBTTagCompound compound) {
    compound.setTag("inventory", itemStackHandler.serializeNBT());
    return super.writeToNBT(compound);
  }

  @Override
  public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
    return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
  }

  @SuppressWarnings("unchecked")
  @Nullable
  @Override
  public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
    return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ? (T) itemStackHandler
        : super.getCapability(capability, facing);
  }
}
