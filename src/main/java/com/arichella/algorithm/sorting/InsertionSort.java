package com.arichella.algorithm.sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {39,50,3,4,36,2,6,7,38,83,34,29,59,44};

        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] arr) {
        int i,j;
        List<String> a = new ArrayList();
        for (i=1; i < arr.length; i++) {
            int temp = arr[i];
            j = i;

            while (j>0 && arr[j-1] >= temp) {
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = temp;
        }
    }
}
