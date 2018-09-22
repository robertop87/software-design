package edu.alsie.ocp;

public class Shape {

  private AreaCalculator areaCalculator;

  public Shape(AreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }

  public double calculateArea() {
    return this.areaCalculator.calculateArea();
  }
}
