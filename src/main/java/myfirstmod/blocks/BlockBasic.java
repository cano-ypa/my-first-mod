package myfirstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

  protected BlockBasic() {
    super(Material.IRON);

    setSoundType(SoundType.STONE);
  }

}
