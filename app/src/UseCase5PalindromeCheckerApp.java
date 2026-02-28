import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC5: Stack-Based Palindrome Checker
        String input = "radar";
        Stack<Character> stack = new Stack<>();

        // Push Operation ? Inserting characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        // Pop Operation ? Removing characters in reverse order (LIFO)
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Reversal Logic ? Comparing the original with the stack-reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
