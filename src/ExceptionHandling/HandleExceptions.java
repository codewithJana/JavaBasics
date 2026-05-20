package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleExceptions {
    static void main(String[] args) {
        /*
        //Compile time error ->> compiler stops the program
        int number = "10";
        int number2 = 100;
        System.out.println("hii");
        int sum  = number =number2;


        //Runtime error -> Error occurs in the running stage
        int total = 100/0;

        //Logical errors
        int total1 = 100-20 * 2; // (100-20) * 2
        System.out.println(total1); // 100 - (20*2)
         */
        //without try-catch block

        int number = 0;
        //risky
        try {
            int result = 100 / number;
            System.out.println("Result: " + result);
//            int[] numbers = {10,20,30};
//            System.out.println(numbers[10]);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by Zero. It leads to infinite");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Array Index");
            System.out.println(e.getMessage());
        }

        System.out.println("Program is completed");


        int num = -500;
        try {
            if (num < 0) {
                throw new ArithmeticException("Negative amount not allowed");
            }
            System.out.println("withdrawl successfull");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader file = new FileReader("D:\\SDET_April\\Java\\Java_Basics\\Java_basics\\src\\sample.txt");
            System.out.println("File Opened");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("File not opened");
        } finally {
            //always execute whether exceptions occurs or not
            System.out.println("Close the file if opened otherwise terminate filereader process");
        }

        //throw keyword  -- used to manually create an exception
        //why? based on business validation

        int age = -10;

        try {
            if (age < 0) {
                throw new RuntimeException("Invalid Age or Negative Age");
            }
            System.out.println("Valid Age");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        int bal = 100;

        try {
            if (bal < 1000) {
                throw new InsufficientBalance("Balance should be greater than 1000");
            }
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }


    }

    // handle exceptions in method signature -- throws
    static void readFile() throws FileNotFoundException {
        FileReader file_ = new FileReader("text.txt");
    }
}


class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}
