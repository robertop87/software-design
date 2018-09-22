package edu.alsie.implementations;

import edu.alsie.behaviors.QuackBehavior;

public class SilentQuackBehavior implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("say nothing");
  }
}
