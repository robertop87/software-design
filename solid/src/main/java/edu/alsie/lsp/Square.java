package edu.alsie.lsp;

public class Square implements Shape {

  private int size;

  public Square() {
  }

  public Square(int size) {
    this.size = size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public double calculateArea() {
    return this.size*this.size;
  }
}
