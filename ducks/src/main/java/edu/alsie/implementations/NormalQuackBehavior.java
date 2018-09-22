package edu.alsie.implementations;

import edu.alsie.behaviors.QuackBehavior;

public class NormalQuackBehavior implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quacking");
  }
}
