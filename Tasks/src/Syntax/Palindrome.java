package Syntax;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String message = "Madam, I'm Adam!";
        boolean result = myPalindrome(message);
        System.out.println(result);
    }
    // O(N)
    public static boolean myPalindrome(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();
        String reverseMessage = builder.toString();
        return reverseMessage.equals(text);
    }

    // O(logN)
    public static boolean bestPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int len = text.length();
        for (int i=0; i<(len/2); i++){
            if (text.charAt(i) != text.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
