package com.java.implementations.stack;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList(){
        return stackList;
    }

    public void printStackList(){
        for (int i = stackList.size()-1 ;i >= 0;i--){
            System.out.print(stackList.get(i)+ " -> ");
        }
        System.out.println("null");
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    public int size() { return stackList.size(); };

    public T peek(){
        if (isEmpty()){
            return null;
        } else {
            return stackList.get(stackList.size()-1);
        }
    }

    public void push(T value){
        if (getStackList().isEmpty()){
            stackList.add(value);
        } else {
            stackList.add(stackList.size(),value);
        }
    }
    public T pop(){
        if (getStackList().isEmpty()){
            return null;
        } else {
            T element = stackList.get(stackList.size()-1);
            stackList.remove(element);
            return element;
        }
    }

}
