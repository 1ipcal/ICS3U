/*
 * Name: Calvin Ip
 * Date: January 6, 2020
 * Version: 1.0
 * Description: This program will selection sort random integers between 1-1000
 */
package edu.hdsb.gwss.ip.ics3.u7;

public class SelectionSort {

    public static void main(String[] args) {
        //Variables
        int[] storage = new int[10];
        int[] comparisonCounter = new int[1];
        int[] swapsCounter = new int[1];

        //Splash Screen
        displaySplashScreen();

        //Input
        generateRandomNumbers(storage);

        //Processing and Output
        displayInitialNumbers(storage);
        selectionSort(storage, comparisonCounter, swapsCounter);
        displaySortedNumbers(storage);
        displayCounters(comparisonCounter, swapsCounter);
    }

    public static void displaySplashScreen() {
        System.out.println("SELECTION SORT\n");
        System.out.println("This program will selection sort random integers between 1-1000\n");
    }

    public static void generateRandomNumbers(int storage[]) {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = (int) (Math.random() * 1000) + 1;
        }
    }

    public static void displayInitialNumbers(int storage[]) {
        System.out.println("BEFORE:");
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    public static void selectionSort(int storage[], int comparisonCounter[], int swapsCounter[]) {
        for (int pass = 0; pass < storage.length - 1; pass++) {
            int maxLoc = 0;

            for (int i = 1; i < storage.length-pass; i++) {
                if (storage[maxLoc] < storage[i]) {
                    maxLoc = i;
                }
                comparisonCounter[0] = comparisonCounter[0] + 1;
            }
            swapNumbers(storage, maxLoc, storage.length - 1 - pass, swapsCounter);
        }
    }

    public static void swapNumbers(int storage[], int loc1, int loc2, int swapsCounter[]) {
        int temp = storage[loc1];
        storage[loc1] = storage[loc2];
        storage[loc2] = temp;
        
        swapsCounter[0] = swapsCounter[0] + 1;
    }

    public static void displaySortedNumbers(int storage[]) {
        System.out.println("\nAFTER:");
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }
    
    public static void displayCounters(int comparisonCounter[], int swapsCounter[]){
        System.out.println("\nComparisons: " + comparisonCounter[0]);
        System.out.println("Swaps: " + swapsCounter[0]);
    }
}
