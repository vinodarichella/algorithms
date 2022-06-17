package com.arichella.algorithm.leetcode.array;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i=n-1; i >=0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[][] xy = new int[2][3];

        System.out.println(xy[0].length);
        System.out.println(xy.length);

        int[] nums = plusOne(new int[] {9});
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
