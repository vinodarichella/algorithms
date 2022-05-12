package com.arichella.algorithm.arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int[] src = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            src[i] = arr[i];
        }

        for (int i =0, d=0; d < arr.length; i++) {
            arr[d] = src[i];
            if (src[i] == 0 && d+1 < arr.length) {
                arr[d+1] = 0;
                d++;
            }
            d++;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
    }
}
