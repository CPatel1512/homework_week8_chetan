package homeworkweek8;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {

    // Method to calculate the sum of even digits within a number
    public static int getEvenDigitSum(int number) {
        // Return -1 if the number is negative
        if (number < 0) {
            return -1;
        }

        // Initialize the sum of even digits to 0
        int sum = 0;

        // Iterate through each digit in the number
        while (number > 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Check if the digit is even
            if (digit % 2 == 0) {
                // Add the even digit to the sum
                sum += digit;
            }

            // Remove the last digit from the number
            number /= 10;
        }

        // Return the sum of even digits
        return sum;
    }

    public static void main(String[] args) {
        // Test the method with various inputs
        System.out.println(getEvenDigitSum(123456789)); // Output: 20
        System.out.println(getEvenDigitSum(252)); // Output: 4
        System.out.println(getEvenDigitSum(-22)); // Output: -1
    }
}
