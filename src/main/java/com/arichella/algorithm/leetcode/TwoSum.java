package com.arichella.algorithm.leetcode;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            if (nums[start] + nums[end] == target) {
                return new int[] {start+1, end+1};
            } else {
                if (nums[start] + nums[end] > target) end--;
                else start++;
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        printArray(twoSum(new int[] {3,3}, 6));
    }

    private static void printArray(int[] twoSum) {
        for (int i : twoSum) {
            System.out.print(i + " ");
        }
    }
}
