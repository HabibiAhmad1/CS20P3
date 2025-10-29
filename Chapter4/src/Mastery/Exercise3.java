package Mastery;

import java.util.Scanner;

//Eggs
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of eggs
        System.out.print("Enter the number of eggs: ");
        int eggs = input.nextInt();

        // Calculate dozens and leftover eggs
        int dozens = eggs / 12;
        int extraEggs = eggs % 12;

        double pricePerDozen;

        // Determine price per dozen based on number of dozens
        if (dozens < 4) {
            pricePerDozen = 0.50;
        } else if (dozens < 6) {
            pricePerDozen = 0.45;
        } else if (dozens < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        // Calculate total price
        double totalPrice = (dozens * pricePerDozen) + (extraEggs * (pricePerDozen / 12));

        // Display the bill
        System.out.println("You ordered " + eggs + " eggs.");
        System.out.println("That's " + dozens + " dozen and " + extraEggs + " extra eggs.");
        System.out.printf("The bill is $%.2f%n", totalPrice);
    }
}