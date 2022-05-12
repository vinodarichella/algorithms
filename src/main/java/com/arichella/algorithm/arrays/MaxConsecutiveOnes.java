package com.arichella.algorithm.arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
            } else {
                if (current > max)
                    max = current;
                current = 0;
            }
        }
        if (current > max)
            max = current;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,0,1,1,1,1,0,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
