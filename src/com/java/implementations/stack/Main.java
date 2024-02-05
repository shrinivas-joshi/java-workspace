package com.java.implementations.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.printStackList();
        System.out.println(stack.peek());
        System.out.println("The item removed is -> "+stack.pop());
        stack.printStackList();



    }
}
