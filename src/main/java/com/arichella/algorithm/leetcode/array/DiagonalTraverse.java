package com.arichella.algorithm.leetcode.array;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (index < m * n) {
            res[index++] = mat[i][j];
            if ((i + j) % 2 == 0) {
                if (j == n - 1) {
                    i++;
                } else if (i == 0) {
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) {
                    j++;
                } else if (j == 0) {
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i : findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})) {
            System.out.print(i + " ");
        }

    }
}
