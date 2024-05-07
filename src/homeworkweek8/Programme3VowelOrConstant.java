package homeworkweek8;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme3VowelOrConstant {


    // Method to get user input
    public static char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        char ch = '\0'; // Initialize char variable
        boolean validInput = false; // Flag to check valid input

        while (!validInput) {
            System.out.print("Input an alphabet: ");
            String input = scanner.nextLine().trim();

            // Check if the input length is exactly 1
            if (input.length() == 1) {
                ch = input.charAt(0);
                // Check if the character is an alphabet letter (case insensitive)
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    validInput = true; // Set flag to true when valid input is provided
                } else {
                    // Print error message if the character is not a letter
                    System.out.println("Error: Please enter an alphabet character (a-z or A-Z).");
                }
            } else {
                // Print error message if input length is not exactly 1
                System.out.println("Error: Please enter exactly one character.");
            }
        }

        return ch; // Return the valid character
    }

    // Method to check whether a character is a vowel or consonant
    public static void checkVowelOrConsonant(char ch) {
        // Convert character to lowercase for easier comparison
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println("Input letter is Vowel");
        } else {
            // If not a vowel, it must be a consonant
            System.out.println("Input letter is Consonant");
        }
    }

    public static void main(String[] args) {
        // Get user input
        char userChar = getUserInput();
        // Check whether the input character is a vowel or consonant
        checkVowelOrConsonant(userChar);
    }
}
