package Constructors;

public class Employee {

    String name;
    int age;
    double salary;

    //Custom Default constructor method
    Employee(){
        name = "John";
        age = 25;
    }

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    Employee(String n, double s, int a){
        name = n;
        salary = s;
        age  = a;
    }


    // Paramertized constructor method
    //1. ensure object validity
    //2. Avoid repetitive code
    //3. Ensure Mandatory data
    //4.Encaptulation control --> Will discuss more on Encaptulation class
    Employee(String name, int age){

        if(name == null || age <= 0 ){
            throw  new IllegalArgumentException("Name & age didnt met the object creation rules!!");

        }

        this.name = name;
        this.age = age;
    }

}
