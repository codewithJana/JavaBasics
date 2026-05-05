package Encaptulation;

public class Obj_BankAccount_Encap {

    static void main(String[] args) {

        BankAccount_Encap accEn = new BankAccount_Encap();
        accEn.setBalance(-10000);

        System.out.println(accEn.getBalance());


    }
}
