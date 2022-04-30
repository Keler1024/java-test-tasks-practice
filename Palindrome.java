import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("null provided instead of string object");
        }
        int rightIndex = s.length() - 1;
        int leftIndex = 0;
        char leftChar, rightChar;
        while (leftIndex < rightIndex) {
            while(!Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
                if (leftIndex == rightIndex) {
                    return true;
                }
            }
            if (Character.isUpperCase(s.charAt(leftIndex))) {
                leftChar = Character.toLowerCase(s.charAt(leftIndex));
            }
            else {
                leftChar = s.charAt(leftIndex);
            }
            while(!Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
                if (leftIndex == rightIndex) {
                    return true;
                }
            }
            if (Character.isUpperCase(s.charAt(rightIndex))) {
                rightChar = Character.toLowerCase(s.charAt(rightIndex));
            }
            else {
                rightChar = s.charAt(rightIndex);
            }
            if (leftChar == rightChar) {
                leftIndex++;
                rightIndex--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeEng(String s) {
        if (s == null) {
            throw new IllegalArgumentException("null provided instead of string object");
        }
        int rightIndex = s.length() - 1;
        int leftIndex = 0;
        char leftChar, rightChar;
        while (leftIndex < rightIndex) {
            while(!isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
                if (leftIndex == rightIndex) {
                    return true;
                }
            }
            if (isUpperCase(s.charAt(leftIndex))) {
                leftChar = (char)(s.charAt(leftIndex)+32);
            }
            else {
                leftChar = s.charAt(leftIndex);
            }
            while(!isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
                if (leftIndex == rightIndex) {
                    return true;
                }
            }
            if (isUpperCase(s.charAt(rightIndex))) {
                rightChar = (char)(s.charAt(rightIndex)+32);
            }
            else {
                rightChar = s.charAt(rightIndex);
            }
            if (leftChar == rightChar) {
                leftIndex++;
                rightIndex--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ;
    }

    private static boolean isUpperCase(char c) {
        return (c >= 'A' && c <= 'Z') ;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeEng("performancengineering"));
        System.out.println(isPalindromeEng("rotor"));
        System.out.println(isPalindromeEng("Was it a car or a cat I saw?"));
        System.out.println(isPalindromeEng("Madam, I'm Adam"));
        System.out.println(isPalindrome("performancengineering"));
        System.out.println(isPalindrome("rotor"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("Madam, I'm Adam"));
    }
}
