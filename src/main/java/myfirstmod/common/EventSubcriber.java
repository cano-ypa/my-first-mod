package myfirstmod.common;

import myfirstmod.blocks.BlockMyFirstBlock;
import myfirstmod.items.ItemMyFirstItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MyFirstMod.MODID)
public final class EventSubcriber {

  @SubscribeEvent
  public static void registerBlocks(Register<Block> event) {
    final Block[] blocks = { new BlockMyFirstBlock() };

    event.getRegistry().registerAll(blocks);
  }

  @SubscribeEvent
  public static void registerItems(Register<Item> event) {
    final Item[] items = {

        new ItemMyFirstItem(),

        new ItemBlock(MyFirstModBlocks.MY_FIRST_BLOCK)
            .setRegistryName(MyFirstModBlocks.MY_FIRST_BLOCK.getRegistryName()) };

    event.getRegistry().registerAll(items);
  }

}
