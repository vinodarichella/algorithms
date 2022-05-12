package com.arichella.algorithm.recursion;

import java.util.Arrays;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {39,50,3,4,36,2,6,7,38,83,34,29,59,44};
        System.out.println(sum(arr));
    }

    private static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }

}
