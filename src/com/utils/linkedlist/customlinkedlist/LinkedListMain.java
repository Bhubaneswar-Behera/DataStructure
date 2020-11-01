package com.utils.linkedlist.customlinkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //insert at end
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(19);
        linkedList.insertAtEnd(18);

        //display the contents
        linkedList.show();
    }

}
