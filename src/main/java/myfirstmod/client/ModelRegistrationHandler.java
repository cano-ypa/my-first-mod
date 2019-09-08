package myfirstmod.client;

import myfirstmod.common.MyFirstModBlocks;
import myfirstmod.common.MyFirstModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class ModelRegistrationHandler {

  private static final void registerModel(Item item, int meta) {
    ModelLoader.setCustomModelResourceLocation(item, meta,
        new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }

  public static final void registerBlockModels() {
    registerModel(Item.getItemFromBlock(MyFirstModBlocks.MY_FIRST_BLOCK), 0);
    registerModel(Item.getItemFromBlock(MyFirstModBlocks.MY_FIRST_GUI_BLOCK), 0);
  }

  public static final void registerItemModels() {
    registerModel(MyFirstModItems.MY_FIRST_ITEM, 0);
  }

}
