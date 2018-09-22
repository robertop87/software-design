package edu.alsie;

import edu.alsie.behaviors.DieDisplayBehavior;
import edu.alsie.behaviors.DisplayBehavior;
import edu.alsie.behaviors.FlyBehavior;
import edu.alsie.implementations.NoFlyBehavior;
import edu.alsie.implementations.NoSwimBehavior;
import edu.alsie.implementations.NormalFlyBehavior;
import edu.alsie.implementations.NormalQuackBehavior;
import edu.alsie.implementations.NormalSwimBehavior;
import edu.alsie.implementations.SilentQuackBehavior;
import edu.alsie.implementations.SquezeeQuackBehavior;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Duck mallard =
        new Duck(
            new NormalQuackBehavior(),
            new NormalFlyBehavior(),
            new NormalSwimBehavior(),
            new DisplayBehavior() {
              @Override
              public void display() {
                System.out.println("Mallard");
              }
            });

    Duck rubber =
        new Duck(
            new SquezeeQuackBehavior(),
            new NoFlyBehavior(),
            new NormalSwimBehavior(),
            new DisplayBehavior() {
              @Override
              public void display() {
                System.out.println("Rubber");
              }
            });

    Duck stone = new Duck(new SilentQuackBehavior(),
        new NoFlyBehavior(),
        new NoSwimBehavior(),
        new DisplayBehavior() {
          @Override
          public void display() {
            System.out.println("Stone");
          }
        });

    Duck rocket =
        new Duck(
            new SilentQuackBehavior(),
            new FlyBehavior() {
              @Override
              public void fly() {
                System.out.println("Fy as rocket");
              }
            },
            new NoSwimBehavior(),
            new DisplayBehavior() {
              @Override
              public void display() {
                System.out.println("Rocket!!");
              }
            });

    if (true) // collission
      mallard.setDisplayBehavior(new DieDisplayBehavior());

    Arrays.asList(mallard, rubber, stone, rocket)
      .forEach(Duck::animate);
  }
}
