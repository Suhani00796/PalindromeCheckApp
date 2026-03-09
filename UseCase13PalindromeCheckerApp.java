/**
 * ============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "racecar";
        
        // Using the Strategy from UC12
        PalindromeStrategy strategy = new StackStrategy();
        
        // Capture start time in nanoseconds
        long startTime = System.nanoTime();
        
        // Execute the algorithm
        boolean isPalindrome = strategy.check(input);
        
        // Capture end time
        long endTime = System.nanoTime();
        
        // Calculate duration
        long duration = endTime - startTime;
        
        // Display benchmarking results
        System.out.println("Input String      : " + input);
        System.out.println("Is Palindrome     : " + isPalindrome);
        System.out.println("Execution Time    : " + duration + " ns");
    }
}

// Note: Ensure your PalindromeStrategy interface and StackStrategy 
// from UC12 are included in your project for this to compile.