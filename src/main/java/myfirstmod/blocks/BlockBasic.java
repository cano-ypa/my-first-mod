package myfirstmod.blocks;

import myfirstmod.common.MyFirstMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {
  protected BlockBasic(String name) {
    super(Material.IRON);

    setRegistryName(MyFirstMod.MODID, name);
    setTranslationKey(MyFirstMod.MODID + "." + name);
    setCreativeTab(MyFirstMod.tabMyFirstMod);
    setSoundType(SoundType.STONE);
  }
}
