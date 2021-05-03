package com.company;

public class Account {
    //instance
    private double accountBalance;
    private int accountID;

    //constructor
    public Account(double accountBalance, int accountID) {
        this.accountBalance = accountBalance;
        this.accountID = accountID;
    }

    public Account() {

    }

    //method
    public void addMoney(double customerInputDouble) {
        this.accountBalance = this.accountBalance + customerInputDouble;
        System.out.println("added " + customerInputDouble);
    }

    public void receiveMoney(double customerInputDouble) {
        this.accountBalance = this.accountBalance - customerInputDouble;
        System.out.println("received " + customerInputDouble);
    }

    //getter setter
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}
