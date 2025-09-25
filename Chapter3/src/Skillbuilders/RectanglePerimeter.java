package Skillbuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		
		        //Declaration
		        int width;
		        int length;

		         //width = 4;
		         //length = 13;
		        
		        Scanner input = new Scanner(System.in);
		         
		        //Get width from user
		        System.out.print("Enter the width of the rectangle:");
		        width = input.nextInt();
		        
		      
		      //Get length from user
		        System.out.print("Enter the length of the rectangle: ");
		        length = input.nextInt();
		        
		        // Calculate perimeter
		        int perimeter = 2 * (width + length);
		         
		        System.out.println("Width = " + width);
		        System.out.println("Length = " + length);
		        System.out.println("Perimeter = " + perimeter);

	}
		

	}


