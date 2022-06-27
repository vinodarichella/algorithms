package com.arichella.algorithm.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i=0; i< s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("sdfs", "rtww"));
    }
}
