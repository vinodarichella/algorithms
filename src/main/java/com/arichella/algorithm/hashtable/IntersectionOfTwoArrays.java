package com.arichella.algorithm.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums1) {
            first.add(num);
        }

        for (int num : nums2) {
            if (first.contains(num)) {
                result.add(num);
            }
        }

        return  result.stream().mapToInt(Integer::intValue).toArray();
    }
}
