package com.java.datastructures.hashMap;

/*
* Write a function itemInCommon(array1, array2) that takes two arrays as input
* and returns true if there is at least one common item between the two lists,
* false otherwise.
*
* */

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
    }

    public static boolean itemInCommon(int[] array1, int[]array2){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i : array1) {
            hm.put(i, true);
        }
        for (int j: array2){
            if (hm.containsKey(j)) return true;
        }
        return false;
    }
}
