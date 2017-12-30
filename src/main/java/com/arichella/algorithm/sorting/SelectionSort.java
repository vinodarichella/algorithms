package com.arichella.algorithm.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {39,50,3,4,36,2,6,7,38,83,34,29,59,44};

        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        System.out.print("Array before sort: ");
        displayArry(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j=i+1; j<arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(min, i, arr);
        }

        System.out.print("Array after sort: ");
        displayArry(arr);
    }

    private static void swap(int min, int i, int[] arr) {
        System.out.println("Swapping " + arr[i] + " with " + arr[min]);
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    private static void displayArry(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
