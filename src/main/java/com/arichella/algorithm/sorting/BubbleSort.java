package com.arichella.algorithm.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {39,50,3,4,36,2,6,7,38,83,34,29,59,44};

        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        System.out.print("Array before sort: ");
        displayArry(arr);

        for (int i = arr.length - 1; i > 1; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Array after sort: ");
        displayArry(arr);
    }

    private static void displayArry(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
