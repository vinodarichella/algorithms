package com.arichella.algorithm.leetcode.array;

public class FindMiddleIndex {

    public static int pivotIndex(int[] nums) {
        int totSum = 0;
        for (int i=0; i<nums.length; i++) {
            totSum += nums[i];
        }

        int currSum = 0;

        for (int i=0; i<nums.length; i++) {
            int pSum = totSum - nums[i] - currSum;

            if (pSum == currSum) {
                return i;
            } else {
                currSum += nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
    }
}
