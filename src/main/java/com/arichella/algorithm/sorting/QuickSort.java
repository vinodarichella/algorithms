package com.arichella.algorithm.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    public static void main(String[] args) {

        System.out.println(quicksort(Arrays.asList(39,50,3,4,36,2,6,7,38,83,34,29,59,44)));
    }

    private static List<Integer> quicksort(List<Integer> integerList) {

        if (integerList.size() < 2) {
            return integerList;
        }

        Integer pivot = integerList.get(0);
        List<Integer> lesser = integerList.stream().skip(1).filter(i -> i <= pivot).collect(Collectors.toList());
        List<Integer> greater = integerList.stream().skip(1).filter(i -> i > pivot).collect(Collectors.toList());

        return Stream.of(quicksort(lesser).stream(), Stream.of(pivot), quicksort(greater).stream())
                .flatMap(Function.identity())
                .collect(Collectors.toList());
    }
}
