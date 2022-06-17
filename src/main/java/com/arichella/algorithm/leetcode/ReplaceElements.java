package com.arichella.algorithm.leetcode;

public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int start = 0;
        int wEnd = 0;
        int windowMax = Integer.MIN_VALUE;

        while (start < arr.length-1) {
            wEnd = start+1;
            windowMax=arr[wEnd];
            while (wEnd <= arr.length-2) {
                windowMax = Math.max(arr[wEnd+1], windowMax);
                wEnd++;
            }

            arr[start++] = windowMax;
        }

        arr[arr.length-1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        int[] elements = replaceElements(new int[]{57010,40840,69871,14425,70605});
        for (int element : elements) {
            System.out.print(element + " ");
        }


    }
}
