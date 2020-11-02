package com.utils.linkedlist.customlinkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //insert at end
        System.out.println("Insertin data at the end");
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(19);
        //display the contents
        linkedList.show();

        ////insert at start
        System.out.println("Inserting data at the start");
        linkedList.insertAtStart(18);
        //display the contents
        linkedList.show();

        //insert at specific index
        System.out.println("Inserting data at a specific index");
        linkedList.insertAt(2,85);
        //display the contents
        linkedList.show();

    }

}
