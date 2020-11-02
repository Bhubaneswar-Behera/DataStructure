package com.utils.linkedlist.customlinkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //insert at end
        System.out.println("Starting data at the end");
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(19);
        //display the contents
        linkedList.show();

        ////insert at start
        System.out.println("Starting data at the start");
       linkedList.insertAtStart(18);
        //display the contents
        linkedList.show();
    }

}
