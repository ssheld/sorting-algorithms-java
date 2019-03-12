package com.ssheld.SortingAlgorithms;
import static com.ssheld.SortingAlgorithms.SortHelper.*;

/**
 * Author: Stephen Sheldon 3/3/2019
 *
 * Insertion Sort Algorithm
 * Time Complexity: O(n^2)
 */

public class InsertionSort {

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        int j;

        for (int i = 1; i < n; i++) {
            // Check to see if value at j-1 is less than j if so then
            // commence swapping until it's not
            for (j = i; j > 0 && less(arr[j], arr[j-1]); j--) {
                swap(arr, j, j-1);
            }
        }
    }
}
