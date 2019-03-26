package com.sevenliu.BinaryTree;

public class BinaryTreeUtil {

    /**
     * �����������������������(binary search tree)
     *
     * @param root
     * @param value
     */
    private static void createTree(TreeRoot root, int value) {
        if (root.getRootNode() == null) {
            TreeNode node = new TreeNode(value);
            root = new TreeRoot();
            root.setRootNode(node);
        }

        TreeNode tempRoot = root.getRootNode();

        while (tempRoot != null) {
            if (tempRoot.getValue() > value) {
                if (tempRoot.getLeftNode() == null) {
                    tempRoot.setLeftNode(new TreeNode(value));
                    return;
                } else {
                    tempRoot = tempRoot.getLeftNode();
                    continue;
                }
            } else {
                if (tempRoot.getRightNode() == null) {
                    tempRoot.setRightNode(new TreeNode(value));
                    return;
                } else {
                    tempRoot = tempRoot.getRightNode();
                    continue;
                }
            }

        }

    }

    /**
     * �����������������������(binary search tree)
     *
     * @param arr
     * @return
     */
    public static TreeRoot createTree(int[] arr) {
        TreeRoot root = null;
        if (arr != null && arr.length > 0) {
            root = new TreeRoot();
            root.setRootNode(new TreeNode(arr[0]));
            for (int i = 1; i < arr.length; i++) {
                createTree(root, arr[i]);
            }
        }
        return root;
    }

    /**
     * ������� �������������ң�
     *
     * @param rootNode
     */
    public static void preTraverseTree(TreeNode rootNode) {
        if (rootNode != null) {
            System.out.println(rootNode.getValue());
            preTraverseTree(rootNode.getLeftNode());
            preTraverseTree(rootNode.getRightNode());
        }
    }

    /**
     * ������� ������������ң�
     *
     * @param rootNode
     */
    public static void middleTraverseTree(TreeNode rootNode) {
        if (rootNode != null) {
            middleTraverseTree(rootNode.getLeftNode());
            System.out.println(rootNode.getValue());
            middleTraverseTree(rootNode.getRightNode());
        }
    }

    /**
     * ������� �����������Ҹ���
     *
     * @param rootNode
     */
    public static void postTraverseTree(TreeNode rootNode) {
        if (rootNode != null) {
            postTraverseTree(rootNode.getLeftNode());
            postTraverseTree(rootNode.getRightNode());
            System.out.println(rootNode.getValue());
        }
    }
}
