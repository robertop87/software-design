package edu.alena.ocp;

import edu.alena.ocp.behaviors.PolygonAreaCalculator;
import edu.alena.ocp.behaviors.SquareAreaCalculator;
import java.util.Collections;

public class OcpClient {

  public static void main(String[] args) {
    AreaCalculator squareCalculator = new SquareAreaCalculator(8);
    Shape square = new Shape(squareCalculator);

    System.out.println("Square 8 = " + square.calculateArea());

    AreaCalculator polygonCalculator = new PolygonAreaCalculator(Collections.emptyList());
    System.out.println("Polygon = " + polygonCalculator.calculateArea());
  }
}
