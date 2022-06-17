package com.arichella.algorithm.leetcode;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        if (height.length == 0 || height.length == 1) return height.length;

        int left =0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {2,1}));
    }
}
