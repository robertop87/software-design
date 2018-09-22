package edu.alsie.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ClientMain {

  public static void main(String[] args) {
    Athlete normalAthlete = new NormalAthlete();

    normalAthlete.play();

    Athlete normalAthleteRobert = new NormalAthlete();

    normalAthleteRobert.play();

    Athlete wheelsNormalAthlete = new WheelsAthlete();
    wheelsNormalAthlete.play();

    Athlete gamerNormalAthlete = new GamerAthlete();
    gamerNormalAthlete.play();
  }
}
