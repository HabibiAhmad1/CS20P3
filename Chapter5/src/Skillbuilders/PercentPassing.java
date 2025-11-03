package Skillbuilders;

import java.util.Scanner;

public class PercentPassing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalScores = 0;
        int passingScores = 0;
        double score;

        System.out.println("Enter student scores (enter -1 to stop):");

        // Loop to keep reading scores until the user types -1
        while (true) {
            System.out.print("Enter score: ");
            score = input.nextDouble();

            // Stop the loop when user enters -1
            if (score == -1) {
                break;
            }

            totalScores++;

            // Count passing scores (above 70)
            if (score > 70) {
                passingScores++;
            }
        }

        // Calculate percentage
        if (totalScores > 0) {
            double percentPassing = ((double) passingScores / totalScores) * 100;
            System.out.printf("Percentage of scores above 70%%: %.2f%%%n", percentPassing);
        } else {
            System.out.println("No scores were entered.");
        }
    }
}