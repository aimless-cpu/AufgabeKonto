package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String customerInputString;
        Double customerInputDouble;
        customerInputString = sc.next();

        Customer c = new Customer(customerInputString);
        System.out.println("1 set name");

        System.out.println(c.getCustomerName() + " " + c.getCustomerNumber());

        //int customerInputInt;
        int input = 0;
        List<Account> accounts = new ArrayList<>();
        AccountSavings as = new AccountSavings(100,1);
        accounts.add(as);

        printAccounts(accounts);


        System.out.println("get balance of account number:");
        input = sc.nextInt();
        getAccountBalance(input, accounts);

        System.out.println("add money to account number:");
        input = sc.nextInt();
        customerInputDouble= sc.nextDouble();
        addAccountMoney(customerInputDouble, input, accounts);


        createAccount(sc, accounts);


        System.out.println("choose Account to manage");
        input = sc.nextInt();



    }

    private void addAccountMoney(Double customerInputDouble, int input, List<Account> accounts) {
        accounts.get(input -1).addMoney(customerInputDouble);
    }

    private void getAccountBalance(int input, List<Account> accounts) {
        System.out.println(accounts.get(input-1).getAccountBalance());
    }


    private void createAccount(Scanner sc, List<Account> accounts) {
        int input = 0;

        while(input != 5){
            Double customerInputDouble;

            //create Account
            System.out.println("1 create AccountSavings");
            System.out.println("2 create AccountChecking");
            System.out.println("5 continue");

            input = sc.nextInt();

            switch (input) {
                case 1:
                    AccountSavings as = new AccountSavings(100,1);
                    accounts.add(as);
                    break;
                case 2:
                    AccountChecking ac = new AccountChecking(200, 2);
                    accounts.add(ac);
                    break;
                default:
                    break;
            }
            printAccounts(accounts);

        }
    }

    public void printAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.print((accounts.indexOf(account)) + 1);
            System.out.print(" ");
            System.out.print(account.getAccountID());
            System.out.print(" ");
            System.out.print(account.getAccountBalance());
            System.out.print(" ");
            System.out.println(account.getClass().getSimpleName());
        }
    }
}
