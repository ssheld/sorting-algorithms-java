package com.ssheld.SortingAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Author: Stephen Sheldon 3/3/2019
 * Insertion Sort Algorithm
 */

public class InsertionSort {

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        int j;

        for (int i = 1; i < n; i++) {
            // Check to see if value at j-1 is less than j if so then
            // commence swapping until it's not
            for (j = i; j > 0 && less(arr[j], arr[j-1]); j--) {
                exchange(arr, j, j-1);
            }
        }
    }

    private static void exchange(Comparable[] arr, int i, int j) {
        Comparable T = arr[i];
        arr[i] = arr[j];
        arr[j] = T;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void printArray(Comparable[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.printf("%n");
    }

    /* sortingtest.txt currently is only setup for sorting Strings.
    /* Layout for the sortingtest.txt file is:
    /* First Line: Number of strings to be scanned in.
    /* Second Line to n: Strings to be scanned in.
     */

    public static void main(String[] args) {
        Integer[] myArray = {1, 5, 4, 3, 2, 9, 44, -1, 3, 5, 5, 5, 3, 0};

        try {
            Scanner fin = new Scanner(new File("sortingtest.txt"));

            String dataType;
            int dataLen;

            String[] stringArray;

            while (fin.hasNextLine()) {
                dataLen = Integer.parseInt(fin.nextLine());

                stringArray = new String[dataLen];

                for (int i = 0; i < dataLen; i++) {
                    stringArray[i] = fin.nextLine();
                }

                sort(stringArray);

                printArray(stringArray);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("Sorry the file specified cannot be found");
        }
    }
}
