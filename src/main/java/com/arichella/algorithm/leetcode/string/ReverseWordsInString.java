package com.arichella.algorithm.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        int left=0;

        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList();

        while (left <= s.length()-1) {
            if (s.charAt(left) == ' ') {
                result.add(reverse(sb.toString()));
                sb.setLength(0);
            } else {
                sb.append(s.charAt(left));
            }
            left++;
        }

        result.add(reverse(sb.toString()));
        return String.join(" ", result);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Let's take LeetCode contest"));
    }
}
