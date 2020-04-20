package com.leetcode.hot;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author
 * @date 2020/4/20
 */
public class LeetCode_136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,3};
        System.out.println(singleNumber(nums));
    }
}
