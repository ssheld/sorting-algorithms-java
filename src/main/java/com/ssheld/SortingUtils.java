package com.ssheld;

public class SortingUtils {

    // Method to compare two Comparable objects
    protected static boolean less(Comparable v, Comparable w) {
        if (v.compareTo(w) < 0) {
            return true;
        }
        return false;
    }

    // Method to swap two objects in an array
    protected static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Checks to see if array is sorted
    public static boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i-1])) {
                return false;
            }
        }
        return true;
    }
}
