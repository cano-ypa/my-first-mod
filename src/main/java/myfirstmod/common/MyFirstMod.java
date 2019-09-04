package myfirstmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MyFirstMod.MODID, name = MyFirstMod.MODNAME, version = MyFirstMod.MODVERSION, acceptedMinecraftVersions = MyFirstMod.MCVERSION)
public class MyFirstMod {

  public static final String MODID = "myfirstmod";
  public static final String MODNAME = "My First Mod";
  public static final String MODVERSION = "0.0.1";
  public static final String MCVERSION = "[1.12.2]";

  public static final CreativeTabs tabMyFirstMod = new CreativeTabMyFirstMod();

  public static final Logger logger = LogManager.getLogger(MODNAME);

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    // some example code
    logger.info("--------------------------------------------------");
    logger.info(MODNAME + " is active!!");
    logger.info("--------------------------------------------------");
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
  }

}
