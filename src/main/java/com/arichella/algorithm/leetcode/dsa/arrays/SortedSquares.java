package com.arichella.algorithm.leetcode.dsa.arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];
        for (int i = nums.length-1; i >= 0 && left <= right; i--) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
