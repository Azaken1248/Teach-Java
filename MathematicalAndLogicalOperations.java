
// Import the scanner to read input from input sources
import java.util.Scanner;

public class MathematicalAndLogicalOperations {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Arithmetic Operators
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // Make sure num2 is not 0 to avoid division by zero
        int remainder = num1 % num2;

        // Print the results of arithmetic operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Logical Operators
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool1 = sc.nextBoolean();

        System.out.print("Enter another boolean value (true/false): ");
        boolean bool2 = sc.nextBoolean();

        // Perform logical operations
        boolean andResult = bool1 && bool2;
        boolean orResult = bool1 || bool2;
        boolean notResult1 = !bool1;
        boolean notResult2 = !bool2;

        // Print the results of logical operations
        System.out.println("Logical AND (bool1 && bool2): " + andResult);
        System.out.println("Logical OR (bool1 || bool2): " + orResult);
        System.out.println("Logical NOT (!bool1): " + notResult1);
        System.out.println("Logical NOT (!bool2): " + notResult2);

        // Close the scanner
        sc.close();
    }
}

/*
 * OUTPUT
 * Enter first number: 10
 * Enter second number: 5
 * Sum: 15
 * Difference: 5
 * Product: 50
 * Quotient: 2
 * Remainder: 0
 * Enter a boolean value (true/false): true
 * Enter another boolean value (true/false): false
 * Logical AND (bool1 && bool2): false
 * Logical OR (bool1 || bool2): true
 * Logical NOT (!bool1): false
 * Logical NOT (!bool2): true
 */
