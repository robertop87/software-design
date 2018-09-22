package edu.alsie;

import edu.alsie.behaviors.DisplayBehavior;
import edu.alsie.behaviors.FlyBehavior;
import edu.alsie.behaviors.QuackBehavior;
import edu.alsie.behaviors.SwimBehavior;

public class Duck {

  private QuackBehavior quackBehavior;
  private FlyBehavior flyBehavior;
  private SwimBehavior swimBehavior;
  private DisplayBehavior displayBehavior;

  public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior,
      SwimBehavior swimBehavior, DisplayBehavior displayBehavior) {
    this.quackBehavior = quackBehavior;
    this.flyBehavior = flyBehavior;
    this.swimBehavior = swimBehavior;
    this.displayBehavior = displayBehavior;
  }

  public void animate() {
    this.flyBehavior.fly();
    this.quackBehavior.quack();
    this.swimBehavior.swim();
    this.displayBehavior.display();
  }

  public void setDisplayBehavior(DisplayBehavior displayBehavior) {
    this.displayBehavior = displayBehavior;
  }
}
