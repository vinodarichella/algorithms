package com.arichella.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMax {

    ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
    int [] nums;

    public void clean_deque(int i, int k) {
        // remove indexes of elements not from sliding window
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])                           deq.removeLast();
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0 || n == k) {
            return nums;
        }

        if (n < k) {
            return new int[0];
        }

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        int start = 0;
        for (int end = 0; end < n; end++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[end]) {
                deque.removeLast();
            }

            deque.add(end);
            if (start > deque.getFirst()) {
                deque.removeFirst();
            }

            if (end - start + 1 >= k) {
                result[start] = nums[deque.getFirst()];
                start++;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        SlidingWindowMax max = new SlidingWindowMax();
        int[] ints = max.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        for (int i : ints) {
            System.out.println(i);
        }

    }
}
