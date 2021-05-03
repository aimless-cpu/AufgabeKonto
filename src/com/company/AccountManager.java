package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String customerInputString;
        customerInputString = sc.next();

        Customer c = new Customer(customerInputString);
        System.out.println("1 set name");

        System.out.println(c.getCustomerName() + " " + c.getCustomerNumber());

        //int customerInputInt;
        List<Account> accounts = new ArrayList<>();

        while(true){


            Double customerInputDouble;

            //createAccountSavings()
            System.out.println("1 create AccountSavings");
            System.out.println("2 create AccountChecking");
            System.out.println("5 continue");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    AccountSavings as = new AccountSavings(100,1);
                    accounts.add(as);
                    break;
                case 2:
                    AccountChecking ac = new AccountChecking(200, 2);
                    accounts.add(ac);
                    break;
                case 5:
                    continue;

                default:
                    break;
            }
            printAccounts(accounts);

            System.out.println("");


        }
    }

    public void printAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.print(account.getAccountID());
            System.out.print(" ");
            System.out.print(account.getAccountBalance());
            System.out.print(" ");
            System.out.println(account.getClass().getSimpleName());
        }
    }
}
