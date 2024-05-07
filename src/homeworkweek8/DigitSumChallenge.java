package homeworkweek8;

/**
 * Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */

public class DigitSumChallenge {
    // Method to check if the number is valid
    public static boolean isValidNumber(int number) {
        return number >= 10 && number >= 0;
    }

    // Method to sum the digits of a valid number
    public static int sumOfDigits(int number) {
        int sum = 0;

        // Use while the number is not zero
        while (number > 0) {
            // Extract the least significant digit using modulus operation
            int digit = number % 10;
            // Add the extracted digit to the sum
            sum += digit;
            // Discard the least significant digit
            number = number / 10;
        }

        // Return the sum of all digits
        return sum;
    }

    // Main method to sum the digits of the number
    public static int sumDigits(int number) {
        // Check if the input number is valid using helper method
        if (!isValidNumber(number)) {
            return -1; // Return -1 for invalid input
        }

        // If valid, calculate the sum of the digits using helper method
        return sumOfDigits(number);
    }

    // Main method to test the sumDigits method
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDigits(125)); // Expected output: 8 (1 + 2 + 5 = 8)
        System.out.println(sumDigits(1)); // Expected output: -1 (invalid value)
        System.out.println(sumDigits(0)); // Expected output: -1 (invalid value)
        System.out.println(sumDigits(-10)); // Expected output: -1 (invalid value)
        System.out.println(sumDigits(987)); // Expected output: 24 (9 + 8 + 7 = 24)
        System.out.println(sumDigits(999)); // Expected output: 27 (9 + 9 + 9 = 27)
    }

}
