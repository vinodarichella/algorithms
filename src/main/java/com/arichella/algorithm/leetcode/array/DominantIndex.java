package com.arichella.algorithm.leetcode.array;

public class DominantIndex {

    public static int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int largest = nums[0];
        int largestIndex = 0;

        for (int i = 1; i< nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                largestIndex = i;
            }
        }

        for (int i=0; i < nums.length; i++) {
            if (2*nums[i] > largest && i != largestIndex) {
                return -1;
            }
        }

        return largestIndex;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {1}));
    }
}
