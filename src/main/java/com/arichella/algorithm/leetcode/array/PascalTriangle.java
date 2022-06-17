package com.arichella.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        if (numRows == 0) {
            return new ArrayList<>();
        }

        List<Integer> firstRow = Arrays.asList(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(firstRow);

        List<Integer> prev = firstRow;
        for (int row = 1; row < numRows; row++) {
            List<Integer> curr = new ArrayList<>();

            //add min
            curr.add(prev.get(0));

            // add middle
            for (int i=1; i < row; i++) {
                curr.add(prev.get(i-1)+prev.get(i));
            }


            //add end
            curr.add(1);
            result.add(curr);
            prev = curr;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
