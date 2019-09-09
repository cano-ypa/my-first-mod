package myfirstmod.items;

import myfirstmod.common.GuiHandler;
import myfirstmod.common.MyFirstMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemGuiTest extends ItemBasic {
  public ItemGuiTest() {
    super();
  }

  @Override
  public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
    ItemStack itemStack = player.getHeldItem(hand);
    BlockPos pos = player.getPosition();

    player.openGui(MyFirstMod.instance, GuiHandler.GUI_TEST, world, pos.getX(), pos.getY(), pos.getZ());

    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStack);
  }
}
