package homeworkweek8;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class ArmstrongNumberOrNot {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert the number to a string to work with each digit
        String numStr = Integer.toString(number);
        // Calculate the number of digits
        int numDigits = numStr.length();
        // Initialize the sum of digits raised to the power of numDigits
        int sumOfPowers = 0;

        // Calculate the sum of each digit raised to the power of numDigits
        for (int i = 0; i < numDigits; i++) {
            // Get each digit as an integer
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Calculate digit raised to the power of numDigits and add it to the sum
            sumOfPowers += Math.pow(digit, numDigits);
        }

        // Check if the sum of powers is equal to the original number
        return sumOfPowers == number;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
