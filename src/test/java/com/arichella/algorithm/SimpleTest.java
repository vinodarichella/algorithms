package com.arichella.algorithm;

public class SimpleTest {
    public static int test() {
        int i = 1;
        try {
            return i;
        } finally {
            i = 2;
        }
    }
    public static void main(String[] args) {
        int i=-1;
        System.out.println(-(i));
        System.out.println(test());
    }
}
