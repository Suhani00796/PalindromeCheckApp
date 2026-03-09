import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome validation
 * algorithms can be selected dynamically at runtime using the 
 * Strategy Design Pattern.
 * * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack-based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 * * The focus is purely on algorithm interchangeability.
 * * @author Developer
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "racecar";

        // Inject the concrete StackStrategy into the interface
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the algorithm via the strategy interface
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input String  : " + input);
        System.out.println("Strategy Used : Stack-based");
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Provides a Stack-based implementation of the PalindromeStrategy.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using a Stack.
     * Uses LIFO behavior to reverse characters for comparison.
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack against original
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}