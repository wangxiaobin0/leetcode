package com.leetcode.hot;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @author
 * @date 2020/4/20
 */
public class LeetCode_53_MaxSubArray {

    public static int maxSubArray(int[] nums) {
        //最大和
        int max = nums[0];
        //当前最大和
        int curr = nums[0];


        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            //取最大值，防止当前最大和是负数
            curr = Math.max(curr + num, num);
            max = Math.max(curr, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(maxSubArray(nums));
    }
}
