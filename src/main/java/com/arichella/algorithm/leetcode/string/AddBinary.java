package com.arichella.algorithm.leetcode.string;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();

        if (n > m) return addBinary(b, a);

        StringBuilder sb = new StringBuilder();
        int j = n - 1;
        int carry = 0;

        for (int i=m-1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                ++carry;
            }
            if (j > -1 && b.charAt(j--) == '1') {
                ++carry;
            }

            if (carry % 2 == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }

            carry /= 2;
        }

        if (carry == 1) {
            sb.append('1');
        }
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
