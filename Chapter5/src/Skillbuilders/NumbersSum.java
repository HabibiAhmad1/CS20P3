package Skillbuilders;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0; // to store the total

        // Display numbers from 1 up to the entered number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum = sum + i; // add each number to the sum
        }

        // Display the sum
        System.out.println("The sum is: " + sum);
    }
}