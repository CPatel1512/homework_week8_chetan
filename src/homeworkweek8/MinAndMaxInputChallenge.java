package homeworkweek8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for minimum and maximum values
        // Set initial values as extreme boundaries for integers
        int min = Integer.MAX_VALUE;  // Maximum possible integer value
        int max = Integer.MIN_VALUE;  // Minimum possible integer value

        // Start an endless while loop
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter number: ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                // Read the next integer entered by the user
                int number = scanner.nextInt();

                // Update the minimum and maximum values
                if (number < min) {
                    min = number;  // Update minimum value
                }

                if (number > max) {
                    max = number;  // Update maximum value
                }
            } else {
                // If the input is not an integer, break out of the loop
                break;
            }
        }

        // Close the scanner
        scanner.close();

        // Print the minimum and maximum numbers
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
    }

}
