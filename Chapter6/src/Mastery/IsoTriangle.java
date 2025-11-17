/*

Program: IsoTriangle.java          Last Date of this Revision: November,17, 2025

Purpose: Create an IsoTriangle application that prompts the user for the size of an isosceles triangle and then
displays the triangle with that many lines.

Author: Mohammed Abdalla, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class IsoTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the triangle
        System.out.print("Enter the size of the isosceles triangle: ");
        int size = input.nextInt();

        // Loop from the first line to the last line of the triangle
        for (int line = 1; line <= size; line++) {

            // First print the spaces to center the triangle
            // Spaces decrease as the line number increases
            addSpaces(size - line);

            // Now print the stars for this row
            // Number of stars always follows the pattern: 2*line - 1
            drawBar((2 * line) - 1);

            // Move to the next line after printing stars
            System.out.println();
        }
    }

    // Method that prints a certain number of stars
    public static void drawBar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*"); // print one star at a time
        }
    }

    // Method that prints a certain number of spaces (for centering)
    public static void addSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" "); // print one space at a time
        }
    }
}



/* Screen Dump
 
Enter the size of the isosceles triangle: 10
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************

 
 */
