package com.arichella.algorithm.leetcode.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class FlattenMultilevelDoublyLinkedList {

    public Node flatten(Node head) {
        Node newHead = new Node();
        Node curr, prev = newHead;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null) stack.push(curr.next);
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
        }

        if (newHead.next != null) {
            newHead.next.prev = null;
        }
        return newHead.next;

    }
}
