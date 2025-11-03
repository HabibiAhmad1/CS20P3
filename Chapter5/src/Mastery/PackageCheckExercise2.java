package Mastery;

import java.util.Scanner;

public class PackageCheckExercise2
{
    public static void main(String[] args) {

        // ------------------- INPUT -------------------
        Scanner input = new Scanner(System.in);

        final double MAX_WEIGHT_KG = 27.0;
        final double MAX_VOLUME_CM3 = 100000.0;

        System.out.print("Enter the package weight (kg): ");
        double packageWeight = input.nextDouble();

        System.out.print("Enter the package length (cm): ");
        double packageLength = input.nextDouble();

        System.out.print("Enter the package width (cm): ");
        double packageWidth = input.nextDouble();

        System.out.print("Enter the package height (cm): ");
        double packageHeight = input.nextDouble();

        // ------------------- PROCESS -------------------
        double packageVolume = packageLength * packageWidth * packageHeight;

        boolean isTooHeavy = packageWeight > MAX_WEIGHT_KG;
        boolean isTooLarge = packageVolume > MAX_VOLUME_CM3;

        // ------------------- OUTPUT -------------------
        if (isTooHeavy && isTooLarge) {
            System.out.println("Too heavy and too large");
        } else if (isTooHeavy) {
            System.out.println("Too heavy");
        } else if (isTooLarge) {
            System.out.println("Too large");
        } else {
            System.out.println("Package is acceptable");
        }
    }
}