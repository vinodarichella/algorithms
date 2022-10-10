package com.arichella.algorithm.leetcode.dsa.arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, currCount);
                currCount = 0;
            } else {
                currCount++;
            }
        }
        return Math.max(max, currCount);
    }
}
