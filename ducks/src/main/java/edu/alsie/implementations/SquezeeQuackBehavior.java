package edu.alsie.implementations;

import edu.alsie.behaviors.QuackBehavior;

public class SquezeeQuackBehavior implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squezeeing");
  }
}
