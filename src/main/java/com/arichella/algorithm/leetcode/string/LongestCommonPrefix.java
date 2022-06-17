package com.arichella.algorithm.leetcode.string;

import java.util.Arrays;
import java.util.Optional;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String EMPTY = "";
        if (strs == null || strs.length == 0) {
            return EMPTY;
        }

        Boolean anyEmpty = Arrays.stream(strs)
                .filter(str -> str == null || str.length() == 0)
                .findAny().isPresent();

        if (anyEmpty) {
            return EMPTY;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < strs[0].length()) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.length() <= i || c != str.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
