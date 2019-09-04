package myfirstmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabMyFirstMod extends CreativeTabs {

  public CreativeTabMyFirstMod() {
    super("myfirstmod");
  }

  @SideOnly(Side.CLIENT)
  @Override
  public ItemStack createIcon() {
    return new ItemStack(MyFirstModItems.MY_FIRST_ITEM);
  }

}
