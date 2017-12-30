package com.arichella.algorithm.backtracking;

import java.util.Arrays;

public class BinaryStrings {

    int arr[] = new int[5];

    private void binary(int n) {
        if (n < 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            arr[n-1] = 0;
            binary(n-1);
            arr[n-1] = 1;
            binary(n-1);
        }
    }

    public static void main(String[] args) {
        BinaryStrings binaryStrings = new BinaryStrings();
        binaryStrings.binary(5);
    }
}
