package edu.alsie.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ClientMain {

  public static void main(String[] args) {
    Athlete athlete = new Athlete();

    athlete.run();
    athlete.jump();

    Athlete athleteRobert = new Athlete();

    athleteRobert.run();
    athleteRobert.jump();

    Athlete wheelsAthlete = new WheelsAthlete();
    try{
      wheelsAthlete.jump();
      wheelsAthlete.jump();
      wheelsAthlete.jump();
      wheelsAthlete.jump();
      wheelsAthlete.jump();
      wheelsAthlete.run();
    } catch (NotImplementedException nie) {}

    Athlete gamerAthlete = new GamerAthlete();
    gamerAthlete.run();
    gamerAthlete.jump();
    ((GamerAthlete) gamerAthlete).type();
  }
}
