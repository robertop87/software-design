package edu.alsie.isp;

public class NormalAthlete implements AthleteRunnable, Jumpable, Athlete {

  public void jump() {
    System.out.println("Jumping");
  }

  public void run() {
    System.out.println("Running");
  }

  public void play() {
    this.run();
    this.jump();
  }
}
