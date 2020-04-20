package com.leetcode.hot;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * @author
 * @date 2020/4/20
 */
public class LeetCode_70_ClaimStairs {

    public static int claimStairs(int n) {
        if (n < 3) {
            return n;
        }
        int x = 1;
        int y = 2;

        for (int i = 0; i < n; i++) {
            int temp = y;
            y += x;
            x = temp;
            System.out.print(y + " ");
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(claimStairs(10));
    }
}
