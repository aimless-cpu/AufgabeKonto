package com.company;

public class AccountChecking extends Account {
    //instance
    private int possibleOverdraft = -1500;
    private double interestRate = 0.025;
    private double interestRateDefault = 0.025;
    private double interestRateOverdraft = -0.05;

    //constructor
    public AccountChecking(double accountBalance, int accountID) {
        super(accountBalance, accountID);
    }

    public void receiveMoney(double customerInputDouble) {
        if (this.getAccountBalance() - customerInputDouble >= possibleOverdraft) {
            setAccountBalance(getAccountBalance() - customerInputDouble);
            System.out.println("received " + customerInputDouble);
            if (getAccountBalance() < 0) {
                System.out.println("interest rate changed to " + (interestRate = interestRateOverdraft));
            } else {
                System.out.println("interest rate is " + interestRate);
            System.out.println("max to receive is " + (getAccountBalance()-possibleOverdraft));
        }
        }
    }

    //getter setter
    public int getPossibleOverdraft() {
        return possibleOverdraft;
    }

    public void setPossibleOverdraft(int possibleOverdraft) {
        this.possibleOverdraft = possibleOverdraft;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRateOverdraft() {
        return interestRateOverdraft;
    }

    public void setInterestRateOverdraft(double interestRateOverdraft) {
        this.interestRateOverdraft = interestRateOverdraft;
    }
}
