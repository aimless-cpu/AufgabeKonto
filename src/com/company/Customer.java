package com.company;

import java.util.Random;

public class Customer {
    //instance
    private String customerName;
    private int customerNumber;

    //constructor
    public Customer(String customerName, int customerNumber) {
        this.customerName = customerName;
        this.customerNumber = createCustomerNumber();
    }

    //method
    public int createCustomerNumber() {
        Random rand = new Random();
        int n = 100000 + rand.nextInt(900000);
        return n;
    }

    //getter setter
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
