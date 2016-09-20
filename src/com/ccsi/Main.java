package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    TreeNode root=buildTree();
        System.out.println(maxDepth(root));
    }
    //Given a binary tree,find its maximum depth.
    //The maximum depth is the  number of nodes along the longest path from the root node down to farthest leaf node.
    public static int maxDepth(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static TreeNode buildTree(){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        root.right.right.right=new TreeNode(8);
        return root;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
