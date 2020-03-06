package com.sample.oop;

class Account {
  private double balance;

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}

public class EncapsulationDemo {
  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(30000);
    System.out.println("Balance is: " + account.getBalance());
  }
}
