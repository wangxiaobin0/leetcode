package com.leetcode.hot;

/**
 * 121. 买卖股票的最佳时机
 * @author
 * @date 2020/4/20
 */
public class LeetCode_121_MaxProfit {
    public static int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            //价格低时买入
            if (price < low) {
                low = price;
            } else {
                //高于购买价时，计算最大收益
                max = Math.max(max, price - low);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7 ,5, 6 , 4, 3};
        System.out.println(maxProfit(prices));
    }
}
