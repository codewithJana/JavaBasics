package OOP.Polymorphism;

//Method Overloading ---> Compile time Polymorphism, Static poly
// When: compile time, where: same class

//Multiple methods with SAME name,but Different in Parameter/position usage

/*RULES:
1. Same Method name
2. Different parameter (datatype) --> number, type, order
3. Same class
4. Return type can be different, but that doesnt count
*/

class Calculator{

    int add (int num1 , int num2){
        return num1+num2;
    }

    int add (int num1 , int num2 , int num3){
        return num1+num2+num3;
    }

    String add (String str1, String str2){
        return str1+str2;
    }

    void add (int num1, String str){
        System.out.println(num1);
        System.out.println(str);
    }

    void add (String str, int num1){
        System.out.println(num1);
        System.out.println(str);
    }
}

public class Overloading {

    static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2,3,4));
        System.out.println(calc.add("hello","world"));
        calc.add(1,"world");
        calc.add("world",1);
    }

}
