package com.company;

public class AccountCredit extends Account{
    //instance
    private int possibleOverdraft = -10000;


    //constructor
    public AccountCredit(double accountBalance, int accountID) {
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
}
