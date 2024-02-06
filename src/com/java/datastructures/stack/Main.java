package com.java.datastructures.stack;


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

        System.out.println(reverseString("hello"));


    }

    public static String reverseString(String inputStr){
        char[] charArr = inputStr.toCharArray();
        Stack<Character> tempStack = new Stack<>();
        for (char c : charArr) {
            tempStack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<inputStr.length();i++){
            sb.append(tempStack.pop());
        }
        return sb.toString();
    }

}
