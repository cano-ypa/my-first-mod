package myfirstmod.common;

import myfirstmod.blocks.BlockMyFirstBlock;
import myfirstmod.blocks.BlockMyFirstGUI;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(MyFirstMod.MODID)
public class MyFirstModBlocks {

  public static final Block MY_FIRST_BLOCK = null;
  public static final Block MY_FIRST_GUI_BLOCK = null;

  public static final void registerBlocks(IForgeRegistry<Block> registry) {
    final Block[] blocks = { new BlockMyFirstBlock(), new BlockMyFirstGUI() };

    registry.registerAll(blocks);
  }

}
