package com.utils.linkedlist.customlinkedlist;


/**
 * Custom LinkedList with basic operations.
 *
 */
public class LinkedList {

    Node head;

    /**
     * This method is used to insert the given element at the end
     *
     * @param data
     */
    public void insertAtEnd(int data) {
        //Create a new node
        Node node = new Node();
        node.data = data;
        node.next = null;

        //If no data in the LinkedList
        if(head == null){
            head = node;
        } else {
            //traverse to the end and insert the input data
            // Assign the temporary node to the the first node i.e the head
            Node tempNode = head;

            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            //Now we have reached to the end of the LinkedList
            tempNode.next = node;
        }
    }

    /**
     * This method is used to insert the data at the beginning.
     *
     * @param data
     */
    public void insertAtStart(int data){
        //Create a new node
        Node node = new Node();
        node.data = data;
        node.next = null;

        //Make the new node to point to the existing head
        node.next = head;

        //Make the new node as head i.e. first element in the LinkedList
        head = node;
    }

    public void show() {
        // Assign the temporary node to the the first node i.e the head
        Node node = head;

        //Traverse from the first node i.e from Head node.
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
