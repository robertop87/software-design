package edu.alsie.lsp;

public class Triangle extends Rectangle {

  public Triangle(int width, int height) {
    super(width, height);
  }

  @Override
  public double calculateArea() {
    return super.calculateArea()*0.5;
  }
}
