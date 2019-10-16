package myfirstmod.client.gui.element;

public class GuiButtonElement extends GuiElement {

  private String text;
  private int posX = 0;
  private int posY = 0;
  private int width = 200;
  private int height = 20;

  public GuiButtonElement(String text, int posX, int posY, int width, int height) {
    this.text = text;
    this.posX = posX;
    this.posY = posY;
    this.width = width;
    this.height = height;
  }

  public void draw() {

  }

}
