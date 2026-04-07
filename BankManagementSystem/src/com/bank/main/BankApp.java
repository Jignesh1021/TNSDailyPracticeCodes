package com.bank.main;

import java.util.Scanner;
import com.bank.model.*;
import com.bank.service.BankService;
import com.bank.util.BankUtil;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        int choice;

        do {
            choice = BankUtil.menu(sc);

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    System.out.print("1. Savings  2. Current: ");
                    int type = sc.nextInt();

                    if (type == 1)
                        service.addAccount(new SavingsAccount(name, accNo, bal));
                    else
                        service.addAccount(new CurrentAccount(name, accNo, bal));
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double dep = sc.nextDouble();
                    service.deposit(accNo, dep);
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wd = sc.nextDouble();
                    service.withdraw(accNo, wd);
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    service.display(accNo);
                    break;

                case 5:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}