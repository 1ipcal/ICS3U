/*
 * Name: Calvin Ip
 * Date: December 4, 2019
 * Version: 1.0.2
 * Description: This program will display the word version of an inputed number from 1-999
 *              
 */
package edu.hdsb.gwss.ip.ics3.u6;

import java.util.Scanner;

public class NumbersToWords2 {

    //Global Variables
    public static int inputedNumber;
    public static int newNumber;
    public static String result = "";

    public static void main(String[] args) {
        //Splash Screen
        displaySplashScreen();
        
        //Input
        getNumber();

        //Processing and Output
        int n = inputedNumber;
        
        inputedNumber = inputedNumber / 1000;
        if( inputedNumber > 0 ) {
            threeDigit();
            System.out.print(" THOUSANDS ");
        }
        
        inputedNumber = n % 1000;
        if( inputedNumber > 0 ) {
            threeDigit();
        }

    }

    public static void displaySplashScreen() {
        System.out.println("Numbers To Words\n");
        System.out.println("This Program Will Convert any Number from 1 to 999 From its Digit Representation to its Word Representation.");

    }

    public static void getNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number from 1 to 999:\n");
        inputedNumber = input.nextInt();

    }
    
    public static void threeDigit() {
        //determines what methods should be called and in what order
        if (inputedNumber == 0) {
            result = "Zero";
        } else {

            if (inputedNumber > 99) {
                hundreds();
            }

            if (inputedNumber < 10) {
                newNumber = inputedNumber;
                ones();
            } else if (inputedNumber < 20) {
                newNumber = inputedNumber;
                teens();
            } else {
                newNumber = inputedNumber / 10;
                tens();
                System.out.print(" ");
                newNumber = inputedNumber % 10;
                ones();
            }
        }
        
    }

    public static void ones() {
        switch (newNumber) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            default:
                System.out.print("");
        }

    }

    public static void tens() {
        switch (newNumber) {
            case 2:
                System.out.print("Twenty");
                break;
            case 3:
                System.out.print("Thirty");
                break;
            case 4:
                System.out.print("Forty");
                break;
            case 5:
                System.out.print("Fifty");
                break;
            case 6:
                System.out.print("Sixty");
                break;
            case 7:
                System.out.print("Seventy");
                break;
            case 8:
                System.out.print("Eighty");
                break;
            case 9:
                System.out.print("Ninety");
                break;
            default:
                System.out.print("");
        }

    }

    public static void teens() {
        switch (newNumber) {
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            case 13:
                System.out.print("Thirteen");
                break;
            case 14:
                System.out.print("Fourteen");
                break;
            case 15:
                System.out.print("Fifteen");
                break;
            case 16:
                System.out.print("Sixteen");
                break;
            case 17:
                System.out.print("Seventeen");
                break;
            case 18:
                System.out.print("Eighte");
                break;
            case 19:
                System.out.print("Nineteen");
                break;
        }
    }

    public static void hundreds() {
        newNumber = inputedNumber / 100;
        ones();
        System.out.print(" Hundred ");
        inputedNumber = inputedNumber % 100;
    }
}
