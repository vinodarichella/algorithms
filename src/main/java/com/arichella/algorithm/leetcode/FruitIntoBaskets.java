package com.arichella.algorithm.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class FruitIntoBaskets {
    public static int totalFruit(int[] fruits) {
        int totalCount = 0;

        Set<Integer> integerSet = Arrays.stream(fruits)
                .boxed()
                .collect(Collectors.toSet());

        if (integerSet.size() == 1 || integerSet.size() == 2) {
            return Arrays.stream(fruits)
                    .boxed()
                    .collect(Collectors.toList())
                    .size();
        }

        for (int i=0; i < fruits.length; i++) {
            int firstFruit = -1;
            int secondFruit = -1;

            int localCount = 0;

            for (int j=i; j < fruits.length; j++) {
                if (firstFruit == -1) {
                    firstFruit = fruits[j];
                    localCount++;
                } else if (secondFruit == -1 && fruits[j] != firstFruit) {
                    secondFruit = fruits[j];
                    localCount++;
                } else if (firstFruit == fruits[j] || fruits[j] == secondFruit) {
                    localCount++;
                } else {
                    break;
                }
            }

            if (localCount > totalCount) {
                totalCount = localCount;
            }
        }
        return totalCount;
    }

    public static int totalFruit2(int[] tree) {
        if (tree.length <= 1) {
            return tree.length;
        }

        int index = 1;
        int firstType = tree[0];

        while (index < tree.length && tree[index] == firstType) {
            index++;
        }

        // Handle case where there's only 1 tree type: {1,1,1}
        if (index == tree.length) {
            return tree.length;
        }

        int secondType = tree[index];
        int secondTypeIndex = index;
        int currentSum = index + 1;
        int finalSum = currentSum;
        index = secondTypeIndex;
        index++;

        while (index < tree.length) {
            int current = tree[index];
            if (current == secondType || current == firstType) {
                currentSum++;
                finalSum = Math.max(currentSum, finalSum);
                if (current == firstType) {
                    firstType = secondType;
                    secondTypeIndex = index;
                    secondType = current;
                }
            } else {
                secondType = tree[index];
                firstType = tree[index - 1];
                currentSum = index - secondTypeIndex + 1;
                secondTypeIndex = index;
            }
            index++;
        }
        return finalSum;
    }

    public static void main(String[] args) {
        System.out.println(totalFruit2(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}
