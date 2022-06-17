package com.arichella.algorithm.leetcode.linkedlist;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {

    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
