package myfirstmod.items;

import myfirstmod.common.MyFirstMod;
import net.minecraft.item.Item;

public class ItemBasic extends Item {
  protected ItemBasic(String name) {
    setRegistryName(MyFirstMod.MODID, name);
    setTranslationKey(MyFirstMod.MODID + "." + name);
    setCreativeTab(MyFirstMod.tabMyFirstMod);
  }
}
