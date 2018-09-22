package edu.alsie.isp;

public class GamerAthlete implements Typeable, Athlete {

  public void type() {
    System.out.println("Typing");
  }

  public void play() {
    this.type();
  }
}
