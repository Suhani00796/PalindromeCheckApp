import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC6: Queue + Stack Based Palindrome Check
        String input = "radar";
        
        // Queue follows FIFO; Stack follows LIFO
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue & Push operations
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) vs pop (LIFO)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
