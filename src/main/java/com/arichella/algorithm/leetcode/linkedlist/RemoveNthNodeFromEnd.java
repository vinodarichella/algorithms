package com.arichella.algorithm.leetcode.linkedlist;

public class RemoveNthNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        int l = 0;
        while (first != null) {
            l++;
            first = first.next;
        }

        l = l - n;
        first = head;

        while (l > 0) {
            l--;
            first = first.next;
        }

        first.next = first.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
