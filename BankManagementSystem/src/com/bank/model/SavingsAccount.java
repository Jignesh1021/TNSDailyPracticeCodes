package com.bank.model;

public class SavingsAccount extends Account {

    private final double minBalance = 500;

    public SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Minimum balance required: 500");
        }
    }
}