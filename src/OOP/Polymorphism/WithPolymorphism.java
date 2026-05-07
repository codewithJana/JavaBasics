package OOP.Polymorphism;


//parent class
class Notification{
    void pay(){
        System.out.println("Sending Notification");
    }
}

class SMSNotification1 extends Notification{
    void pay(){
        System.out.println("Sending SMS");
    }
}

class WhatsappNotification1 extends Notification{
    void pay(){
        System.out.println("Sending Whatsapp");
    }
}

class EmailNotification1 extends Notification{
    void pay(){
        System.out.println("Sending Email");
    }
}

public class WithPolymorphism {

    static void main(String[] args) {
        Notification n; //same reference

        n = new EmailNotification1(); //different form
        n.pay();

        n = new SMSNotification1(); //different form
        n.pay();

        n = new WhatsappNotification1(); //different form
        n.pay();


    }

    //Without Poly : Mainclass --> sms,whatapp,email
    //With Poly : Main --> Notification


}
