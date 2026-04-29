package Assignment_Exercises;

public class Q1_Swap_without_TempVariable {

    static void main(String[] args) {

        /*
        Given two integer variables a = 45 and b = 78, swap their values without using a third variable.
        Print the values before and after swapping.
         */

        int a = 45;
        int b = 78;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Logic to swap without a third variable
        a = a + b; // a now becomes 123 (45 + 78)
        b = a - b; // b becomes 45 (123 - 78)
        a = a - b; // a becomes 78 (123 - 45)

        System.out.println("After swapping: a = " + a + ", b = " + b);


    }

}
