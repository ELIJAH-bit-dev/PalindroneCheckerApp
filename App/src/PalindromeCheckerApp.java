/**
 * UC2: Print a Hardcoded Palindrome Result
 * Palindrome Checker Application
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Main Method – Entry point of the Java application
     * JVM invokes this method automatically.
     */
    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional Statement to check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}