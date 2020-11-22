package com.utils.binarysearchtree;


/**
 * Runner class for Binary Search Tree operations
 *
 *
 */
public class BinarySearchTreeRunner {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        Node root = null;
        //8,3,6,10,4,7,1,14,16

        root = binarySearchTree.insertElement(root,8);
        root = binarySearchTree.insertElement(root,3);
        root = binarySearchTree.insertElement(root,6);
        root = binarySearchTree.insertElement(root,10);
        root = binarySearchTree.insertElement(root,4);
        root = binarySearchTree.insertElement(root,7);
        root = binarySearchTree.insertElement(root,1);
        root = binarySearchTree.insertElement(root,14);
        root = binarySearchTree.insertElement(root,16);

        System.out.println("\n InOrder : ");
        binarySearchTree.inOrder(root);
        System.out.println("\n PreOrder : ");
        binarySearchTree.preOrder(root);
        System.out.println("\n PostOrder : ");
        binarySearchTree.postOrder(root);

    }
}
