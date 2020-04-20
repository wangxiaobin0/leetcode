package com.leetcode.hot;

/**
 * 104. 二叉树的最大深度
 * @author
 * @date 2020/4/20
 */
public class LeetCode_104_MaxDepth {
    public static int maxDepth(TreeNode root) {
        //结点为null，返回0
        if (root == null) {
            return 0;
        }
        //左子树的深度，不包含自己
        int left = maxDepth(root.left);
        //右子树的深度，不包含自己
        int right = maxDepth(root.right);
        //子树的最大深度 + 自身深度1
        return Math.max(left, right) + 1;
    }
}
