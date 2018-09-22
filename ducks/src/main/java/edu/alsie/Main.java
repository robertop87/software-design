package edu.alsie;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Arrays.asList(new Duck(),
        new RedHeadDuck(),
        new RubberDuck(),
        new StoneDuck())
      .forEach(duck -> {
        duck.display();
        duck.fly();
        duck.swim();
        duck.quack();
      });
  }
}
