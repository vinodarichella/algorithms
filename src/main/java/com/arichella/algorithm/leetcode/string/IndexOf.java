package com.arichella.algorithm.leetcode.string;

public class IndexOf {
    public static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        int h = haystack.length();
        int n = needle.length();

        char first = needle.charAt(0);

        for (int i=0; i < h; i++) {
            while (i < h && haystack.charAt(i) != first) {
                i++;
            }

            if (n > h - i) {
                return -1;
            }

            if (i <= h) {
                int j = i + 1;
                int end = j + n - 1;
                for (int k=1; j < end && haystack.charAt(j) == needle.charAt(k); j++, k++);
                if (j == end) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("b", "a"));
    }
}
