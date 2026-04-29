package Assignment_Exercises;

public class Q8_Bitwise_EvenOddCheck {
    public static void main(String[] args) {
        int n = 29;

        // Binary logic explanation:
        // Even numbers in binary always end in 0 (e.g., 2 is 0010).
        // Odd numbers in binary always end in 1 (e.g., 3 is 0011).
        // The bitwise AND (&) with 1 (0001) isolates the least significant bit.
        // If the result is 1, the original bit was 1 (odd). If 0, the bit was 0 (even).
        if ((n & 1) == 1) {
            System.out.println(n + " is an odd number.");
        } else {
            System.out.println(n + " is an even number.");
        }
    }
}
