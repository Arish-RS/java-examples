package com.sample.oop;

import java.util.ArrayList;

interface Mobile {
  public void calling(String number);
  public void sendMessage(String message);
}

class Apple implements Mobile {
  private ArrayList<String> contacts = new ArrayList<String>();

  public void addContact(String number) {
    this.contacts.add(number);
  }

  @Override
  public void calling(String number) {
    System.out.println("Calling..." + number);
  }

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending message..." + message);
  }
}

public class AbstractionDemo {
  public static void main(String[] args) {
    Apple applePhone = new Apple();
    applePhone.calling("7634587364");
    applePhone.sendMessage("Hello There!");
    applePhone.addContact("8247392763");

    System.out.println();
    Samsung samsungPhone = new Samsung();
    samsungPhone.addContact("98765432123");
    samsungPhone.calling("8765678998");
    samsungPhone.sendMessage("Test Message");
  }
}

abstract class MobileClass {
  ArrayList<String> list = new ArrayList<>();

  abstract void calling(String number);

  abstract void sendMessage(String message);

  public void addContact(String number) {
    this.list.add(number);
  }
}

class Samsung extends MobileClass {

  @Override
  void calling(String number) {
    System.out.println("Calling..." + number);
  }

  @Override
  void sendMessage(String message) {
    System.out.println("Sending Message..." + message);
  }
}