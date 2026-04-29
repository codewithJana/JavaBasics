package Assignment_Exercises;

public class Q9_Electricity_BillCalculator {
    public static void main(String[] args) {
        int units = 250;
        double bill = 0.0;

        // Calculate slab-wise billing
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else if (units <= 300) {
            bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.00);
        } else {
            bill = (100 * 1.50) + (100 * 2.50) + (100 * 4.00) + ((units - 300) * 6.00);
        }

        System.out.println("Total electricity bill for " + units + " units is: ₹" + bill);
    }
}
