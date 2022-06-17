package com.arichella.algorithm.leetcode.linkedlist;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(9);
        ListNode head = test;
        for (int i : new int[]{9,9,9,9,9,9}) {
            test.next = new ListNode(i);
            test = test.next;
        }
        //5,6,4
        test = new ListNode(9);
        ListNode head2 = test;
        for (int i : new int[]{9,9,9}) {
            test.next = new ListNode(i);
            test = test.next;
        }
        ListNode node = addTwoNumbers(head, head2);
        System.out.println(node);
    }
}
