package Assignment_Exercises;

public class Q14_Factorial_Using_ForLoop {
    public static void main(String[] args) {
        int n = 10;
        long result = 1; // Use long to prevent integer overflow

        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("The factorial of " + n + " is: " + result);
    }
}
