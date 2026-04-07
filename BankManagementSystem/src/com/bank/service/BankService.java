package com.bank.service;

import java.util.ArrayList;
import com.bank.model.Account;

public class BankService {

    private ArrayList<Account> accounts = new ArrayList<>();

    // Add account
    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account created successfully");
    }

    // Find account
    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    // Deposit
    public void deposit(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    // Withdraw
    public void withdraw(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    // Display account
    public void display(int accNo) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.display();
        } else {
            System.out.println("Account not found");
        }
    }
}