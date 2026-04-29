package Assignment_Exercises;

public class Q6_Number_Pattern_Using_ForLoop {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
