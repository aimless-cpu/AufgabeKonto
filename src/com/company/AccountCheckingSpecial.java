package com.company;

public class AccountCheckingSpecial extends AccountChecking{
    //instance
    private int possibleOverdraft = -10000;

    //constructor
    public AccountCheckingSpecial(double accountBalance, int accountID) {
        super(accountBalance, accountID);
    }

    //method
    public void receiveMoney(double customerInputDouble) {
        if (this.getAccountBalance() - customerInputDouble >= possibleOverdraft) {
            setAccountBalance(getAccountBalance() - customerInputDouble);
            System.out.println("received " + customerInputDouble);
        } else {
            System.out.println("max to receive is " + getAccountBalance());
        }
    }

    //getter setter


}
