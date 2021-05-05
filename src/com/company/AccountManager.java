package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
    public void run() {
        Scanner sc = new Scanner(System.in);

        List<Account> accounts = new ArrayList<>();
        AccountSavings as = new AccountSavings(100, 1);
        AccountChecking ac = new AccountChecking(200, 2);
        accounts.add(as);
        accounts.add(ac);

        String customerInputString;
        System.out.println("set customer name");
        customerInputString = sc.next();

        Customer c = new Customer(customerInputString);
        System.out.println(c.getCustomerName() + " " + c.getCustomerNumber());


        while (true) {
            //instance

            Double customerInputDouble;
            int input = 0;

            printMenue();

            input = sc.nextInt();

            switch (input) {
                case 1:
                    getBalance(sc, accounts);
                    break;
                case 2:
                    addMoney(sc, accounts);
                    break;
                case 3:
                    receiveMoney(sc, accounts);
                    break;
                case 4:
                    createAccount(sc, accounts);
                    break;
                default:
                    break;

            }
        }


    }

    private void printMenue() {
        System.out.println("1 get balance");
        System.out.println("2 add money");
        System.out.println("3 receive money");
        System.out.println("4 create account");
    }

    private void receiveMoney(Scanner sc, List<Account> accounts) {
        printAccounts(accounts);
        Double customerInputDouble;
        int input;
        System.out.println("receive money from account number:");
        input = sc.nextInt();
        System.out.println("how much?");
        customerInputDouble = sc.nextDouble();
        accounts.get(input -1).receiveMoney(customerInputDouble);
    }

    private void addMoney(Scanner sc, List<Account> accounts) {
        printAccounts(accounts);
        Double customerInputDouble;
        int input;
        System.out.println("add money to account number:");
        input = sc.nextInt();
        System.out.println("how much?");
        customerInputDouble= sc.nextDouble();
        accounts.get(input -1).addMoney(customerInputDouble);
    }

    private void getBalance(Scanner sc, List<Account> accounts) {
        printAccounts(accounts);
        int input;
        System.out.println("get balance of account number:");
        input = sc.nextInt();
        System.out.println(accounts.get(input-1).getAccountBalance());
    }


    private void createAccount(Scanner sc, List<Account> accounts) {
        int input = 0;

        while(input != 5){
            Double customerInputDouble;

            //create Account
            System.out.println("1 create AccountSavings");
            System.out.println("2 create AccountChecking");
            System.out.println("3 create AccountCredit");
            System.out.println("4 create AccountCheckingSpecial");
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
                case 3:
                    AccountCredit acredit = new AccountCredit(300, 3);
                    accounts.add(acredit);
                case 4:
                    AccountCheckingSpecial acs = new AccountCheckingSpecial(400, 4);
                    accounts.add(acs);
                default:
                    break;
            }

        }
    }

    public void printAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.print((accounts.indexOf(account)) + 1);
            System.out.print(" ");
            //System.out.print(account.getAccountID());
            //System.out.print(" ");
            //System.out.print(account.getAccountBalance());
            //System.out.print(" ");
            System.out.println(account.getClass().getSimpleName());
        }
    }
}
