package com.arichella.algorithm.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        int[] copy = Arrays.copyOf(nums1, m+n);
        for (int r=0; r< m+n;r++) {
            if (j >= n || (i<m && copy[i] < nums2[j])) {
                nums1[r] = copy[i++];
            } else {
                nums1[r] = nums2[j++];
            }
        }

    }

    public static void main(String[] args) {
        int[] m = new int[] {0};
        int[] n = new int[] {1};
        merge(m, 0, n, 1);

        for (int i : m) {
            System.out.print(i + " ");
        }

    }
}
