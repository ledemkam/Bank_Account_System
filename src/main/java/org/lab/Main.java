package org.lab;

public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setOwner("ledemkam");
        currentAccount.setAccountNumber("KTE4567890");
        currentAccount.setBalance(10000);
        currentAccount.withdraw(2000);
        currentAccount.setOverdraftLimit(-100);
        currentAccount.displayDetails();


        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setOwner("joshua");
        savingsAccount.setAccountNumber("AMZ123456");
        savingsAccount.setInterestRate(0.05);
        savingsAccount.deposit(500);
        double balanceIn15Years = savingsAccount.calculateInterest(15);
        savingsAccount.setBalance(balanceIn15Years);
        savingsAccount.displayDetails();




    }
}