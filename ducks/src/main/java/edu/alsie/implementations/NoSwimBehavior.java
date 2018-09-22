package edu.alsie.implementations;

import edu.alsie.behaviors.SwimBehavior;

public class NoSwimBehavior implements SwimBehavior {

  @Override
  public void swim() {
    System.out.println("I can't Swim");
  }
}
