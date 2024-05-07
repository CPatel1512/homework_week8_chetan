package homeworkweek8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber {

    // Method to print the Fibonacci sequence up to 'numTerms' terms
    public static void printFibonacciSequence(int numTerms) {
        // Handle the case where numTerms is less than 1
        if (numTerms < 1) {
            System.out.println("The number of terms must be at least 1.");
            return;
        }

        // Initialize the first two terms of the Fibonacci sequence
        int first = 1;
        int second = 1;

        // Print the first term
        System.out.print(first);

        // Check if more than one term is required
        if (numTerms > 1) {
            // Print the second term
            System.out.print(" " + second);

            // Calculate and print the remaining terms in the sequence
            for (int i = 3; i <= numTerms; i++) {
                // Calculate the next term as the sum of the previous two terms
                int next = first + second;

                // Print the next term
                System.out.print(" " + next);

                // Update the first and second terms for the next iteration
                first = second;
                second = next;
            }
        }
        // Print a new line at the end
        System.out.println();
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        // Test the method with different number of terms
        printFibonacciSequence(8); // Example: Print 8 terms in the Fibonacci sequence
    }

}
