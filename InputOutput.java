
//import the scanner to read input from input sources
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);

        /*
         * take input using the scanner object's nextLine function
         * You may use different functions for different data types
         * int input = sc.nextInt();
         * float input = sc.nextFloat();
         * double input = sc.nextDouble();
         * boolean input = sc.nextBoolean();
         * String input = sc.nextLine(); or sc.next();
         */

        System.out.print("Enter Your Name: ");
        String input = sc.nextLine();

        // Print the output to console
        System.out.println("Hellow " + input);

        sc.close();
    }
}

/*
 * OUTPUT
 * Enter Your Name: rohit
 * Hellow rohit
 */