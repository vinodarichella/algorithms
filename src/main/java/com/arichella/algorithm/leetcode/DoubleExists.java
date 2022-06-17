package com.arichella.algorithm.leetcode;

public class DoubleExists {

    public static boolean checkIfExist(int[] arr) {

        for (int i=0; i< arr.length-1; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {7,1,14,11}));
    }
}
