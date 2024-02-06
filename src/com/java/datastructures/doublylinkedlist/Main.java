package com.java.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList(2);
        dll.addToListAtEnd(3);
        dll.addToListAtEnd(4);
        dll.addToListAtEnd(5);
        dll.addToListAtEnd(6);
        dll.addToListAtEnd(7);

        dll.printHeadValue();
        dll.printTailValue();
        dll.getLength();

        System.out.println("\nDoubly Linked List: ");
        dll.printList();

        /*
         * Scenario 1 : Swap First and Last Item in a Doubly Linked List
         *
         * */
        dll.swapFirstLast();

        dll.printHeadValue();
        dll.printTailValue();
        dll.getLength();

        System.out.println("\nDoubly Linked List: ");
        dll.printList();

        dll.reverseList();

        dll.printHeadValue();
        dll.printTailValue();
        dll.getLength();

        System.out.println("\nDoubly Linked List: ");
        dll.printList();


    }
}
