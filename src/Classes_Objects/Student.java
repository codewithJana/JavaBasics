package Classes_Objects;

import javax.xml.transform.Source;

public class Student {
    //Fields or Data   --> Variables
    //Behavior or functions --> Methods

    String name ;
    int age ;

    void setDetails(String n,int a){
        name = n;
        age = a;
        System.out.println("Name of the Student is: "+ n);
        System.out.println("Age of the Student is: "+ a);
    }

    void setDetails(int a,String n){
        name = n;
        age = a;
        System.out.println("Name of the Student is: "+ n);
        System.out.println("Age of the Student is: "+ a);
    }

    int setDetails() {

        System.out.println("Name of the Student is: " + name);
        System.out.println("Age of the Student is: " + age);
        return age;
    }

    void study(){
        System.out.println(name + " is studying!!");
    }

    String printSchoolName(){
        return "ABC school";
    }

    int add(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }

    int Sub(int num1 , int num2){
        int subt = num1 - num2;
        return subt;
    }


}
