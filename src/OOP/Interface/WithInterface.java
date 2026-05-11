package OOP.Interface;

//contract
interface Payment{
    void pay();
}

class CreditcardPayment1 implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment through CC");
    }
}

class UPIPayment1 implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}

public class WithInterface {
    static void main(String[] args) {

        Payment cc = new CreditcardPayment1();
        cc.pay();

        Payment upi = new UPIPayment1();
        upi.pay();


    }
}


//Payment --> Reference type
//new ccclass/upi class --> object creation
//cc/upi --> reference variable
