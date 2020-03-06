package com.sample.oop;

class BankAccount {
  private double balance = 100000;
  private String username = "userName";
  private String password = "password";

  public double getWalletBalance(String username, String password) {
    if (username.equals(this.username) && password.equals(this.password)) {
      return this.balance;
    } else {
      return 0.0;
    }
  }
}

public class AccessAccount {
  public static void main(String[] args) {
    BankAccount x = new BankAccount();
    double balance = x.getWalletBalance("userName", "password");
    System.out.println("Balance is: " + balance);
  }
}
