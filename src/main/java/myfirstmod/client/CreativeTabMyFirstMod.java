package myfirstmod.client;

import myfirstmod.common.MyFirstModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CreativeTabMyFirstMod extends CreativeTabs {

  public CreativeTabMyFirstMod() {
    super("myfirstmod");
  }

  @Override
  public ItemStack createIcon() {
    return new ItemStack(MyFirstModItems.MY_FIRST_ITEM);
  }

}
