package com.sevenliu.BinaryTree;

import org.junit.BeforeClass;

public class Test {

    static TreeRoot tree = null;
    static int[] arr = {10, 9, 20, 15, 35};

    @BeforeClass
    public static void prepareTree() {
        tree = BinaryTreeUtil.createTree(arr);
    }

    @org.junit.Test
    public void preTraverseTree() {
        TreeNode rootNode = tree.getRootNode();
        BinaryTreeUtil.preTraverseTree(rootNode);
    }

    @org.junit.Test
    public void middleTraverseTree() {
        TreeNode rootNode = tree.getRootNode();
        BinaryTreeUtil.middleTraverseTree(rootNode);
    }

    @org.junit.Test
    public void postTraverseTree() {
        TreeNode rootNode = tree.getRootNode();
        BinaryTreeUtil.postTraverseTree(rootNode);
    }

}
