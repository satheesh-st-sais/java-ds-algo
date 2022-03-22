package com.st.codecrack.ds;

public class BinaryTreeTraversal {
    public static void main(String[] args) {

        BTNode root = getRootOfTestBT();
        System.out.println("==== Pre-Order Traversal Start ====");
        preOrderTraversal(root);
        System.out.println("==== Pre-Order Traversal End ====");

        System.out.println("==== In-Order Traversal Start ====");
        inOrderTraversal(root);
        System.out.println("==== In-Order Traversal End ====");

        System.out.println("==== Post-Order Traversal Start ====");
        postOrderTraversal(root);
        System.out.println("==== Post-Order Traversal End ====");

    }

    private static BTNode getRootOfTestBT(){

        BTNode root = new BTNode("F");
        BTNode tempLeft = new BTNode("B");
        root.left = tempLeft;
        BTNode tempRight = new BTNode("G");
        root.right = tempRight;

        tempLeft.left = new BTNode("A");
        tempLeft.right = new BTNode("D");

        tempLeft.right.left = new BTNode("C");
        tempLeft.right.right = new BTNode("E");

        tempRight.right = new BTNode("I");
        tempRight.right.left = new BTNode("H");

        return root;
    }

    private static void preOrderTraversal(BTNode treeNode){
        //visit root node first, then left sub tree and then right
        //     1Root
        //    /
        //   /
        // 2L----->3Right
        if (null == treeNode) return;
        System.out.print(" "+treeNode.value+" ");
        preOrderTraversal(treeNode.left);
        preOrderTraversal(treeNode.right);
    }

    private static void inOrderTraversal(BTNode treeNode){
        // left subtree to be visited first , then root and then right sub-tree
        //    2Root
        //   /   \
        //  /     \
        // 1L      3Right
        if (null == treeNode) return;
        inOrderTraversal(treeNode.left);
        System.out.print(" "+treeNode.value+" ");
        inOrderTraversal(treeNode.right);

    }

    private  static  void postOrderTraversal (BTNode treeNode){
        // visit left sub tree first, then right sub-tree and then root
        //     3Root
        //      \
        //       \
        // 1L----->2Right
        if (null == treeNode) return;
        postOrderTraversal(treeNode.left);
        postOrderTraversal(treeNode.right);
        System.out.print(" "+treeNode.value+" ");

    }

    static class BTNode {
        String value;
        BTNode left;
        BTNode right;
        BTNode(String value){
            this.value =value;
            this.left = null;
            this.right = null;
        }
    }
}
