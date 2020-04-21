package com.leetcode.hot;

import java.util.Stack;

/**
 * 234. 回文链表
 * @author
 * @date 2020/4/21
 */
public class LeetCode_234_IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (stack.size() > 1) {
            if (!stack.pop().equals(stack.remove(0))) {
                return false;
            }
        }
        return true;
    }
}
