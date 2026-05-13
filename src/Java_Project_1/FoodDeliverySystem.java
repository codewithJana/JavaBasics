package Java_Project_1;

import java.util.Scanner;

class Person{

    String name;
    Person(String name){
        this.name =  name;
    }
}

class Customer extends Person{

    private int billAmount;

    //get the customer name
    Customer(String name){
        super(name);
    }

    //display customer
    public void displayCustomer(){
        System.out.println("Customer Name is " + name);
    }

    //get bill amount
    public void placeOrder(int amount){
        billAmount = amount;
    }

    //show billamount
    public int getbillAmount(){
          return billAmount;
    }



}


public class FoodDeliverySystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer cust = null;
        int choice;

        do{
            System.out.println("\n========ONLINE FOOD DELIVERY SYSTEM==========");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer");
            System.out.println("3. Place Order");
            System.out.println("4. View Bill");
            System.out.println("5. Exit");

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

                    break;

                case 3:
                    // Enter bill amt
                    //handle if the customer is empty
                    System.out.println("Enter Bill Amount: ");
                    int amount = sc.nextInt();

                    cust.placeOrder(amount);
                    System.out.println("Order placed Successfully");
                    break;
                case 4:
                    //view bill
                    //handle if the customer is empty
                    System.out.println("Total Bill amount is :" + cust.getbillAmount());
                    break;

                case 5:
                    System.out.println("Thanks for ordering food with us!!");
                    break;

                default:
                    System.out.println("Invalid Choice.. Please select between 1-5");

            }

        }while(choice != 5);

        sc.close();

    }

}
