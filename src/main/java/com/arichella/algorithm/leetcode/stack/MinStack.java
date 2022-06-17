package com.arichella.algorithm.leetcode.stack;

import java.util.Stack;

public class MinStack {

    Stack<int[]> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[] {val, val});
            return;
        }
        int min = Math.min(stack.peek()[1], val);
        stack.push(new int[] {val, min});
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
