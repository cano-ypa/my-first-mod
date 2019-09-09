package myfirstmod.common;

import myfirstmod.blocks.BlockMyFirstBlock;
import myfirstmod.blocks.BlockMyFirstGui;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(MyFirstMod.MODID)
public class MyFirstModBlocks {

  public static final Block MY_FIRST_BLOCK = null;
  public static final Block MY_FIRST_GUI_BLOCK = null;

  public static final void registerBlocks(IForgeRegistry<Block> registry) {
    final Block[] blocks = { init(new BlockMyFirstBlock(), "my_first_block", MyFirstMod.tabMyFirstMod),
        init(new BlockMyFirstGui(), "my_first_gui_block", MyFirstMod.tabMyFirstMod) };

    registry.registerAll(blocks);
  }

  private static final Block init(Block block, String registryName, CreativeTabs tab) {
    return block.setRegistryName(MyFirstMod.MODID, registryName)
        .setTranslationKey(MyFirstMod.MODID + "." + registryName).setCreativeTab(tab);
  };

}
