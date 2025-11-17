package Skillbuilders;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        // Process + Output
        int result = powerOf(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }

    // Method that calculates base^exponent using a loop
    public static int powerOf(int base, int exponent) {

        int answer = 1;

        for (int i = 1; i <= exponent; i++) {
            answer = answer * base;
        }

        return answer;
    }
}