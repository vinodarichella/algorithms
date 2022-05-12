package com.arichella.algorithm.arrays;

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sortedSquares[i] = nums[i] * nums[i];
        }

        Arrays.sort(sortedSquares);
        return sortedSquares;
    }

    public int[] sort(int[] nums) {
        int temp = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            for (int jdx = idx + 1; jdx < nums.length; jdx++) {
                if (nums[idx] > nums[jdx]) {
                    temp = nums[idx];
                    nums[idx] = nums[jdx];
                    nums[jdx] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums ={-7,-3,2,3,11};
        SortedSquares sortedSquares = new SortedSquares();
        sortedSquares.sortedSquares(nums);
    }
}
