package edu.alsie.isp;

import java.util.Arrays;
import java.util.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ClientMain {

  public static void main(String[] args) {
    List<Athlete> athletes = Arrays.asList(
        new NormalAthlete(),
        new NormalAthlete(),
        new WheelsAthlete(),
        new GamerAthlete());

    athletes.forEach(Athlete::play);
    /*
    for (Athlete athlete : athletes) {
      athlete.play();
    }*/
  }
}
