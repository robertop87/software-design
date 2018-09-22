package edu.alsie.isp;

public class NormalAthlete implements Jumpable, Athlete {

  public void jump() {
    System.out.println("Jumping");
  }

  public void play() {
    this.run();
    this.jump();
  }
}
