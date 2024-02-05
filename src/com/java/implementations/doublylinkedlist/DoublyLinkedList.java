package com.java.implementations.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    class Node{
        Node next;
        Node previous;
        int value;

        public Node(int value) {
            this.value  = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = tail = newNode;
        length++;
    }

    public void printHeadValue(){
        if (head != null) {
            System.out.println("Head: " + head.value);
        }else {
            System.out.println("Head is null.");
        }
    }

    public void printTailValue(){
        if (head != null) {
            System.out.println("Tail: " + tail.value);
        }else {
            System.out.println("Tail is null.");
        }
    }

    public void getLength(){
        if (head != null) {
            System.out.println("Length: " + head.value);
        }else {
            System.out.println("List is empty.");
        }
    }

    public void addToListAtEnd(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            if (temp.next != null){
                System.out.print(temp.value+" <-> ");
            }else {
                System.out.println(temp.value+" <-> null\n");
            }
            temp = temp.next;
        }
    }

    /*
     * Scenario 1 : Swap First and Last Item in a Doubly Linked List
     *      => If the length of the list is less than 2 then we do not swap.
     * */
    public boolean swapFirstLast(){
        if (length < 2) return false;
        int tempValue = head.value;
        head.value = tail.value;
        tail.value = tempValue;
        return true;

    }

    /*
     * Scenario 2 : Reverse The DLL
     *
     * */
    public void reverseList(){
        if (length <= 1) {
            System.out.println("List has only item. Cannot be reversed.");
        } else{
            Node temp = tail;
            tail = head;
            head = temp;
            while (temp != null){
                temp.next = temp.previous;
                temp = temp.previous;
            }
        }
    }

    

}
