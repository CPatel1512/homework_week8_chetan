package homeworkweek8;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 *
 */

import java.util.Scanner;

public class Programme6TrianglePattern {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Input number of rows: ");
        int numberOfRows = scanner.nextInt();

        // Close the scanner
        scanner.close();


        // Loop through each row from 1 to the number of rows
        for (int i = 1; i <= numberOfRows; i++) {
            // For each row, print the numbers from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after printing the numbers for the current row
            System.out.println();
        }
    }
}


