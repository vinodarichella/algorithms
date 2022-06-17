package com.arichella.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<nums.length;i++) {
            if (!numList.contains(i+1)) {
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {1,1}));
    }
}
