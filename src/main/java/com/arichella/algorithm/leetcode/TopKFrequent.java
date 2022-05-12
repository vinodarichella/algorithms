package com.arichella.algorithm.leetcode;

import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Integer key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) heap.poll();
        }

        int[] topK = new int[k];
        for (int i = k-1; i >=0 ; i--) {
            topK[i] = heap.poll();
        }
        return topK;
    }

    public static void main(String[] args) {
        int[] topKFrequent = topKFrequent(new int[]{1}, 1);
        for (int i : topKFrequent) {
            System.out.print(i + " ");
        }

    }
}
