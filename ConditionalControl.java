
// Import the scanner to read input from input sources
import java.util.Scanner;

public class ConditionalControl {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // if Statement
        System.out.print("Enter a number to check if it is positive: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else Statement
        System.out.print("Enter your age to check if you are an adult: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // if-else if Statement
        System.out.print("Enter your score to determine your grade: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Close the scanner
        sc.close();
    }
}

/*
 * OUTPUT
 * Enter a number to check if it is positive: 5
 * The number is positive.
 * Enter your age to check if you are an adult: 20
 * You are an adult.
 * Enter your score to determine your grade: 85
 * Grade: B
 */
