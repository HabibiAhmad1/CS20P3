package Skillbuilders;



	
	
		import java.util.Scanner;

		public class Digits {
		    public static void main(String[] args)
		    {
		        Scanner input = new Scanner(System.in);

		        // Ask the user for a two-digit number
		        System.out.print("Enter a two-digit number: ");
		        int number = input.nextInt();

		        // Get the ones place (last digit)
		        int ones = number % 10;

		        // Get the tens place (first digit)
		        int tens = number / 10;

		        // Show the result
		        System.out.println("Tens place: " + tens);
		        System.out.println("Ones place: " + ones);
		    
		
		

	}

}
