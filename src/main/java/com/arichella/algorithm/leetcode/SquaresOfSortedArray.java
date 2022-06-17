package com.arichella.algorithm.leetcode;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {

        if (nums.length == 1) {
            return new int[] {nums[0]*nums[0]};
        }

        int start =0;
        int[] result = new int[nums.length];
        int j=0;
        if (nums[nums.length-1] < 0) {
            start = nums.length-1;
        } else {
            for(int i=0; i< nums.length; i++) {
                if (nums[i] >= 0) {
                    start = i;
                    break;
                }
            }
        }

        int left = start-1;
        int right = left+1;

        while (left >= 0 || right < nums.length) {
            if (left >=0 && right < nums.length) {
                int l = nums[left]*nums[left];
                int r = nums[right]*nums[right];
                if (l < r) {
                    result[j++] = l;
                    left--;
                } else {
                    result[j++] = r;
                    right++;
                }

            } else if (left >=0) {
                result[j++] = nums[left]*nums[left];
                left--;
            } else if (right < nums.length) {
                result[j++] = nums[right]*nums[right];
                right++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] squres = sortedSquares(new int[] {-1,2,2});
        for (int squre : squres) {
            System.out.print(squre + " ");
        }

    }
}
