package Mastery;

import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fixed costs
        final double LABOR = 0.75;
        final double RENT = 1.00;

        // Ask user for the size
        System.out.print("Enter the size of the pizza (diameter in inches): ");
        int diameter = input.nextInt();

        // Calculate material cost
        double materials = 0.05 * diameter * diameter;

        // Calculate total cost
        double totalCost = LABOR + RENT + materials;

        // Show result
        System.out.println("The cost of making a " + diameter + "-inch pizza is $" + totalCost);
    }
}