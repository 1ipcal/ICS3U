/*
 * Name: Calvin Ip
 * Date: January 6, 2020
 * Version: 1.0
 * Description: This program will generate a number between 1-1000 and finds the inputed number using sequential search
 */
package edu.hdsb.gwss.ip.ics3.u7;

import java.util.Scanner;

public class SequentialSearch {

    public static void main(String[] args) {
        //Variables
        int storage[] = new int[10];
        int searchValue;

        //Splash Screen
        displaySplashScreen();

        //Input
        searchValue = getUserInput();

        //Processing and Output
        generateRandomNumbers(storage);
        displayRandomNumbers(storage);

        displayOutput(storage, searchValue);

    }

    public static void displaySplashScreen() {
        System.out.println("SEQUENTIAL SEARCH\n");
        System.out.println("This program will generate a number between 1-1000 and finds the inputed number using sequential search");
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value you are searching for");
        return input.nextInt();
    }

    public static void generateRandomNumbers(int storage[]) {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = (int) (Math.random() * 1000) + 1;
        }
    }

    public static void displayRandomNumbers(int storage[]) {
        System.out.println("DATA:");
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    public static int doSequentialSearch(int storage[], int searchValue) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static void displayOutput(int storage[], int searchValue) {
        int numberLocation = doSequentialSearch(storage, searchValue);

        if (numberLocation == -1) {
            System.out.println("There are no slots with the value of " + searchValue + " in the array of numbers");
        } else {
            System.out.println("The location of the number " + searchValue + " is at slot number " + (numberLocation + 1));
        }
    }

}
