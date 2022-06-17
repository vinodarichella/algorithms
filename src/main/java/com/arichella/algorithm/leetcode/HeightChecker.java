package com.arichella.algorithm.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int arr[] = new int[101];
        Arrays.fill(arr,0);
        for(int h : heights)
            arr[h] =arr[h]+1;

        int expectedIndex = 0;
        int count=0;
        //will be in sorted order
        for(int i = 0; i < arr.length ; i++){
            while(arr[i]>=1){
                if(heights[expectedIndex]!=i)
                    count++;
                expectedIndex++;
                arr[i]--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[] {5,1,2,3,4}));
    }
}
