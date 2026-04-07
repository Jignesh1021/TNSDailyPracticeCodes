package com.bank.util;

import java.util.Scanner;

public class BankUtil {

    public static int menu(Scanner sc) {
        System.out.println("\n---- Bank Menu ----");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display Account");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        return sc.nextInt();
    }
}