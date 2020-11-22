package com.utils.binarysearchtree;


/**
 * BST Operations :
 *
 * 1. Create and  Insert into Binary Search Tree
 * 2. Delete from Binary Search Tree
 * 3. Display the elements in InOder , PreOder and PostOrder way
 * 
 *
 */
public class BinarySearchTree {

    /**
     * This method is used to insert elements into the Binary Search Tree
     *
     * @param node
     * @param data
     * @return
     */
    public Node insertElement(Node node , int data){

        if(node == null){
            return createNode(data);
        }

        if(data < node.data){
            node.left = insertElement(node.left,data);
        } else if(data > node.data){
            node.right = insertElement(node.right,data);
        }
        return node;
    }

    /**
     * This method is used to create a node based on a given data
     *
     * @param data
     * @return
     */
    private Node createNode(int data){
        Node node = new  Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return node;
    }

    /**
     * This methods is used to display the elements of Binary Search Tree in InOder
     *
     * @param node
     */
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(" " + node.data);
        inOrder(node.right);
    }

    /**
     * This methods is used to display the elements of Binary Search Tree in PreOder
     *
     * @param node
     */
    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * This methods is used to display the elements of Binary Search Tree in PostOder
     *
     * @param node
     */
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.data);
    }
}
