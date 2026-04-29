package Assignment_Exercises;

public class Q11_Largest_of_ThreeNumbers {
    public static void main(String[] args) {
        int a = 54;
        int b = 89;
        int c = 73;
        int largest;

        // Determine the largest using nested if statements
        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
