package edu.alsie.lsp;

public class LspClient {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle(8, 10);
    System.out.println("Rectangle 8x10 = " + rectangle.calculateArea());

    Shape rectangle1 = new Rectangle(20, 15);
    System.out.println("Rectangle 20x15 = " + rectangle1.calculateArea());

    Shape square = new Square(7);
    System.out.println("Square 7 = " + square.calculateArea());

    Shape shape = new Square(9);
    System.out.println("Shape 9 = " + shape.calculateArea());

    final int triangleHeight = 5;
    final int triangleWidth = 5;

    Shape triangle = new Shape() {
      @Override
      public double calculateArea() {
        return 0.5*triangleHeight*triangleWidth;
      }
    };
    System.out.println("Triangle 10x10 = " + triangle.calculateArea());

    Shape realTriangle = new Triangle(15, 15);
    System.out.println("Triangle 15x15 = " + realTriangle.calculateArea());

  }
}
