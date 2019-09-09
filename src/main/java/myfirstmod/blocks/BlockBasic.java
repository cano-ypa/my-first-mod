package myfirstmod.blocks;

import myfirstmod.common.MyFirstMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

  protected BlockBasic() {
    super(Material.IRON);

    setCreativeTab(MyFirstMod.tabMyFirstMod);
    setSoundType(SoundType.STONE);
  }

}
