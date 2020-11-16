package com.utils.tree;


/**
 * Binary Tree Traversal :
 *
 *  Input :
 *
 *                2
 *             /    \
 *           4        1
 *          /      /    \
 *         7      8      3
 *
 *
 * L -> Left
 * N -> Node
 * R -> Right
 *
 * InOrder      :   LNR     ->  7 4 2 8 1 3
 * PreOrder     :   NLR     ->  2 4 7 1 8 3
 * PostOrder    :   LRN     ->  7 4 8 3 1 2
 *
 */

import java.util.Scanner;

public class TreeTraversal {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }

    static Node createTree() {

        Node root = null;
        System.out.println("Enter root data: ");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for "+ data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
