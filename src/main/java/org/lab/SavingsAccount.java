package org.lab;

public class SavingsAccount extends Account implements InterestBearing {


    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest(int years) {
        return getBalance() * Math.pow((1 + interestRate), years);
    }

    @Override
    public void   displayDetails(){
        super.displayDetails();
        System.out.println("interest Rate: " + interestRate);
    }

}
