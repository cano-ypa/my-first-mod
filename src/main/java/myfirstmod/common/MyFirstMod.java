package myfirstmod.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import myfirstmod.blocks.tile.TileMyFirstGui;
import myfirstmod.client.ModelRegistrationHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MyFirstMod.MODID, name = MyFirstMod.MODNAME, version = MyFirstMod.MODVERSION, acceptedMinecraftVersions = MyFirstMod.MCVERSION)
@EventBusSubscriber()
public class MyFirstMod {

  public static final String MODID = "myfirstmod";
  public static final String MODNAME = "My First Mod";
  public static final String MODVERSION = "0.0.1";
  public static final String MCVERSION = "[1.12.2]";

  public static final CreativeTabs tabMyFirstMod = new CreativeTabMyFirstMod();

  @Instance(MODID)
  public static MyFirstMod instance;

  public static final Logger logger = LogManager.getLogger(MODNAME);

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    // GUI
    NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

    // Tile Entity の登録
    final TileMyFirstGui TILE_MYFIRSTGUI = new TileMyFirstGui();
    GameRegistry.registerTileEntity(TILE_MYFIRSTGUI.getClass(),
        new ResourceLocation("myfirstmod", "my_first_gui_block"));
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
  }

  @SubscribeEvent
  public static void registerBlocks(Register<Block> event) {
    MyFirstModBlocks.registerBlocks(event.getRegistry());
  }

  @SubscribeEvent
  public static void registerItems(Register<Item> event) {
    MyFirstModItems.registerItems(event.getRegistry());
    MyFirstModItems.registerItemBlocks(event.getRegistry());
  }

  @SubscribeEvent
  public static final void registerModels(ModelRegistryEvent event) {
    ModelRegistrationHandler.registerBlockModels();
    ModelRegistrationHandler.registerItemModels();
  }

}
