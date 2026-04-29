package Assignment_Exercises;

public class Q12_Sum_of_First_N_NaturalNumbers_Using_ForLoop {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        // Accumulate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        // Check if the sum is even or odd
        if (sum % 2 == 0) {
            System.out.println("The calculated sum is an even number.");
        } else {
            System.out.println("The calculated sum is an odd number.");
        }
    }
}
