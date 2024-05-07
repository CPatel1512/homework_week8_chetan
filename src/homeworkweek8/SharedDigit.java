package homeworkweek8;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 *
 */
public class SharedDigit {
    // Method to check if there is a shared digit between two numbers
    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if both numbers are within the range of 10 to 99 (inclusive)
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        // Extract the digits from the first number
        int num1Digit1 = num1 % 10; // Last digit
        int num1Digit2 = num1 / 10; // First digit

        // Extract the digits from the second number
        int num2Digit1 = num2 % 10; // Last digit
        int num2Digit2 = num2 / 10; // First digit

        // Check if any digit from the first number matches any digit from the second number
        if ((num1Digit1 == num2Digit1) || (num1Digit1 == num2Digit2) ||
                (num1Digit2 == num2Digit1) || (num1Digit2 == num2Digit2)) {
            return true;
        }

        // If no matching digits are found, return false
        return false;
    }

    public static void main(String[] args) {
        // Test the method with various inputs
        System.out.println(hasSharedDigit(12, 23)); // Output: true (shared digit 2)
        System.out.println(hasSharedDigit(9, 99)); // Output: false (9 is not within the range of 10-99)
        System.out.println(hasSharedDigit(15, 55)); // Output: true (shared digit 5)
    }
}
