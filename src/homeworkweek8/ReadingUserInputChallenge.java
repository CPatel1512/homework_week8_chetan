package homeworkweek8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        // declare Scanner
        Scanner scanner = new Scanner(System.in);

        // Counter to keep track of how many valid numbers have been entered
        int validNumberCount = 0;
        // sum of valid numbers
        int sum = 0;

        // Use while loop
        while (validNumberCount <= 10) {
            // Prompt the user to enter a number
            System.out.printf("Enter number #%d: ", validNumberCount + 1);

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                // If it is an integer, read the number and add it to the sum
                int number = scanner.nextInt();
                sum += number;

                // Increment the counter for valid numbers
                validNumberCount++;
            } else {
                // If it is not an integer, print an error message
                System.out.println("Invalid Number");

                // Discard the invalid input
                scanner.next();
            }
        }

        // Print the total sum of the 10 valid numbers
        System.out.println("The sum of the 10 numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }


}


