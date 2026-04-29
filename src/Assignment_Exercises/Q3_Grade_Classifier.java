package Assignment_Exercises;

public class Q3_Grade_Classifier {

    /*
    A student's marks (out of 100) are stored in a variable. Write a program using if..else if..else to
print the grade as per the rules below:
     */

    public static void main(String[] args) {
        int marks = 85; // Example marks

        // Evaluate grades top-down
        if (marks >= 90 && marks <= 100) {
            System.out.println("Outstanding");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("B");
        } else if (marks >= 45 && marks <= 59) {
            System.out.println("C");
        } else if (marks >= 0 && marks < 45) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
}
