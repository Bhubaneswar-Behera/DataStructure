package com.utils.binarysearchtree;


/**
 * Runner class for Binary Search Tree insertion
 *
 */
public class BSTInsertRunner {
    public static void main(String[] args) {
        BST bst = new BST();

        Node root = null;
        //8,3,6,10,4,7,1,14,16

        root = bst.insertElement(root,8);
        root = bst.insertElement(root,3);
        root = bst.insertElement(root,6);
        root = bst.insertElement(root,10);
        root = bst.insertElement(root,4);
        root = bst.insertElement(root,7);
        root = bst.insertElement(root,1);
        root = bst.insertElement(root,14);
        root = bst.insertElement(root,16);

        System.out.println("\n InOrder : ");
        bst.inOrder(root);
        System.out.println("\n PreOrder : ");
        bst.preOrder(root);
        System.out.println("\n PostOrder : ");
        bst.postOrder(root);

    }
}
