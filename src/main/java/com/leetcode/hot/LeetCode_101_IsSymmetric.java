package com.leetcode.hot;

/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 * @author
 * @date 2020/4/20
 */
public class LeetCode_101_IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return process(root, root);
    }

    private boolean process(TreeNode node1, TreeNode node2) {
        //镜像节点都为null
        if (node1 == null && node2 == null) {
            return true;
        }
        //镜像节点只有一个是null
        if (node1 == null || node2 == null) {
            return false;
        }
        /*
            对称的条件：
                1.  镜像节点值相同
                2.  左树的左子节点与右树的右子节点对称
                3.  左树的右子节点与右树的左子节点对称
         */
        return (node1.val == node2.val) && process(node1.left, node2.right) && process(node1.right, node2.left);
    }
}
