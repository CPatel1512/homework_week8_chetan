package homeworkweek8;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle {

    // Method to display a right-angle triangle pattern using '@' character
    public static void displayRightAngleTriangle(int n) {
        // Outer loop to control the number of rows (from 1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop to control the number of '@' characters in each row (from 1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print the '@' character
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        // Test the method with different number of rows
        displayRightAngleTriangle(5); // Example: n = 5
    }
}

