package com.arichella.algorithm.leetcode.string;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {
    public static String reverseWords(String s) {
        int left = 0;
        int right = s.length()-1;
        new String(new char[] {'a'});
        while (s.charAt(left) == ' ' && left <= right) ++left;

        while (s.charAt(right) == ' ' && right >= left) --right;

        StringBuilder sb = new StringBuilder();
        Deque<String> deque = new ArrayDeque<>();

        while (left <= right) {
            if (s.charAt(left) == ' ') {
                deque.addFirst(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(s.charAt(left));
            }
            left++;
        }

        deque.addFirst(sb.toString());
        return String.join(" ", deque);
    }

    public static void main(String[] args) {
        String[] str = "hello world".trim().split("\\s+");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
