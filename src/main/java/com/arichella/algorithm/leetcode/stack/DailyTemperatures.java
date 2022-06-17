package com.arichella.algorithm.leetcode.stack;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        final int m = temperatures.length;
        final int[] ans = new int[m];
        final Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
