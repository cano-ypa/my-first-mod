package myfirstmod.blocks;

import myfirstmod.common.GuiHandler;
import myfirstmod.common.MyFirstMod;
import myfirstmod.tile.TileMyFirstGui;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class BlockMyFirstGUI extends BlockBasicContainer {

  public BlockMyFirstGUI() {
    super("my_first_gui_block");
  }

  @Override
  public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
      EnumFacing side, float hitX, float hitY, float hitZ) {
    if (!world.isRemote) {
      if (!player.isSneaking()) {
        player.openGui(MyFirstMod.instance, GuiHandler.MY_FIRST_GUI, world, pos.getX(), pos.getY(), pos.getZ());
      }
    }
    return true;
  }

  @Override
  public void breakBlock(World world, BlockPos pos, IBlockState state) {
    TileMyFirstGui te = (TileMyFirstGui) world.getTileEntity(pos);
    IItemHandler itemHandler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
    ItemStack stack = itemHandler.getStackInSlot(0);
    if (!stack.isEmpty()) {
      EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
      world.spawnEntity(item);
    }
    super.breakBlock(world, pos, state);
  }

  @Override
  public TileEntity createNewTileEntity(World world, int meta) {
    return new TileMyFirstGui();
  }

}
