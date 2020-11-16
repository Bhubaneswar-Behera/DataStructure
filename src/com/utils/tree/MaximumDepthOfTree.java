package com.utils.tree;

import java.util.Scanner;

public class MaximumDepthOfTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();

        System.out.println("Maximum depth of the root tree is : "+maxDepth(root));

    }

    public static int maxDepth(Node root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
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
}

