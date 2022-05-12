package com.arichella.algorithm.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class OddEvenJumps {

    public static int oddEvenJumps(int[] arr) {
        int jumpsPossible= 1; // last index jump is always possible, as we can drectly jump to last element

        int len = arr.length;

        boolean[] isOddJumpPossible =  new boolean[len]; // is odd jump is possible at this index?
        boolean[] isEvenJumpPossible =  new boolean[len]; // is even jump is possible at this index?

        TreeMap<Integer, Integer> map = new TreeMap<>(); // value - index

        // last element is always possible jump
        isOddJumpPossible[len-1] = true;
        isEvenJumpPossible[len-1] = true;
        map.put(arr[len-1], len-1);


        for(int i = len - 2; i >= 0; i--) {

            Map.Entry<Integer, Integer> elementIfOddJump = map.ceilingEntry(arr[i]); //get next entry if odd jump is taken from current element.
            Map.Entry<Integer, Integer> elementIfEvenJump = map.floorEntry(arr[i]);  //get next entry if even jump is taken from current element.

            // if we can take odd jump from current index
            if(elementIfOddJump != null) {
                // check if next even jump is possible at next element's index, becuase current is odd jump
                isOddJumpPossible[i] = isEvenJumpPossible[elementIfOddJump.getValue()];
            }
            // if we can take even jump from current index
            if(elementIfEvenJump != null) {
                isEvenJumpPossible[i] = isOddJumpPossible[elementIfEvenJump.getValue()];
            }

            // if we consider this element at ith index as first jump, it's odd jump as it will be 1st jump
            if(isOddJumpPossible[i]) {
                jumpsPossible++;
            }

            map.put(arr[i], i);
        }

        return jumpsPossible;
    }

    public static void main(String[] args) {
        System.out.println(oddEvenJumps(new int[]{10,13,12,14,15}));
    }
}
