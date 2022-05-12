package com.arichella.algorithm.leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] ints = {0, 0, 1, 1, 1, 2, 2};
        int ctr = removeDups(ints);
        for (int i=0; i < ctr; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    private static int removeDups(int[] dups) {
        int j=0;
        for (int i=0; i < dups.length-1; i++) {
            if (dups[i] != dups[i+1]) {
                dups[j++] = dups[i];
            }
        }
        dups[j++] = dups[dups.length-1];
        return j;
    }
}
