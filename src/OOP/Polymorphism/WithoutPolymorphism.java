package OOP.Polymorphism;


class SMSNotification{
    void pay(){
        System.out.println("Sending SMS");
    }
}

class WhatsappNotification{
    void pay(){
        System.out.println("Sending Whatsapp");
    }
}

class EmailNotification{
    void pay(){
        System.out.println("Sending Email");
    }
}

public class WithoutPolymorphism {

    static void main(String[] args) {
        String type = "SMS";

        if(type.equals("SMS")){
            SMSNotification s = new SMSNotification();
            s.pay();
        } else if (type.equals("Whatsapp")) {
            WhatsappNotification w = new WhatsappNotification();
            w.pay();
        } else if (type.equals("Email")) {
            EmailNotification e = new EmailNotification();
            e.pay();
        }
    }
}
