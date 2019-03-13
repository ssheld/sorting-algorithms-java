package com.ssheld.SortingAlgorithms;

import static com.ssheld.SortingAlgorithms.SortHelper.*;

/**
 * Author: Stephen Sheldon 3/13/2019
 *
 * Quick Sort
 * Time Complexity: O(nlogn)
 *
 * Note: Choosing a pivot for Quick Sort can be tricky depending on what we already
 *       know about the data we're sorting - is it random?
 */

public class QuickSort {

    public static void sort(Comparable[] arr, int start, int end) {

        int pivot;

        if (start < end) {
            pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    private static int partition(Comparable[] arr, int lo, int hi) {

        // Pivot is picked to be last index, not optimal but this will do for now.
        // Later a median-of-three approach should be implemented.
        Comparable pivot = arr[hi];
        int i, j;

        i = lo - 1;
        j = hi;

        // Scan left and Scan right, swap when necessary
        while (true) {
            while (less(arr[++i], pivot)) {
                if (i == hi)
                    break;
            }

            while (less(pivot, arr[--j])) {
                if (j == lo)
                    break;
            }
            if (i >= j)
                break;
            swap(arr, i, j);
        }
        
        swap(arr, i, hi);

        return i;
    }
}
