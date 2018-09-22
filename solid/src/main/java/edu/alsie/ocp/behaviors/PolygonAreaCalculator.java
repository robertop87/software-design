package edu.alsie.ocp.behaviors;

import edu.alsie.ocp.AreaCalculator;
import java.awt.Point;
import java.util.List;

public class PolygonAreaCalculator implements AreaCalculator {

  private List<Point> points;

  public PolygonAreaCalculator(List<Point> points) {
    this.points = points;
  }

  @Override
  public double calculateArea() {
    // add logic to  calculate area based on points
    return 50;
  }
}
