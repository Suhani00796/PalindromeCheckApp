public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // UC3: String Reverse Logic
        String original = "radar";
        String reversed = "";

        // Use a for loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) demonstrates string immutability
            reversed = reversed + original.charAt(i);
        }

        // Use equals() to compare content
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}