package com.ssheld.SortingAlgorithms;

/**
 * Author: Stephen Sheldon 3/28/2019
 *
 * Merge Sort
 * Time Complexity:
 * Best Case: O(nlogn)
 * Worst Case: O(nlogn)
 *
 * Space Complexity:
 * Worst Case: O(n) - If using an auxiliary array
 */

public class MergeSort {

    public static void sort(Comparable[] arr) {
        Comparable[] aux = new Comparable[arr.length];
        sort(arr, aux, 0, arr.length-1);

    }

    public static void sort(Comparable[] arr, Comparable[] aux, int lo, int hi) {
        // Size of array is now 0 so we've reached our base case
        if (lo >= hi) {
            return;
        }
        // Find the mid point
        int mid = lo + (hi-lo)/2;

        sort(arr, aux, lo, mid);
        sort(arr, aux, mid+1, hi);
        merge(arr, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi) {

        // Copy over to our aux array
        for (int i = lo; i <= hi; i++) {
            aux[i] = arr[i];
        }

        int j = lo;
        int k = mid+1;
        for (int i = lo; i <= hi; i++) {
            if (j > mid) {
                arr[i] = aux[k];
                k++;
            }
            else if (k > hi) {
                arr[i] = aux[j];
                j++;
            }
            else if (less(aux[k], aux[j])) {
                arr[i] = aux[k];
                k++;
            }
            else {
                arr[i] = aux[j];
                j++;
            }
        }
    }

    private static boolean less(Comparable i, Comparable j) {
        return i.compareTo(j) < 0;
    }
}
