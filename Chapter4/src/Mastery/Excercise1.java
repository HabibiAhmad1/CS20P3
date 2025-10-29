package Mastery;

import java.util.Scanner;

//Printing
public class Excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for number of copies
        System.out.print("Enter the number of copies to print: ");
        int copies = input.nextInt();

        double pricePerCopy;

        // Determine price per copy based on number of copies
        if (copies <= 99) {
            pricePerCopy = 0.30;
        } else if (copies <= 499) {
            pricePerCopy = 0.28;
        } else if (copies <= 749) {
            pricePerCopy = 0.27;
        } else if (copies <= 1000) {
            pricePerCopy = 0.26;
        } else {
            pricePerCopy = 0.25;
        }

        // Calculate total price
        double totalPrice = copies * pricePerCopy;

        // Display results
        System.out.println("Price per copy: $" + pricePerCopy);
        System.out.println("Total price: $" + totalPrice);
    }
}