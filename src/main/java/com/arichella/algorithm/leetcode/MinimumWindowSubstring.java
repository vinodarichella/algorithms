package com.arichella.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
            return "";
        }

        int[] ans = {-1, 0, 0};
        int l=0, r=0;
        int reqLength = t.length();
        int foundLength = 0;

        Map<Character, Integer> tMap = new HashMap<>();

        for (int i=0;i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowCounts = new HashMap<>();

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0)+1);

            if (tMap.containsKey(c) && tMap.get(c).intValue() == windowCounts.get(c).intValue()) {
                foundLength++;
            }


            while (l<=r && foundLength == tMap.size()) {

                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                char sl = s.charAt(l);
                l++;

                if (tMap.containsKey(sl)) {
                    if ( tMap.get(sl).intValue() == windowCounts.get(sl).intValue()) {
                        foundLength--;
                    }
                    windowCounts.put(sl, windowCounts.get(sl) - 1);
                }
            }

            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}