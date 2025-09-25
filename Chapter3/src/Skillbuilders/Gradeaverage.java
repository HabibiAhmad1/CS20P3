


	
	
		package Skillbuilders;

		import java.util.Scanner;

		public class Gradeaverage
		{

		    public static void main(String[] args)
		{
		        Scanner input = new Scanner(System.in);

		        // Ask the user for 5 grades
		        System.out.print("Enter grade 1: ");
		        int g1 = input.nextInt();

		        System.out.print("Enter grade 2: ");
		        int g2 = input.nextInt();

		        System.out.print("Enter grade 3: ");
		        int g3 = input.nextInt();

		        System.out.print("Enter grade 4: ");
		        int g4 = input.nextInt();

		        System.out.print("Enter grade 5: ");
		        int g5 = input.nextInt();

		        // Calculate the sum
		        int sum = g1 + g2 + g3 + g4 + g5;

		        // Real division: use double for average
		        double average = sum / 5.0;

		        // Show the result
		        System.out.println("The average is: " + average + "%");
		    }
		

	}


