package com.sample.oop;

class Vehicle {
  public void run() {
    System.out.println("Vehicle is Running.");
  }

  static void sayHello() {
    System.out.println("Hello is said.");
  }
}

class Car extends Vehicle {
  public void run() {
    System.out.println("Car is Running");
  }
}

public class Overriding {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.run();
    Car.sayHello();
  }
}
