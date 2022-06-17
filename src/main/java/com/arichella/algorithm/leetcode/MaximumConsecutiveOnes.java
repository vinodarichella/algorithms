package com.arichella.algorithm.leetcode;

public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;

        int j=0;
        while (j< nums.length && nums[j] != 1) {
            j++;
        }

        for (int i = j; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, curr);
                curr = 0;
            } else {
                curr++;
            }
        }

        max = Math.max(max, curr);

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }
}
