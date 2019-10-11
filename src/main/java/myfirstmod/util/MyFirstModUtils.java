package myfirstmod.util;

import myfirstmod.common.ModInfo;
import net.minecraft.util.ResourceLocation;

public class MyFirstModUtils {

  public static ResourceLocation getResource(ResourceType type, String name) {
    return new ResourceLocation(ModInfo.MODID, type.get() + name + ".png");
  }

  public static enum ResourceType {
    GUI("textures/gui/"), BLOCK("textures/blocks/"), ITEMS("textures/items/"), MODEL("models/");

    private String prefix;

    private ResourceType(String s) {
      prefix = s;
    }

    public String get() {
      return prefix;
    }
  }
}
