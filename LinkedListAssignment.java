package com.LinkedList;

import java.util.LinkedList;

/**
 * @ author Puja
 */
public class LinkedListAssignment <T>{
    static Node head;
    Node tail;
    static class Node<T>{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    /**
     * @param data  = Create new node for Appending data
     */

    public static void append(int data){
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        }
        else {

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }

    }

    /**
     * @param list = Create linked list for Appending nodes
     */
    public static void printList(LinkedListAssignment list) {
        if(list.head == null){
            System.out.println("LinkedList is empty");
        }
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    /**
     * Method used for inserting nodes in LinkedList
     */

    public void insert(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> temp, current;
            current = head;
            temp = head.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }


    /**
     * Welcome message for user
     * Method used for creating a new object of LinkListAssignment class
     * Method used for append nodes in LinkedList
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Assignment");
        LinkedListAssignment list = new LinkedListAssignment();// UC2


        list.append( 70);//UC3
        list.append(56);
        list.insert(30);//UC4

        printList(list);
    }
    }

