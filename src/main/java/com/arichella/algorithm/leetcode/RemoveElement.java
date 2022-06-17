package com.arichella.algorithm.leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int i = removeElement(nums, 2);
        for (int j=0; j<i; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
