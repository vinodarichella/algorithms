package com.arichella.algorithm.leetcode;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0]=1;
        for (int i=1; i<nums.length; i++) {

        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{-1,1,0,-3,3});
        for (int i : ints) {
            System.out.print(i+" ");
        }

    }
}
