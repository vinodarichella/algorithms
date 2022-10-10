package com.arichella.algorithm.leetcode.dsa.arrays;

public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        int lCount;
        for (int num : nums) {
            lCount =0;
            while (num != 0) {
                num = num / 10;
                lCount++;
            }
            if (lCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
