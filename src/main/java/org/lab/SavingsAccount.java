package org.lab;

public class SavingsAccount extends Account {

    private double interestRate;
    private int years;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate, int years) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
        this.years = years;

    }

    public void addInterest() {
        double interest = getBalance() * Math.pow(1 + interestRate, years);
        deposit(interest);
    }

    public void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate);
    }


}
