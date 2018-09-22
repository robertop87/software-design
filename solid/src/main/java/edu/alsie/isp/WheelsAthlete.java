package edu.alsie.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WheelsAthlete implements AthleteRunnable, Typeable, Athlete {

  public void run() {
    System.out.println("Run with wheels");
  }

  public void play() {
    this.run();
    this.type();
  }

  public void type() {
    System.out.println("Typing");
  }
}
