/*
 * Name: Calvin Ip
 * Date: January 6, 2020
 * Version: 1.0
 * Description: This program will selection sort random integers between 1-1000
 * and use binary search to find the requested number
 */
package edu.hdsb.gwss.ip.ics3.u7;

public class BinarySearch {

    public static void main(String[] args) {
        //Variables
        int[] storage = new int[10];
        int[] comparisonCounter = new int[1];
        int[] swapsCounter = new int[1];

        //Splash Screen
        displaySplashScreen();

        //Selection Sort
        selectionSort(storage, comparisonCounter, swapsCounter);

        //Input
        int searchValue = SequentialSearch.getUserInput();

        //Binary Sort
//        binarySort(storage, searchValue);
        displayOutput(storage, searchValue);

    }

    public static void displaySplashScreen() {
        System.out.println("BINARY SEARCH\n");
        System.out.println("This program will generate random numbers between 1-1000, and selection sort. Then it will prompt the user to find a number using binary search\n");
    }

    public static void selectionSort(int storage[], int comparisonCounter[], int swapsCounter[]) {
        //Input
        SelectionSort.generateRandomNumbers(storage);

        //Processing and Output
        SelectionSort.displayInitialNumbers(storage);
        SelectionSort.selectionSort(storage, comparisonCounter, swapsCounter);
        SelectionSort.displaySortedNumbers(storage);
    }

    public static int binarySort(int storage[], int searchValue) {
        int left = 0;
        int right = storage.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (storage[mid] == searchValue) {
                return mid;
            } else if (searchValue < storage[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static void displayOutput(int storage[], int searchValue) {
        int numberLocation = binarySort(storage, searchValue);

        if (numberLocation == -1) {
            System.out.println("There are no slots with the value of " + searchValue + " in the array of numbers");
        } else {
            System.out.println("The location of the number " + searchValue + " is at slot number " + (numberLocation + 1));
        }
    }
}
