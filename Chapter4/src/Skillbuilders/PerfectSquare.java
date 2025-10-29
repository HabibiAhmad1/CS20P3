package Skillbuilders;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Find the square root of the number
        double squareRoot = Math.sqrt(number);

        // Truncate the decimal part (casting double to int)
        int truncated = (int) squareRoot;

        // Square the truncated number
        int squared = truncated * truncated;

        // Check if it's a perfect square
        if (squared == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}