package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Ask the user for the min and max values
        System.out.print("Enter the minimum value: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = input.nextInt();

        // Generate a random integer between min and max (inclusive)
        int randomNumber = rand.nextInt(max - min + 1) + min;

        // Display the random number
        System.out.println("Random number between " + min + " and " + max + " is: " + randomNumber);
    }
}