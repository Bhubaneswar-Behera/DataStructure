package com.utils.linkedlist.customlinkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //insert at end
        System.out.println("Inserting data at the end");
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(12);
        linkedList.insertAtEnd(19);
        //display the contents
        linkedList.show();
        System.out.println("\n");

        ////insert at start
        System.out.println("Inserting data at the start");
        linkedList.insertAtStart(18);
        //display the contents
        linkedList.show();
        System.out.println("\n");

        //insert at specific index
        int insertedIndex = 2;
        linkedList.insertAt(2,85);
        System.out.println("Inserting data at a specific index at : " + insertedIndex);
        //display the contents
        linkedList.show();
        System.out.println("\n");

        //delete an element from a specific index
        int deletingIndex = 3;
        System.out.println("Deleting an index from a specific index from  : "+deletingIndex);
        linkedList.deleteAt(3);
        //display the contents
        linkedList.show();
    }
}
