package myfirstmod.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

@Mod(modid = ModInfo.MODID, name = ModInfo.MODNAME, version = ModInfo.MODVERSION, guiFactory = ModInfo.GUIFACTORY, acceptedMinecraftVersions = ModInfo.MCVERSION)
@EventBusSubscriber()
public class MyFirstMod {

  @Instance(ModInfo.MODID)
  public static MyFirstMod instance;

  public static final Logger logger = LogManager.getLogger(ModInfo.MODNAME);

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
  }

  @SubscribeEvent
  public static void registerBlocks(Register<Block> event) {
  }

  @SubscribeEvent
  public static void registerItems(Register<Item> event) {
  }

  @SubscribeEvent
  public static final void registerModels(ModelRegistryEvent event) {
  }

}
