package Assignment_Exercises;

public class Q13_Simple_Calculator_Using_Switch {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char operator = '/';

        // Perform operation based on the char
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                // Nested check to prevent division by zero
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
