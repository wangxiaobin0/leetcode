package com.leetcode.hot;

/**
 * 160. 相交链表
 * @author
 * @date 2020/4/20
 */
public class LeetCode_160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            //两个链表相连，如果相同有相同节点，那么一定会相等
            // 1->2->3->4->5 -> 0->3->4->5
            // 0->3->4->5 -> 1->2->3->4->5
            nodeA = nodeA.next == null ? headB : nodeA.next;
            nodeB = nodeB.next == null ? headA : nodeB.next;
        }
        return nodeA;
    }
}
