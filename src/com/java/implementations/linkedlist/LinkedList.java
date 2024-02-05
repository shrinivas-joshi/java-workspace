package com.java.implementations.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = tail = newNode;
        length++;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            if (temp.next != null){
                System.out.print(temp.value+" -> ");
            } else {
                System.out.println(temp.value+" -> null");
            }
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /*
     * Method: findMiddleNode()
     * It finds the middle node in the linked list using the Fast and Slow Pointer.
     * We have two pointers, one jumps through every node.
     * The other jumps every second node.
     * By the time, fast pointer reaches end of the list, slow pointer reaches the middle node
     * In case where we have even number of nodes, we get two middle nodes, the second one is
     *  selected as the middle node.
     *
     * */
    public Node findMiddleNode(){
        if (length < 3) return null;
        Node slowPointer = head;
        Node fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }


}
