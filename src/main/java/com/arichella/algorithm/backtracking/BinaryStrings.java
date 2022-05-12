package com.arichella.algorithm.backtracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        int a = 5, b =8;
        a = a ^ b;
        System.out.println(a + " " + b);
        b = a ^ b;
        System.out.println(a + " " + b);
        a = a ^ b ;
        System.out.println(a + " " + b);
        BinaryStrings binaryStrings = new BinaryStrings();
        binaryStrings.binary(5);
        Map<Character, Integer> map = new HashMap<>();
        map.merge('a', 1, Integer::sum);
    }
}
