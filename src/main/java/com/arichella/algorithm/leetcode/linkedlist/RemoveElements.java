package com.arichella.algorithm.leetcode.linkedlist;

public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        ListNode head = test;
        for (int i : new int[]{2, 6, 3, 4, 5, 6}) {
            test.next = new ListNode(i);
            test = test.next;
        }
        ListNode node = removeElements(head, 6);
        System.out.println(node);
    }
}
