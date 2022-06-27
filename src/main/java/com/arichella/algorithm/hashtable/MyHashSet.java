package com.arichella.algorithm.hashtable;

import java.util.LinkedList;

public class MyHashSet {

    MyBucket[] set;
    int keyRange = 769;

    public MyHashSet() {
        set = new MyBucket[keyRange];
        for (int i=0; i < keyRange; i++) {
            set[i] = new MyBucket();
        }
    }

    private int hash(int value) {
        return value % keyRange;
    }

    public void add(int key) {
        int index = hash(key);
        set[index].add(key);
    }

    public void remove(int key) {
        int index = hash(key);
        set[index].remove(key);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return set[index].contains(key);
    }

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));
    }
}

class MyBucket {
    LinkedList<Integer> container;

    public MyBucket() {
        container = new LinkedList<>();
    }

    public void add(Integer key) {
        if (container.indexOf(key) == -1)
        container.addFirst(key);
    }

    public void remove(Integer key) {
        if (container.indexOf(key) != -1) {
            container.remove(key);
        }
    }

    public boolean contains(Integer key) {
        return (container.indexOf(key) != -1);
    }
}
