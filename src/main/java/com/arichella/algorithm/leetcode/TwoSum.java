package com.arichella.algorithm.leetcode;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length-1; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        printArray(twoSum(new int[] {3,3}, 6));
    }

    private static void printArray(int[] twoSum) {
        for (int i : twoSum) {
            System.out.println(i);
        }
    }
}
