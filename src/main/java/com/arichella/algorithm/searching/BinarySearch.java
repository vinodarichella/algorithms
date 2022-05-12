package com.arichella.algorithm.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 5, 12, 48, 59, 68, 129, 149, 240, 259, 593};

        try {
            if (findElement(1, arr)) {
                System.out.println("Element Found");
            } else {
                System.out.println("Element Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean findElement(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int iterations = 0 ;
        while (true) {
            iterations++;
            int mid = (low + high) / 2;
            System.out.println("Mid element " + arr[mid]);
            if (arr[mid] == key) {
                System.out.println("Total # of iterations: " + iterations);
                return true;
            } else if (low > high) {
                System.out.println("Total # of iterations: " + iterations);
                return false;
            } else {
                if (arr[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
    }
}
