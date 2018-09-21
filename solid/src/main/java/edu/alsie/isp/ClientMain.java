package edu.alsie.isp;

public class ClientMain {

  public static void main(String[] args) {
    Athlete athlete = new Athlete();

    athlete.run();
    athlete.jump();

    Athlete athleteRobert = new Athlete();

    athleteRobert.run();
    athleteRobert.jump();

    Athlete wheelsAthlete = new Athlete();
    wheelsAthlete.run();
    wheelsAthlete.jump();
  }
}
