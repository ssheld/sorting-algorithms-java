package com.ssheld;

public class Selection {

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (SortingUtils.less(arr[j], arr[min])) {
                    min = j;
                }
            }
            SortingUtils.swap(arr, i, min);
        }
    }
}
