package com.arichella.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> stringSet = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String localName = split[0];
            String a = localName.replace(".", "");
            if (a.contains("+")) {
                stringSet.add(a.substring(0, a.indexOf('+')) + "@" + split[1]);
            } else {
                stringSet.add(a + "@" + split[1]);
            }
        }
        return stringSet.size();
    }

    public static void main(String[] args) {
        String[] emails = new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        UniqueEmailAddresses u = new UniqueEmailAddresses();
        System.out.println(u.numUniqueEmails(emails));
    }
}
