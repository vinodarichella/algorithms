package com.arichella.algorithm.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    ListNode front;

    public boolean checkRecursively(ListNode currentNode) {
        if (currentNode != null) {
            if (!checkRecursively(currentNode.next)) {
                return false;
            }
            if (currentNode.val != front.val) {
                return false;
            }
            front = front.next;
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {
        this.front = head;
        return checkRecursively(head);
    }

    public static void main(String[] args) {

    }
}
