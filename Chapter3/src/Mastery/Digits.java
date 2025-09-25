package Mastery;

import java.util.Scanner;

public class Digits 
	{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Ask the user for a three-digit number
	        System.out.print("Enter a three-digit number: ");
	        int number = input.nextInt();

	        // Get the ones place
	        int ones = number % 10;

	        // Get the tens place
	        int tens = (number / 10) % 10;

	        // Get the hundreds place
	        int hundreds = number / 100;

	        // Show the result
	        System.out.println("Hundreds place: " + hundreds);
	        System.out.println("Tens place: " + tens);
	        System.out.println("Ones place: " + ones);
	    }
	}
