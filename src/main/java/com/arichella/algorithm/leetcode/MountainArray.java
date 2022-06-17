package com.arichella.algorithm.leetcode;

public class MountainArray {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int i=0;

        while (i+1 < arr.length && arr[i] < arr[i+1]) {
            i++;
        }

        if (i == 0 ||  i == arr.length - 1)
            return false;

        while (i+1 < arr.length && arr[i] > arr[i+1]) {
            i++;
        }

        return i == arr.length-1;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[] {0,1,2,3,4,5,6,7,8,9}));
    }
}
