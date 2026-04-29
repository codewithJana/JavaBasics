package Assignment_Exercises;

public class Q5_OddNumbers_in_a_RangewithCount {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Odd numbers between 1 and 50:");

        // Loop through the specified range
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.println(i);
                count++;      // Increment the odd number counter
            }
        }

        System.out.println("Total count of odd numbers: " + count);
    }
}
