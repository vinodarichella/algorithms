package com.arichella.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {

        int l=0;
        int r=0;

        Set<Character> set = new HashSet<Character>();

        int longest=0;

        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
            longest = Math.max(longest, r-l);
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
