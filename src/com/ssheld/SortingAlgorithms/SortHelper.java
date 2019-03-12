package com.ssheld.SortingAlgorithms;

/**
 * Author: Stephen Sheldon 3/12/2019
 */

public class SortHelper {

    protected static void swap(Comparable[] arr, int i, int j) {
        Comparable T = arr[i];
        arr[i] = arr[j];
        arr[j] = T;
    }

    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void printArray(Comparable[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.printf("%n");
    }
}
