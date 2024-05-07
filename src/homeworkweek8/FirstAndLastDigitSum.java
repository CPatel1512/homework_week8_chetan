package homeworkweek8;

/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class FirstAndLastDigitSum {

    // Method to calculate the sum of the first and last digit of the given number
    public static int sumFirstAndLastDigit(int number) {
        // Return -1 if the number is negative to indicate invalid input
        if (number < 0) {
            return -1;
        }

        // Calculate the last digit using modulus operator
        int lastDigit = number % 10;

        // Initialize a variable to find the first digit
        int firstDigit = number;

        // Loop to find the first digit
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Return the sum of the first and last digit
        return firstDigit + lastDigit;
    }

    // Test the method
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumFirstAndLastDigit(232)); // Expected output: 4 (2 + 2)
        System.out.println(sumFirstAndLastDigit(267)); // Expected output: 9 (2 + 7)
        System.out.println(sumFirstAndLastDigit(0));   // Expected output: 0 (0 + 0)
        System.out.println(sumFirstAndLastDigit(5));   // Expected output: 10 (5 + 5)
        System.out.println(sumFirstAndLastDigit(-10)); // Expected output: -1 (invalid input)
    }

}