package homeworkweek8;
/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

import java.util.Scanner;

public class Programme14Diamond {

    public static void printDiamond(int n) {
        // Initialize variables for the current row number and the maximum width of the diamond
        int row = 0;
        int maxWidth = n * 2 - 1;

        // Use while loop to print the top half of the diamond
        while (row < n) {
            // Calculate the number of asterisks for the current row
            int numAsterisks = 2 * row + 1;

            // Calculate the number of spaces to center the asterisks
            int numSpaces = (maxWidth - numAsterisks) / 2;

            // Print the spaces
            int spaceCount = 0;
            while (spaceCount < numSpaces) {
                System.out.print(" ");
                spaceCount++;
            }

            // Print the asterisks
            int asteriskCount = 0;
            while (asteriskCount < numAsterisks) {
                System.out.print("*");
                asteriskCount++;
            }

            // Move to the next line
            System.out.println();

            // Increment the row counter
            row++;
        }

        // Reset the row counter to iterate through the bottom half
        row = n - 2;

        // Use while loop to print the bottom half of the diamond
        while (row >= 0) {
            // Calculate the number of asterisks for the current row
            int numAsterisks = 2 * row + 1;

            // Calculate the number of spaces to center the asterisks
            int numSpaces = (maxWidth - numAsterisks) / 2;

            // Print the spaces
            int spaceCount = 0;
            while (spaceCount < numSpaces) {
                System.out.print(" ");
                spaceCount++;
            }

            // Print the asterisks
            int asteriskCount = 0;
            while (asteriskCount < numAsterisks) {
                System.out.print("*");
                asteriskCount++;
            }

            // Move to the next line
            System.out.println();

            // Decrement the row counter
            row--;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the diamond pattern
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int n = scanner.nextInt();

        // Call the method to print the diamond pattern
        printDiamond(n);

        // Close the scanner
        scanner.close();
    }
}
