package com.arichella.algorithm.leetcode.linkedlist;


import java.util.HashSet;
import java.util.Set;

public class IntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodeHashtable = new HashSet<>();

        nodeHashtable.add(headA);
        nodeHashtable.add(headB);

        while (headA.next != null || headB.next != null) {
            if (headA.next != null) {
                if (nodeHashtable.contains(headA.next))
                    return headA.next;
                nodeHashtable.add(headA.next);
                headA = headA.next;
            }

            if (headB.next != null) {
                if (nodeHashtable.contains(headB.next))
                    return headB.next;
                nodeHashtable.add(headB.next);
                headB = headB.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
