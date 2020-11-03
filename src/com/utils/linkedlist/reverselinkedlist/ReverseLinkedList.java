package com.utils.linkedlist.reverselinkedlist;


/**
 * Reverse a singly linked list.
 *
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();

    }

    private static ListNode reverseList(ListNode head) {
        //head null then its already reversed
        if(head == null || head.next == null){
            return head;
        }
        //Create a node which is null
        ListNode previousNode = null;
        //Current node is head
        ListNode currentNode = head;

        //Traverse till current node is not null
        while (currentNode != null){
            //Move to the next node and assign to a temporary node
            ListNode tempNode = currentNode.next;

            //Move the previous node forward
            currentNode.next = previousNode;
            //move the previous node to the current node
            previousNode = currentNode;
            //current node is temprary node which is already moved one step ahead
            currentNode = tempNode;
        }
        return previousNode;

    }
}

