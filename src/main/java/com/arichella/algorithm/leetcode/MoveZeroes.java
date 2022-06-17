package com.arichella.algorithm.leetcode;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int j=0;
        for (int i=0; i < length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while (j < length) {
            nums[j++] = 0;
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
