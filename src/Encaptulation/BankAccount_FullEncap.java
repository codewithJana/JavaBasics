package Encaptulation;

public class BankAccount_FullEncap {

    private double balance;

    public void deposit(double balance){
        if(balance>=0){
            this.balance = balance;
        }
    }

    public double showBalance(){
        return balance;
    }

}
