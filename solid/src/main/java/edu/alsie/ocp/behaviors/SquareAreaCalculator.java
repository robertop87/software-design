package edu.alsie.ocp.behaviors;

import edu.alsie.ocp.AreaCalculator;

public class SquareAreaCalculator implements AreaCalculator {

  private int size;

  public SquareAreaCalculator(int size) {
    this.size = size;
  }

  @Override
  public double calculateArea() {
    return this.size*this.size;
  }
}
