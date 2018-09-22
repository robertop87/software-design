package edu.alsie;

public class Main {

  public static void main(String[] args) {
    Duck mallardDuck = new Duck();

    mallardDuck.swim();
    mallardDuck.quack();
    mallardDuck.display();

    Duck readHeadDuck = new RedHeadDuck();

    readHeadDuck.swim();
    readHeadDuck.quack();
    readHeadDuck.display();

    Duck rubberDuck = new RubberDuck();

    rubberDuck.swim();
    rubberDuck.quack();
    rubberDuck.display();
  }
}
