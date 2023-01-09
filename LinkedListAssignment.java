package com.LinkedList;

import java.util.LinkedList;

/**
 * @ author Puja
 */

public class LinkedListAssignment {
    /**
     * Class used for declaring Variables
     */
    static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /**
     * @param list = Create linked list for adding nodes
     */
    public static LinkedListAssignment add(LinkedListAssignment list, int data){

        Node new_node = new Node(data);


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            new_node.next = head;
            head = new_node;
        }

        return list;
    }

    /**
     * Method used for Printing nodes in LinkedList
     */
    public static void printList(LinkedListAssignment list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    /**
     * Welcome message for user
     * Method used for adding elements in LinkedList
     */
    public static void main(String[] args){
        System.out.println("Welcome to Linked List Assignment");
        LinkedListAssignment list = new LinkedListAssignment();// UC2


        list = add(list, 70);//UC2
        list = add(list, 30);
        list = add(list, 56);

        printList(list);
    }
}

