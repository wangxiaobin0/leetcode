package com.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * @author
 * @date 2020/4/20
 */
public class LeetCode_1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        //key = 差，value = 下标
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //包含则命中，不包含则加入
            if (map.containsKey(num)) {
                res[0] = map.get(num);
                res[1] = i;
                return res;
            } else {
                map.put(target - num, i);
            }
        }
        return res;
    }
}
