package org.example;

public class ValidPalindrome {

    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
    // Time Complexity O(n)

    public static void main(String[] args) {

        System.out.println(isPalindrome("0P"));


    }

    public static boolean isPalindrome(String s) {

        char[] sAsChars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : sAsChars) {
            int typeCategory = Character.getType(c);
            if (typeCategory == Character.UPPERCASE_LETTER ||
                    typeCategory == Character.LOWERCASE_LETTER ||
                    Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        char[] chars = sb.toString().toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) return false;
        }

        return true;
    }
}
