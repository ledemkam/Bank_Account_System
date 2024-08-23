package org.lab;

public class CurrentAccount extends  Account{

    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }



     @Override
    public void withdraw(double amount) {
         if(getBalance() - amount > overdraftLimit){
             setBalance(getBalance() - amount);
         }else {
             System.out.println("Insufficient funds");
         }
    }

    @Override
    public void   displayDetails(){
        super.displayDetails();
        System.out.println("Overdraftlimit" + overdraftLimit);
    }


}


