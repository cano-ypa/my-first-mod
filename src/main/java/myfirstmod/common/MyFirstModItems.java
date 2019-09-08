package myfirstmod.common;

import myfirstmod.items.ItemMyFirstItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(MyFirstMod.MODID)
public class MyFirstModItems {

  public static final Item MY_FIRST_ITEM = null;

  public static final void registerItems(IForgeRegistry<Item> registry) {
    final Item[] items = {

        new ItemMyFirstItem(),

        new ItemBlock(MyFirstModBlocks.MY_FIRST_BLOCK)
            .setRegistryName(MyFirstModBlocks.MY_FIRST_BLOCK.getRegistryName()),
        new ItemBlock(MyFirstModBlocks.MY_FIRST_GUI_BLOCK)
            .setRegistryName(MyFirstModBlocks.MY_FIRST_GUI_BLOCK.getRegistryName()) };

    registry.registerAll(items);
  }

}
