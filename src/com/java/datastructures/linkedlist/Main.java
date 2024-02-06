package com.java.datastructures.linkedlist;

/*
*
* Implementations:
*
* findMiddleNode

*
* */

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.printList();
        System.out.println(linkedList.findMiddleNode().value);
        linkedList.append(6);
        linkedList.printList();
        System.out.println(linkedList.findMiddleNode().value);
    }
}
