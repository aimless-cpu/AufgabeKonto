package com.company;

public class AccountSavings extends Account{
    //instance
    private int possibleOverdraft = 0;
    private double interestRate = 0.05;


    //constructor
    public AccountSavings(double accountBalance, int accountID) {
        super(accountBalance, accountID);
    }

    //method
    public void receiveMoney(double customerInputDouble) {
        System.out.println("due to this being a savings account receiving money is restricted");
    }

    //getter setter
    public int getPossibleOverdraft() {
        return possibleOverdraft;
    }

    public void setPossibleOverdraft(int possibleOverdraft) {
        this.possibleOverdraft = possibleOverdraft;
    }
}
