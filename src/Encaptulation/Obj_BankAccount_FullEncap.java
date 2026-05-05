package Encaptulation;

public class Obj_BankAccount_FullEncap {

    static void main(String[] args) {
        BankAccount_FullEncap fullEnc = new BankAccount_FullEncap();
        fullEnc.deposit(-10000);
        System.out.println(fullEnc.showBalance());
    }
}