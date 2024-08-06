
// Import the scanner to read input from input sources
import java.util.Scanner;

public class LoopingConstructs {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // for Loop
        System.out.print("Enter the number of iterations for the for loop: ");
        int n = sc.nextInt();

        System.out.println("for Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration " + i);
        }

        // while Loop
        System.out.print("Enter a positive number for the while loop countdown: ");
        int countdown = sc.nextInt();

        System.out.println("while Loop:");
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // do-while Loop
        System.out.print("Enter a positive number for the do-while loop countdown: ");
        int doWhileCountdown = sc.nextInt();

        System.out.println("do-while Loop:");
        do {
            System.out.println("Countdown: " + doWhileCountdown);
            doWhileCountdown--;
        } while (doWhileCountdown > 0);

        // Close the scanner
        sc.close();
    }
}

/*
 * OUTPUT
 * Enter the number of iterations for the for loop: 3
 * for Loop:
 * Iteration 1
 * Iteration 2
 * Iteration 3
 * Enter a positive number for the while loop countdown: 3
 * while Loop:
 * Countdown: 3
 * Countdown: 2
 * Countdown: 1
 * Enter a positive number for the do-while loop countdown: 3
 * do-while Loop:
 * Countdown: 3
 * Countdown: 2
 * Countdown: 1
 */
