package org.example.trees;

public class MaximumDepthOfBinaryTree {


    public static void main(String[] args) {
        
        TreeNode treeNode = new TreeNode(1, new TreeNode(1), new TreeNode(1));
        System.out.println(maxDepth(treeNode));
        
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
