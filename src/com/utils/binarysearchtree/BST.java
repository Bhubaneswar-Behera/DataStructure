package com.utils.binarysearchtree;


/**
 * Class to create Binary Search Tree and display the elements in
 * InOder , PreOder and PostOrder way
 *
 */
public class BST {

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

    private Node createNode(int data){
        Node node = new  Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return node;
    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(" " + node.data);
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.data);
    }
}
