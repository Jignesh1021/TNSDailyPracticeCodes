package com.bank.model;

public class CurrentAccount extends Account {

    public CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw successful (no limit)");
    }
}