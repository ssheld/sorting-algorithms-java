package com.ssheld.SortingAlgorithms;

import static com.ssheld.SortingAlgorithms.SortHelper.less;
import static com.ssheld.SortingAlgorithms.SortHelper.swap;

/**
 * Author: Stephen Sheldon 3/12/2019
 *
 * Selection Sort
 * Time Complexity: O(n^2)
 */

public class SelectionSort {

    public static void sort(Comparable[] arr) {

        int min;
        int i, j;

        for (i = 0; i < arr.length; i++) {
            min = i;
            for ( j = i+1; j < arr.length; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
}
