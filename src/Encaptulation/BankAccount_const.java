package Encaptulation;

 public class BankAccount_const {

    public double balance;

    public BankAccount_const(double balance){
        if(balance>=0){
            this.balance = balance;
        }
    }
}

