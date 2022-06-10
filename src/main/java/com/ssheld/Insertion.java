package com.ssheld;

public class Insertion {

    public static void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && SortingUtils.less(arr[j], arr[j-1]); j--) {
                SortingUtils.swap(arr, j, j-1);
            }
        }
    }
}
