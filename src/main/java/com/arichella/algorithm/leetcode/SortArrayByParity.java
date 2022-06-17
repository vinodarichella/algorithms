package com.arichella.algorithm.leetcode;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int[] result = new int[nums.length];
        int start=0;
        int end = nums.length-1;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] % 2 ==0) {
                result[start++] = nums[i];
            } else {
                result[end--] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,1,2,4};
        for (int i : sortArrayByParity(nums)) {
            System.out.print(i + " ");
        }

    }
}
