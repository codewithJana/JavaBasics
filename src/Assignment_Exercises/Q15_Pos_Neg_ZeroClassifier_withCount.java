package Assignment_Exercises;

public class Q15_Pos_Neg_ZeroClassifier_withCount {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Loop counter trick to avoid using an array or collection
        for (int i = 1; i <= 10; i++) {
            int currentNum = 0;

            // Assign the corresponding number based on the loop iteration
            switch (i) {
                case 1: currentNum = -5; break;
                case 2: currentNum = 12; break;
                case 3: currentNum = 0; break;
                case 4: currentNum = -3; break;
                case 5: currentNum = 8; break;
                case 6: currentNum = 0; break;
                case 7: currentNum = 15; break;
                case 8: currentNum = -9; break;
                case 9: currentNum = 4; break;
                case 10: currentNum = 0; break;
            }

            // Classify the current number
            if (currentNum > 0) {
                positiveCount++;
            } else if (currentNum < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Print final counts
        System.out.println("Total Positive numbers: " + positiveCount);
        System.out.println("Total Negative numbers: " + negativeCount);
        System.out.println("Total Zeroes: " + zeroCount);
    }
}
