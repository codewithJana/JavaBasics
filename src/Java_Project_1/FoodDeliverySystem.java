package Java_Project_1;

import java.util.Scanner;

class Person{

    String name;
    Person(String name){
        this.name =  name;
    }

    void displayRole(){
        System.out.println("Person");
    }

}

class Customer extends Person{

    //get the customer name
    Customer(String name){
        super(name);
    }

    //display customer
    public void displayCustomer(){
        System.out.println("Customer Name is " + name);
    }

    //assignRole
    @Override
    void displayRole(){
        System.out.println("Role: Customer");
    }

    //private int billAmount;
    //get bill amount
//    public void placeOrder(int amount){
//        billAmount = amount;
//    }
    //show billamount
//    public int getbillAmount(){
//          return billAmount;
//    }
}

interface Delivery{

    void deliverOrder();

}

class DeliveryPerson extends Person implements Delivery{

    DeliveryPerson(String name){
        super(name);
    }

    @Override
    void displayRole(){
        System.out.println("Role: DeliveryPerson");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order Delivered Successfuly");
    }
}

abstract class FoodService{

    abstract void showMenu();

    void complementaryFood(){
        System.out.println("Today's complementary food is CheeseCake");
    }

}

class FoodOrder extends FoodService{

    private int billAmount;

    @Override
    void showMenu() {
        System.out.println("\nFOOD MENU");

        System.out.println("1. Pizza - 200");
        System.out.println("2. Burger - 100");
        System.out.println("3. Juice - 50");
    }

    //polymorphism -
    void placeOrder(int amount){
        billAmount = amount;
    }

    //polymorphism -
    void placeOrder(int amount,int quantity){
        billAmount = amount*quantity;
    }

    int getBillAmount(){
        return billAmount;
    }


}




public class FoodDeliverySystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer cust = null;
        FoodOrder order = new FoodOrder();
        DeliveryPerson deliveryboy = new DeliveryPerson("John");


        int choice;

        do{
            System.out.println("\n========ONLINE FOOD DELIVERY SYSTEM==========");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer");
            System.out.println("3. Show Food Menu");
            System.out.println("4. Place Order");
            System.out.println("5. View Bill");
            System.out.println("6. Delivery Status");
            System.out.println("7. Exit");

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    System.out.println("Enter Customer Name: ");
                    String name = sc.nextLine();

                    //customer class - pass name to constructor
                    cust = new Customer(name);

                    System.out.println("Customer Added Successfully");
                    break;

                case 2:
                    // display customer
                    // handle if the customer is empty
                    cust.displayCustomer();

                    Person p = cust;
                    p.displayRole();
                    break;

                case 3:
                    order.showMenu();
                    break;
                case 4:
                    System.out.println("Enter Food Price: ");
                    int amount = sc.nextInt();

                    System.out.println("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    order.placeOrder(100,2);
                    break;

                case 5:
                    System.out.println("Total bill Amount is " + order.getBillAmount());
                    break;

                case 6:
                    deliveryboy.deliverOrder();
                    Person p1 = deliveryboy;
                    p1.displayRole();
                    break;

                case 7:
                    System.out.println("Thanks for ordering food with us!!");
                    break;

                default:
                    System.out.println("Invalid Choice.. Please select between 1-5");

            }

        }while(choice != 7);

        sc.close();

    }

}
