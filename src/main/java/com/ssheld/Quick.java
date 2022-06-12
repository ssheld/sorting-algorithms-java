package com.ssheld;

public class Quick {

    private static final int CUTOFF = 20;

    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length-1);
    }

    public static void sort(Comparable[] arr, int left, int right) {
        if (left + CUTOFF <= right) {
            Comparable pivot = medianOfThree(arr, left, right);

            // Start partitioning
            int i = left;
            int j = right-1;

            for (;;) {
                // Keep going right while arr[i] < arr[pivot]
                while(arr[++i].compareTo(pivot) < 0) {}
                // Keep going left while arr[j] is greater than pivot
                while(arr[--j].compareTo(pivot) > 0) {}

                // If j < i then we found a value larger than pivot, so swap
                if (i < j) {
                    SortingUtils.swap(arr, i, j);
                } else {
                    // Otherwise break;
                    break;
                }
            }

            // Restore the pivot
            SortingUtils.swap(arr, i, right-1);
            // Sort small elements
            sort(arr, left, i-1);
            // Sort large elements
            sort(arr, i+1, right);
        } else {
            insertionSort(arr, left, right);
        }
    }

    // Retrieve median of three
    public static Comparable medianOfThree(Comparable[] arr, int left, int right) {

        int mid = (left + right)/2;

        // Check if mid is less than left, if so then swap
        if (arr[mid].compareTo(arr[left]) < 0) {
            SortingUtils.swap(arr, mid, left);
        }
        // Check if right is less than left, if so then swap
        if (arr[right].compareTo(arr[left]) < 0) {
            SortingUtils.swap(arr, left, right);
        }
        // Check if right is greater than mid, if so then swap
        if (arr[right].compareTo(arr[mid]) < 0) {
            SortingUtils.swap(arr, mid, right);
        }

        // Place pivot at position right - 1
        SortingUtils.swap(arr, mid, right-1);

        return arr[right-1];
    }

    // insertion sort for small partition cases
    private static void insertionSort(Comparable[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            for (int j = i; j > 0 && SortingUtils.less(arr[j], arr[j-1]); j--) {
                SortingUtils.swap(arr, j, j-1);
            }
        }
    }
}
