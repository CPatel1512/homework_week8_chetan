package homeworkweek8;

/**
 * Display left angle triangle of * using nested for loops
 *              *
 *            * *
 *          * * *
 *        * * * *
 *      * * * * *
 *
 */
public class LeftAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as desired

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print("   "); // Print three spaces
            }

            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
