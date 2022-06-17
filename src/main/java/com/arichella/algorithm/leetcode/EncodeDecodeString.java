package com.arichella.algorithm.leetcode;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EncodeDecodeString {
    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str: strs){
            int length = str.length();
            encodedString.append(length+"#");
            encodedString.append(str);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList();
        for(int i =0;i<str.length();i++){
            String length = "";
            while(str.charAt(i) != '#'){
                length += str.charAt(i);
                i++;
            }
            int wordLength = Integer.parseInt(length);
            i++;

            String word = "";
            for(int j=i;j<wordLength+i;j++){
                word += str.charAt(j);
            }
            decodedStrings.add(word);
            i=i+wordLength-1;
        }
        return decodedStrings;
    }

    public static void main(String[] args) {
        int[] i = new int[] {1,2,3,4,5,6,7,8,9};
        Set<Integer> integers = Arrays.stream(i).boxed().collect(Collectors.toSet());
        integers.stream().forEach(System.out::println);
        String encode = encode(List.of("you", "love", "advit", "#"));
        System.out.println(encode);
        System.out.println(decode(encode));
    }
}
