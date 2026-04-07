package com.bank.model;

public class Account {

    protected String name;
    protected int accountNumber;
    protected double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw not allowed");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}