public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define a hardcoded string literal
        String str = "madam";
        String reversedStr = "";

        // Step 2: Logic to reverse the string
        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reversedStr = reversedStr + str.charAt(i);
        }

        // Step 3: Conditional statement (if-else) to check palindrome
        if (str.toLowerCase().equals(reversedStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }

        // Program exits
    }
}