package com.sample.oop;

public class Slap {
  public static void main(String[] args) {
    getDetailsAndMail();
  }

  public static void getDetailsAndMail() {
    // Code to fetch details from database
    System.out.println("Fetching details from database.");
    String details = "Details";
    emailTheUser(details);
  }

  public static void emailTheUser(String details) {
    System.out.println("Details: " + details);
    // Code to email the user
    System.out.println("Mailing to the user.");
  }
}
