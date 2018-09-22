package edu.alsie.isp;

public interface Athlete {

  void play();

  default void run() {
    System.out.println("Running");
  }
}
