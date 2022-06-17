package com.arichella.algorithm.leetcode;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,0,0,0,0,0};
        for (int i=0; i < nums.length; i++) {
            if (nums[i] == 0 && i != nums.length - 1) {
                int j = nums.length-1;
                while (j > i) {
                    nums[j] = nums[j-1];
                    j--;
                }
                nums[i+1] = 0;
                i++;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
