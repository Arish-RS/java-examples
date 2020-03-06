package com.sample.oop;

class Addition {
  public void sum(int a, int b) {
    System.out.println("Sum is: " + (a + b));
  }

  public void sum(int a, int b, int c) {
    System.out.println("Sum is: " + (a + b + c));
  }

  public void sum(double a, double b) {
    System.out.println("Sum is: " + (a + b));
  }
}

public class OverloadingDemo {
  public static void main(String[] args) {
    Addition addition = new Addition();
    addition.sum(1, 2);
    addition.sum(1, 2, 3);
    addition.sum(1.5, 1.4);
  }
}
