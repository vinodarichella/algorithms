package com.arichella.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int longest = 0;

        for (int num : nums) {
            numbers.add(num);
        }

        for (Integer number : numbers) {
            if (numbers.contains(number-1)) {
                continue;
            }

            int curr = 1;
            int currNum = number;

            while (numbers.contains(currNum+1)) {
                currNum++;
                curr++;
            }

            longest = Math.max(longest, curr);
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {100,4,200,1,3,2}));
    }
}
