package com.ssheld.SortingAlgorithms;


import static com.ssheld.SortingAlgorithms.SortHelper.less;
import static com.ssheld.SortingAlgorithms.SortHelper.swap;

/**
 * Author: Stephen Sheldon 3/12/2019
 *
 * Bubble Sort
 * Time Complexity: O(n^2)
 */

public class BubbleSort {
    public static void sort(Comparable[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (less(arr[j+1], arr[j]))
                    swap(arr, j+1, j);
            }
        }
    }
}
