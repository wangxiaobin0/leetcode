package com.leetcode.hot;

import java.util.List;

/**
 * 206. 反转链表
 * @author
 * @date 2020/4/20
 */
public class LeetCode_206_ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode temp = node;
            node = head;
            head = head.next;

            node.next = temp;
        }
        return node;
    }
}
