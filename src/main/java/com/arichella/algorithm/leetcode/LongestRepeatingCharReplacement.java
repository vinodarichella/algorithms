package com.arichella.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharReplacement {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[128];
        int max = 0;
        int start = 0;
        for (int end = 0; end < s.length();) {
            max = Math.max(max, ++count[s.charAt(end++)]);
            if (max + k < end - start) {
                count[s.charAt(start++)]--;
            }
        }
        return s.length() - start;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 1));
    }
}
