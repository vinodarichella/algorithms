package com.arichella.algorithm.leetcode.linkedlist;

public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next =evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        ListNode head = test;
        for (int i : new int[]{2,3,4,5}) {
            test.next = new ListNode(i);
            test = test.next;
        }
        ListNode node = oddEvenList(head);
        System.out.println(node);
    }
}
