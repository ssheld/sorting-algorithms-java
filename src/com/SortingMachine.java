package com;

import com.ssheld.SortingAlgorithms.InsertionSort;
import com.ssheld.SortingAlgorithms.BubbleSort;
import com.ssheld.SortingAlgorithms.SelectionSort;
import com.ssheld.SortingAlgorithms.SortHelper;
import com.ssheld.SortingAlgorithms.QuickSort;

import java.util.Scanner;

/**
 * Author: Stephen Sheldon 3/12/2019
 */

public class SortingMachine {


    public static void main(String[] args) {
        int typeChoice;
        int sortChoice;

        Integer[] numbers;
        String[] names;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Sorting Machine!");
        while (true) {

            numbers = new Integer[]{6, 3, -7, 3, 22, 55, 43, 0, 34, -2, 0, 42, 12, -2, 1, -11};
            names =  new String[]{
                    "James",
                    "Sally",
                    "Adam",
                    "Georgia",
                    "Larry",
                    "Bob",
                    "Amanda",
                    "Bobby",
                    "Tim",
                    "Xena",
                    "Ben"
            };

            System.out.println("Now tell me, what would you like to sort?");
            System.out.println("1. Integers");
            System.out.println("2. Names");
            System.out.println("0. Exit");
            typeChoice = scan.nextInt();

            // Break loop and exit program if user selects exit
            if (typeChoice == 0)
                break;

            System.out.println("Which sorting algorithm would you like to use?");
            System.out.println();
            System.out.println("1. Insertion Sort");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");

            sortChoice = scan.nextInt();

            if (typeChoice == 1) {
                System.out.println("Before sorting..");
                SortHelper.printArray(numbers);
                if (sortChoice == 1)
                    InsertionSort.sort(numbers);
                else if (sortChoice == 2)
                    BubbleSort.sort(numbers);
                else if (sortChoice == 3)
                    SelectionSort.sort(numbers);
                else if (sortChoice == 5)
                    QuickSort.sort(numbers, 0, numbers.length-1);

                System.out.println("After sorting..");
                SortHelper.printArray(numbers);
            }
            else if (typeChoice == 2) {
                System.out.println("Before sorting..");
                SortHelper.printArray(names);
                if (sortChoice == 1)
                    InsertionSort.sort(names);
                else if (sortChoice == 2)
                    BubbleSort.sort(names);
                else if (sortChoice == 3)
                    SelectionSort.sort(names);
                else if (sortChoice == 5)
                    QuickSort.sort(names, 0, names.length-1);

                System.out.println("After sorting..");
                SortHelper.printArray(names);
            }

        }




        System.exit(0);
    }
}
