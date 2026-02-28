public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC4: Character Array Based Palindrome Check
        String input = "radar";
        
        // Convert string to char[] – A primitive array for index-based access
        char[] charArray = input.toCharArray();
        
        boolean isPalindrome = true;
        
        // Two-Pointer Technique – One from start, one from end
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Compare start & end characters using Array Indexing
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;  // Move front pointer forward
            right--; // Move back pointer backward
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}