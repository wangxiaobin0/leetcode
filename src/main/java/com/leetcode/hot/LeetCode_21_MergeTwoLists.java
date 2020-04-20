package com.leetcode.hot;

/**
 * 21. 合并两个有序链表
 * @author
 * @date 2020/4/20
 */
public class LeetCode_21_MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //每次移动的节点
        ListNode node = new ListNode(-1);
        //next等于头结点
        ListNode prev = node;

        //都不为null，才需要做比较
        while (l1 != null && l2 != null) {
            int m = l1.val;
            int n = l2.val;
            if (m < n) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        //node.next = 不为null的节点，后面的节点不用再遍历了
        node.next = l1 == null ? l2 : l1;

        return prev.next;
    }
}
