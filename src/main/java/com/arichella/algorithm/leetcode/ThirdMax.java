package com.arichella.algorithm.leetcode;

import java.util.TreeSet;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
            if (treeSet.size() > 3) {
                treeSet.remove(treeSet.first());
            }
        }
        if (treeSet.size() == 3) {
            return treeSet.first();
        }
        return treeSet.last();
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] {12, 3, 8, 9, 12, 12, 7, 8, 12, 4, 3, 8, 1}));
    }
}
