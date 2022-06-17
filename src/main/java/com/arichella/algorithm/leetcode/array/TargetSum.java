package com.arichella.algorithm.leetcode.array;

import java.util.Arrays;
import java.util.Objects;

public class TargetSum {

    int a;
    int b;

    public static int findTargetSumWays(int[] nums, int S) {
        int total = Arrays.stream(nums).sum();
        int[] dp = new int[2 * total + 1];
        dp[nums[0] + total] = 1;
        dp[-nums[0] + total] += 1;

        for (int i = 1; i < nums.length; i++) {
            int[] next = new int[2 * total + 1];
            for (int sum = -total; sum <= total; sum++) {
                if (dp[sum + total] > 0) {
                    next[sum + nums[i] + total] += dp[sum + total];
                    next[sum - nums[i] + total] += dp[sum + total];
                }
            }
            dp = next;
        }

        return Math.abs(S) > total ? 0 : dp[S + total];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[] {1,1,1,1,1}, 3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetSum targetSum = (TargetSum) o;
        return a == targetSum.a && b == targetSum.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
