package Mastery;

import java.util.Scanner;

public class PrintingExercise1
{
    public static void main(String[] args) {

        // ------------------- INPUT -------------------
        Scanner input = new Scanner(System.in);

        final double PRICE_UP_TO_99 = 0.30;
        final double PRICE_UP_TO_499 = 0.28;
        final double PRICE_UP_TO_749 = 0.27;
        final double PRICE_UP_TO_1000 = 0.26;
        final double PRICE_OVER_1000 = 0.25;

        System.out.print("Enter the number of copies to print: ");
        int numberOfCopies = input.nextInt();

        // ------------------- PROCESS -------------------
        double pricePerCopy;

        if (numberOfCopies <= 99) {
            pricePerCopy = PRICE_UP_TO_99;
        } else if (numberOfCopies <= 499) {
            pricePerCopy = PRICE_UP_TO_499;
        } else if (numberOfCopies <= 749) {
            pricePerCopy = PRICE_UP_TO_749;
        } else if (numberOfCopies <= 1000) {
            pricePerCopy = PRICE_UP_TO_1000;
        } else {
            pricePerCopy = PRICE_OVER_1000;
        }

        double totalPrice = numberOfCopies * pricePerCopy;

        // ------------------- OUTPUT -------------------
        System.out.printf("Price per copy: $%.2f%n", pricePerCopy);
        System.out.printf("Total price: $%.2f%n", totalPrice);
    }
}