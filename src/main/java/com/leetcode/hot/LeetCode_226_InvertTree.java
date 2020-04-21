package com.leetcode.hot;

/**
 * 226. 翻转二叉树
 * @author
 * @date 2020/4/21
 */
public class LeetCode_226_InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
