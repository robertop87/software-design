package edu.alsie.implementations;

import edu.alsie.behaviors.SwimBehavior;

public class NormalSwimBehavior implements SwimBehavior {

  @Override
  public void swim() {
    System.out.println("Swimming");
  }
}
