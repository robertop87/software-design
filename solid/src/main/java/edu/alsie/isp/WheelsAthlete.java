package edu.alsie.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WheelsAthlete implements Typeable, Athlete {

  public void play() {
    this.run();
    this.type();
  }

  public void type() {
    System.out.println("Typing");
  }

  @Override
  public void run() {
    System.out.println("Run with wheels");
  }
}
