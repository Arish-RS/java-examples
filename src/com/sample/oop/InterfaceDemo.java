package com.sample.oop;

public interface InterfaceDemo {
  static final String a = "static constant";

  public void methodOne();

  public int methodTwo();

  static void methodThree() {}

  default int methodFour() {
    return 0;
  }

  private void methodFive() {}
}

class Test implements InterfaceDemo {

  @Override
  public void methodOne() {
  }

  @Override
  public int methodTwo() {
    return 0;
  }
}
