/*

Program: RandomStats.java          Last Date of this Revision: December, 9, 2025

Purpose: Create a RandomStats application that generates 500 random numbers 
between 0 and 9 and then displays the number of occurrences of each number.

Author: Mohammed Abdalla, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Random;

public class RandomStats {

    public static void main(String[] args) {

    	// total numbers to generate
        final int NUM_RANDOMS = 500;  
        
        // numbers 0–9
        final int RANGE = 10;         
        
        // stores occurrences of each number
        int[] counts = new int[RANGE]; 

        Random rand = new Random();

        // Generate random numbers and count them
        for (int i = 0; i < NUM_RANDOMS; i++) {
            
        	// random number from 0 to 9
        	int num = rand.nextInt(RANGE); 
        	
        	// increase the count for that number
            counts[num]++;                 
        }

        // Display results
        System.out.println("Number of occurrences for each digit (0–9):");

        for (int i = 0; i < RANGE; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}

//Screen Dump

/*
 Number of occurrences for each digit (0–9):
0: 39
1: 43
2: 58
3: 51
4: 63
5: 58
6: 48
7: 47
8: 48
9: 45


0: 65
1: 41
2: 51
3: 53
4: 55
5: 46
6: 50
7: 53
8: 41
9: 45
*/