package edu.alena.lsp;

public class LspClient {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(10);
    rectangle.setWidth(8);
    System.out.println("Rectangle 8x10 = " + rectangle.calculateArea());

    Rectangle rectangle1 = new Rectangle();
    rectangle1.setHeight(15);
    rectangle1.setWidth(20);
    System.out.println("Rectangle 8x10 = " + rectangle1.calculateArea());

    Square square = new Square();
    square.setHeight(10); // no effect
    square.setWidth(7);
    System.out.println("Square 7 = " + square.calculateArea());

    Rectangle testRectangle = new Square();
    testRectangle.setWidth(9);
    testRectangle.setHeight(10);
    System.out.println("Rectangle 9x10 = " + testRectangle.calculateArea());
  }
}
