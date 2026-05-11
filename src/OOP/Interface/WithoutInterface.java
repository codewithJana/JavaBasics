package OOP.Interface;

class CreditcardPayment{
    void cardPayment(){
        System.out.println("Payment through CC");
    }
}

class UPIPayment{
    void upiPayment(){
        System.out.println("Payment through UPI");
    }
}

public class WithoutInterface {

    static void main(String[] args) {
        CreditcardPayment cc = new CreditcardPayment();
        cc.cardPayment();

        UPIPayment upi = new UPIPayment();
        upi.upiPayment();

    }

}


/*
1. No standard behaviour --> Different methoda names
2. Difficult to extend --> new payment system
3. Tightly coupling
 */