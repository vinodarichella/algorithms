package com.arichella.algorithm.leetcode;

public class TrapRainWater {
    public static int trap(int[] height) {
        // time : O(n)
        // space : O(1)
        if (height.length==0) return 0;
        int left = 0, right = height.length-1;
        int leftMax=height[left], rightMax=height[right];
        int ans = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                ans += leftMax-height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax-height[right];
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,2,0,0,0,0,0,0,0,0,0,1}));
    }
}
