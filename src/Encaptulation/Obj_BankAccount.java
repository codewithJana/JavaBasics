package Encaptulation;

public class Obj_BankAccount {

    static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.balance =10000;

        acc.balance = -10000;
        System.out.println(acc.balance);

    }

}
