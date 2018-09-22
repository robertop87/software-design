package edu.alsie;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StoneDuck extends Duck {

  @Override
  public void swim() {
    throw new NotImplementedException();
  }

  @Override
  public void quack() {
    throw new NotImplementedException();
  }

  @Override
  public void display() {
    System.out.println("Show Stone Duck");
  }
}
