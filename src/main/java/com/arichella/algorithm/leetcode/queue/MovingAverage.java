package com.arichella.algorithm.leetcode.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverage {

    Queue<Integer> queue;
    double sum;
    int size;

    public MovingAverage(int size) {
        queue = new ArrayDeque<>(size);
        sum = 0;
        this.size = size;
    }

    public double next(int val) {
        if (queue.size() == this.size) {
            Integer first = queue.poll();
            sum -= first;
        }

        queue.add(val);
        sum += val;

        return sum / queue.size();
    }
}
