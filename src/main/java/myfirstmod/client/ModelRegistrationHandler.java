package myfirstmod.client;

import myfirstmod.common.MyFirstMod;
import myfirstmod.common.MyFirstModBlocks;
import myfirstmod.common.MyFirstModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = MyFirstMod.MODID)
public final class ModelRegistrationHandler {

  @SubscribeEvent
  public static final void registerModels(ModelRegistryEvent event) {
    registerBlockModels();
    registerItemModels();
  }

  private static final void registerModel(Item item, int meta) {
    ModelLoader.setCustomModelResourceLocation(item, meta,
        new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }

  private static final void registerBlockModels() {
    registerModel(Item.getItemFromBlock(MyFirstModBlocks.MY_FIRST_BLOCK), 0);
    registerModel(Item.getItemFromBlock(MyFirstModBlocks.MY_FIRST_GUI_BLOCK), 0);
  }

  private static final void registerItemModels() {
    registerModel(MyFirstModItems.MY_FIRST_ITEM, 0);
  }
}
