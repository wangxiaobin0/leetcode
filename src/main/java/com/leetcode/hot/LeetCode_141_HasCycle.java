package com.leetcode.hot;

/**
 * 141. 环形链表
 * @author
 * @date 2020/4/20
 */
public class LeetCode_141_HasCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        /*
                fast.next == null; 则fast是最后一个元素，循环结束
                fast.next.next == null; 则fast是倒数第二个元素，链表有边界，循环结束
         */
        while (fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
        }
        return false;
    }
}
