package com.arichella.algorithm.leetcode;

public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        boolean firstPart = false;

        StringBuilder subSb = new StringBuilder();
        for (int i=s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '-') continue;

            subSb.append(Character.isAlphabetic(c) ? Character.toUpperCase(c) : c);
            if (subSb.toString().length() == k) {
                sb.append(subSb);
                sb.append("-");
                subSb = new StringBuilder();
            }
        }

        sb.append(subSb);
        subSb = new StringBuilder();

        String s1 = sb.toString();
        if (s1.endsWith("-")) {
            s1 = s1.substring(0, s1.length()-1);
        }

        for (int i = s1.length()-1; i >= 0; i--) {
            subSb.append(s1.charAt(i));
        }

        return subSb.toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }
}
