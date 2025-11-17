package Skillbuilders;

import java.util.Scanner;

public class TimeConverter  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ------------------- INPUT -------------------
        System.out.println("Time Converter");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print("Choose an option (1-4): ");

        int choice = input.nextInt();

        // ------------------- PROCESS & OUTPUT -------------------
        if (choice == 1) {
            System.out.print("Enter hours: ");
            double hours = input.nextDouble();
            System.out.println("Minutes: " + hoursToMinutes(hours));

        } else if (choice == 2) {
            System.out.print("Enter days: ");
            double days = input.nextDouble();
            System.out.println("Hours: " + daysToHours(days));

        } else if (choice == 3) {
            System.out.print("Enter minutes: ");
            double minutes = input.nextDouble();
            System.out.println("Hours: " + minutesToHours(minutes));

        } else if (choice == 4) {
            System.out.print("Enter hours: ");
            double hours = input.nextDouble();
            System.out.println("Days: " + hoursToDays(hours));

        } else {
            System.out.println("Invalid choice.");
        }
    }

    // ------------------- METHODS -------------------

    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double daysToHours(double days) {
        return days * 24;
    }

    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    public static double hoursToDays(double hours) {
        return hours / 24;
    }
}