/**
 * UC1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */

public class UseCase1PalindromeCheckerApp {

    // Application details (constants)
    private static final String APP_NAME = "Palindrome Checker Application";
    private static final String APP_VERSION = "Version 1.0";

    /**
     * Main Method – Entry point of the Java application
     * JVM invokes this method automatically.
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("=====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("=====================================");

        // Application Flow Control
        System.out.println("Application initialized successfully.");
        System.out.println("Ready to proceed to the next use case...");
    }
}