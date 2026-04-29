package Assignment_Exercises;

public class Q10_Palindrome_NumberCheck {
    public static void main(String[] args) {
        int n = 1221;
        int reversedNum = 0;

        // Reverse the number
        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10;
            reversedNum = (reversedNum * 10) + digit;
        }

        // Compare the reversed number with the original
        if (n == reversedNum) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }

}
