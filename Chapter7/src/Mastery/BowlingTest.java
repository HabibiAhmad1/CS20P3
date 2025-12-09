/*

Program: Bowling.java          Last Date of this Revision: December, 2, 2025

Purpose: In bowling, a ball is rolled down a lane, also called an alley, at a set of ten pins. A game consists of a
bowler bowling for ten frames, where each frame consists of two chances (throws) to knock over all ten
pins.

Author: Mohammed Abdalla, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class BowlingTest 
{

	public static void main(String[] args) 
	{
		Bowling b1 = new Bowling("You");
		Bowling b2 = new Bowling("Computer");
		
		Scanner input = new Scanner(System.in);
		
		int frames = 1;
		
		while(frames <= 10)
		{
			b1.takeTurn();
			System.out.println("Score is: " + b1.getScore());
			
			b2.takeTurn();
			System.out.println("Score is: " + b2.getScore());
			
			frames += 1;
		}
		
		if(b1.getScore() > b2.getScore())
		{
			System.out.println(b1.getName() + "WINS!");
		}
		else if(b2.getScore() > b1.getScore())
		{
			System.out.println(b2.getName() + "WINS!");
		}
		else
		{
			System.out.println("It's a tie. ");
		}

	}

}

/*Screen Dump
You knocked over 8 pins.
You knocked over 1 pins.
Score is: 9
Computer knocked over 5 pins.
Computer knocked over 1 pins.
Score is: 6
You knocked over 6 pins.
You knocked over 4 pins.
Score is: 19
Computer knocked over 10 pins.
Score is: 16
You knocked over 1 pins.
You knocked over 8 pins.
Score is: 28
Computer knocked over 3 pins.
Computer knocked over 7 pins.
Score is: 26
You knocked over 4 pins.
You knocked over 2 pins.
Score is: 34
Computer knocked over 2 pins.
Computer knocked over 8 pins.
Score is: 36
You knocked over 9 pins.
You knocked over 1 pins.
Score is: 44
Computer knocked over 4 pins.
Computer knocked over 5 pins.
Score is: 45
You knocked over 5 pins.
You knocked over 3 pins.
Score is: 52
Computer knocked over 6 pins.
Computer knocked over 1 pins.
Score is: 52
You knocked over 1 pins.
You knocked over 8 pins.
Score is: 61
Computer knocked over 4 pins.
Computer knocked over 3 pins.
Score is: 59
You knocked over 4 pins.
You knocked over 4 pins.
Score is: 69
Computer knocked over 10 pins.
Score is: 69
You knocked over 4 pins.
You knocked over 1 pins.
Score is: 74
Computer knocked over 2 pins.
Computer knocked over 8 pins.
Score is: 79
You knocked over 5 pins.
You knocked over 5 pins.
Score is: 84
Computer knocked over 1 pins.
Computer knocked over 8 pins.
Score is: 88
ComputerWINS!

*/