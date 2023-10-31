  /*
 * Name: Calvin Ip
 * Date: January 6, 2020
 * Version: 1.0
 * Description: This program will bubble sort random integers between 1-1000
 */
package edu.hdsb.gwss.ip.ics3.u7;

public class BubbleSort {

    public static void main(String[] args) {
        //Variables
        int[] storage = new int[10];
        int[] comparisonCounter = new int [1];
        int[] swapsCounter = new int [1];

        //Splash Screen
        displaySplashScreen();

        //Input
//        checker
//        for(int i =0; i < storage.length; i++){
//            storage[i] = i;
//        }
        generateRandomNumbers(storage);

        //Processing and Output
        displayInitialNumbers(storage);
        bubbleSort(storage, comparisonCounter, swapsCounter);
        displayCounters(comparisonCounter, swapsCounter);
        bubbleSort(storage, comparisonCounter, swapsCounter);
        displaySortedNumbers(storage);
        displayCounters(comparisonCounter, swapsCounter);

    }

    public static void displaySplashScreen() {
        System.out.println("BUBBLE SORT\n");
        System.out.println("This program will bubble sort random integers between 1-1000\n");
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

    public static void bubbleSort(int storage[], int comparisonCounter[], int swapsCounter[]) {
        comparisonCounter[0] = 0;
        swapsCounter[0] = 0;
        
        boolean swapped = true;
        for (int pass = 0; pass < storage.length - 1 && swapped; pass++) {
            swapped = false;
            for (int i = 0; i < storage.length - 1 - pass; i++) {
                if (storage[i] > storage[i + 1]) {
                    swapped = true;
                    swapNumbers(storage, i, i + 1);
                    swapsCounter[0] = swapsCounter[0] + 1;
                }
                comparisonCounter[0] = comparisonCounter[0] + 1;
            }
        }
    }

    public static void swapNumbers(int storage[], int loc1, int loc2) {
        int temp = storage[loc1];
        storage[loc1] = storage[loc2];
        storage[loc2] = temp;
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
