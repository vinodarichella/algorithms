package com.arichella.algorithm.leetcode.linkedlist;

public class InsertIntoCyclicList {

    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal, null);

        if (head == null || head.next == null) {
            if (head == null) {
                head = node;
            } else {
                head.next = node;
            }
            return head;
        }

        Node first = head;
        Node prev = null;

        while (true) {
            prev = first;
            first = first.next;

            if (first == head) {
                prev.next = node;
                node.next = head;
                break;
            }
        }

        return head;
    }

}
