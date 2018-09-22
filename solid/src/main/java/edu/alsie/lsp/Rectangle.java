package edu.alsie.lsp;

public class Rectangle implements Shape {

  private int width;
  private int height;

  public Rectangle() {
  }

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return this.width * this.height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
