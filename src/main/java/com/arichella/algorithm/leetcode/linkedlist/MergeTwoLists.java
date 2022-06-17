package com.arichella.algorithm.leetcode.linkedlist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(1);
        ListNode first = dummy;

        while (list1 !=null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    first.next = list2;
                    list2 = list2.next;
                } else {
                    first.next = list1;
                    list1 = list1.next;
                }
            } else if (list1 != null) {
                first.next = list1;
                list1 = list1.next;
            } else {
                first.next = list2;
                list2 = list2.next;
            }
            first = first.next;
        }

        return dummy.next;
    }
}
