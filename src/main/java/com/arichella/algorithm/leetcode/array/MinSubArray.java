package com.arichella.algorithm.leetcode.array;

public class MinSubArray {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right = 0;

        int sum = nums[0];

        if (sum == target) {
            return 1;
        }

        if (nums.length == 1) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        while (left <= right && right < nums.length) {
            if (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum = sum - nums[left++];
            } else if(sum < target && ++right < nums.length) {
                sum = sum + nums[right];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[] {1,2,3,4,5}));
    }
}
