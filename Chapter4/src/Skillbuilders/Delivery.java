package Skillbuilders;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for package dimensions
        System.out.print("Enter the length of the package: ");
        int length = input.nextInt();

        System.out.print("Enter the width of the package: ");
        int width = input.nextInt();

        System.out.print("Enter the height of the package: ");
        int height = input.nextInt();

        // Check the size limits
        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }
    }
}