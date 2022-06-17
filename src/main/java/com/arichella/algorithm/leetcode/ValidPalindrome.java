package com.arichella.algorithm.leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++ ) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String finalString = sb.toString();

        if (finalString.length() < 1) {
            return false;
        } else if (finalString.length() == 1){
            return true;
        }

        int start = 0, end = finalString.length() - 1;

        while (start < end) {
            if (finalString.charAt(start) != finalString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));;
    }
}
