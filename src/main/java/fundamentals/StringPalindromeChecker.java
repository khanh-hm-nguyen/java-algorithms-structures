package fundamentals;

/**
 * Determines if a string is a palindrome.
 * <p>
 * A palindrome reads the same forward and backward. This implementation
 * should be case-insensitive and ignore non-alphanumeric characters
 * if desired (though strict equality is easier to start).
 * </p>
 *
 * @return true if the string is a palindrome, false otherwise.
 */
public class StringPalindromeChecker {
    static boolean palindromeCheck(String text) {

        char[] cleanText = text.replaceAll("\\s+", "").toCharArray();

        int start = 0;
        int end = cleanText.length - 1;

        while (start < end) {
            if (cleanText[start] != cleanText[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main (String[] args) {
        String text = "never odd or even";
        System.out.println(palindromeCheck(text));
    }
}
