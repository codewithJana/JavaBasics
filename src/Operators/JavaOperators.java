package Operators;

public class JavaOperators {
    public static void main(String[] args) {
        //Arithmetic operators
        int a = 10; int b = 4; int c = 10;
        String str1 ="java"; String str2 = "program";
        String str3 = new String("java");

        //addition operator
        System.out.println(a+b);
        System.out.println(str1 + " " +str2);

        //Substraction
        System.out.println(a-b);

        //Miltiply
        System.out.println(a*b);

        //division
        System.out.println(a/b);

        //Modulus (reminder)
        System.out.println(a%b);

        //Relational Operator

        System.out.println("Compare String with operator " + (str1 == str3));
        System.out.println("Compare String with method: " + str1.equals(str3));
        System.out.println(a == b); //False
        System.out.println(a != b); //True
        System.out.println(a > b); //True
        System.out.println(a < b); //False
        System.out.println(a >= b); //True
        System.out.println(a <= c); //True

        //instanceof operator

        String name = "jana";

        if(name instanceof String){
            System.out.println("It belongs to string class");
        }

        //Logical Operator

        int age =10;
        boolean haveID = true;

        //Logical AND
        boolean enterOffice = (age >= 18) && haveID; // true && true -->true ; false && true --> false
        System.out.println(enterOffice);

        //Logical OR
        boolean enterTemple = (age >= 18) || haveID;
        System.out.println(enterTemple);

        //Logigal NOT
        boolean reverse = !(age >= 18);
        System.out.println(reverse);

        //Ternary operator

        /*
         if (number > 100){
            System.out.println("The number is greater than 100");
        }else{
            System.out.println("The number is less than 100");
        }
        */

        // condition ? expression1 : expression2
        String size = (a>15) ? "greater" : "lesser";
        System.out.println(size);



    }
}
