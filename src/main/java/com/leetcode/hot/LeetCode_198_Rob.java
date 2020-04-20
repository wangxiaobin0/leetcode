package com.leetcode.hot;

/**
 * 198. 打家劫舍
 * @author
 * @date 2020/4/20
 */
public class LeetCode_198_Rob {

    public static int rob(int[] nums) {
        //前一个
        int curr = 0;
        //前前一个
        int prev = 0;
        for (int num : nums) {
            int temp = curr;
            curr = Math.max(curr, prev + num);
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
