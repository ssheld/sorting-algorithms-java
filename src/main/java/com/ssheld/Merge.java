package com.ssheld;

public class Merge {

    // Auxiliary array for mergesort
    private static Comparable[] aux;

    public static void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr, aux, 0, arr.length-1);
    }

    public static void sort(Comparable[] arr, Comparable[] aux, int lo, int hi) {
        // Base Case: Size of array is 0
        if (lo >= hi) {
            return;
        }

        // Find the midpoint
        int mid = lo + (hi-lo)/2;

        sort(arr, aux, lo, mid);
        sort(arr, aux, mid+1, hi);
        merge(arr, aux, lo, mid, hi);
    }

    // Merge helper method
    public static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi) {

        // Copy over to aux array
        for (int i = lo; i <= hi; i++) {
            aux[i] = arr[i];
        }

        // Pointer to low
        int j = lo;
        // Pointer to mid+1 (beginning of second half of array)
        int k = mid+1;

        for (int i = lo; i <= hi; i++) {
            if (j > mid) {
                // Case: We've already merged all items in the first half of the
                //       array (lo to mid) so merge in the upper half
                arr[i] = aux[k];
                k++;
            } else if (k > hi) {
                // Case: We've already merged all items in second half of the
                //       array (mid+1 to hi), so merge in the lower half
                arr[i] = aux[j];
                j++;
            } else if (SortingUtils.less(aux[j], aux[k])) {
                // Case: aux[j] < aux[k] so move aux[j] to arr[i]
                arr[i] = aux[j];
                j++;
            } else {
                // Case: aux[k] < aux[j[ to move aux[k] to arr[i]
                arr[i] = aux[k];
                k++;
            }
        }
    }
}
