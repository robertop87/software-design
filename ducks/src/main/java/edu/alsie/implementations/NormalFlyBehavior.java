package edu.alsie.implementations;

import edu.alsie.behaviors.FlyBehavior;

public class NormalFlyBehavior implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Flying");
  }
}
