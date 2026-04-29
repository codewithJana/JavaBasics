package Assignment_Exercises;

public class Q2_Digit_Sum_Using_Operators {

    /*
    Given an integer n = 4567, extract each digit using arithmetic and modulus operators only and
compute the sum of all digits. Print the final sum.
     */

    public static void main(String[] args) {
        int n = 4567;
        int sum = 0;

        // Use a for loop to continuously extract and remove digits
        for (int temp = n; temp > 0; temp /= 10) {
            int lastDigit = temp % 10; // Extract the last digit
            sum += lastDigit;          // Add to the running total
        }

        System.out.println("The sum of digits for " + n + " is: " + sum);
    }

}
