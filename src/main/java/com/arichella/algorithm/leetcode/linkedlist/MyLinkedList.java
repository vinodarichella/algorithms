package com.arichella.algorithm.leetcode.linkedlist;

public class MyLinkedList {

    private int val;
    private MyLinkedList next;
    private MyLinkedList first;
    private MyLinkedList last;
    private int size = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        if (first == null || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        MyLinkedList curr = first;
        for (int i=0; i<index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        MyLinkedList obj = new MyLinkedList();
        obj.val = val;
        if (first == null) {
            first = obj;
            last = obj;
        } else {
            obj.next = first;
            first = obj;
        }
    }

    public void addAtTail(int val) {
        MyLinkedList obj = new MyLinkedList();
        obj.val = val;
        if (last == null) {
            first = obj;
            last = obj;
        } else {
            last.next = obj;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }


    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
