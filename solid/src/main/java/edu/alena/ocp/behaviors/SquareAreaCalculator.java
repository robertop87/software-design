package edu.alena.ocp.behaviors;

import edu.alena.ocp.AreaCalculator;

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
