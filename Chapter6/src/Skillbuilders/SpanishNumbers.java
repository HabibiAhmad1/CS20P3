package Skillbuilders;

public class SpanishNumbers {

    public static void main(String[] args) {

        // Loop from 1 to 10
        for (int number = 1; number <= 10; number++) {
            printSpanish(number);
        }
    }

    // Method that prints the Spanish word for a given number
    public static void printSpanish(int number) {

        switch (number) {
            case 1:
                System.out.println("1 = uno");
                break;
            case 2:
                System.out.println("2 = dos");
                break;
            case 3:
                System.out.println("3 = tres");
                break;
            case 4:
                System.out.println("4 = cuatro");
                break;
            case 5:
                System.out.println("5 = cinco");
                break;
            case 6:
                System.out.println("6 = seis");
                break;
            case 7:
                System.out.println("7 = siete");
                break;
            case 8:
                System.out.println("8 = ocho");
                break;
            case 9:
                System.out.println("9 = nueve");
                break;
            case 10:
                System.out.println("10 = diez");
                break;
            default:
                System.out.println("Number out of range.");
        }
    }
}