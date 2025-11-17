/*
Program: PerfectInteger.java          Last Date of this Revision: November,17, 2025

Purpose: Create a PerfectIntegers application that displays all perfect integers up to 100. A perfect integer is a
number which is equal to the sum of all its factors except itself. For example, 6 is a perfect number
because 1 + 2 + 3 = 6. The application should include a boolean method isPerfect().
Author: Mohammed Abdalla, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;
public class PerfectIntegers {

    public static void main(String[] args) {

        System.out.println("Perfect integers from 1 to 100:");

        // Loop through numbers 1 to 100
        for (int number = 1; number <= 100; number++) {

            // Call isPerfect to check if it's a perfect number
            if (isPerfect(number)) {
                System.out.println(number);
            }
        }
    }

    // Method that checks whether a number is perfect
    public static boolean isPerfect(int n) {

        int sum = 0;

        // Check all factors from 1 to n-1
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {   // i is a factor
                sum = sum + i; // add it to the sum
            }
        }

        // A perfect number is equal to the sum of its factors
        return sum == n;
    }
}


/* Screen Dump
 
Perfect integers from 1 to 100:
6
28

 
 */
