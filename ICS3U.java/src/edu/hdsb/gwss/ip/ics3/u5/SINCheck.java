/*
 * Name: Calvin Ip
 * Date: November 7, 2019
 * Version: 0.1
 * Description: 
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.util.Scanner;

public class SINCheck {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        String sinNumber;
        int evenSum = 0, even, oddSum = 0, odd, sum, lastDigit;

        //Splash Screen
        System.out.println("SIN CHECKER\n");
        System.out.println("In Canada, each person is uniquely identified by the Government with a Social Insurance Number (SIN).");
        System.out.println("A Social Insurance Number consists of nine digits. The first eight numbers are assigned digits and the");
        System.out.println("the last number is a digit check. This program determines if the check digit for a SIN is correct. ");

        //Input
        do {
            System.out.println("Please Enter a Social Insurance Number");
            sinNumber = input.nextLine().replaceAll("\\s", "");

            if (sinNumber.length() != 9) {
                System.out.println("INVALID SIN NUMBER. MUST BE 9 NUMBERS");
            }
        } while (sinNumber.length() != 9);

        //Processing & Output
        for (int i = 0, evenNumbers = 1, e = 2; i < 4; i++, evenNumbers = evenNumbers + 2, e = e + 2) {
            even = Integer.parseInt(sinNumber.substring(evenNumbers, e));
            if (even * 2 > 9) {
                even = ((even * 2) % 10) + ((even * 2) / 10);
            } else {
                even = even * 2;
            }
            evenSum = evenSum + even;
        }

        for (int i = 0, oddNumbers = 0, o = 1; i < 4; i++, oddNumbers = oddNumbers + 2, o = o + 2) {
            odd = Integer.parseInt(sinNumber.substring(oddNumbers, o));
            oddSum += odd;
        }
        
        lastDigit = Integer.parseInt(sinNumber.substring(8,9));
        sum = evenSum + oddSum;
        
        if (Math.round(sum/10.0) * 10 - sum != lastDigit){
            System.out.println("This is not a Valid SIN number");
        } else {
            System.out.println("This is a Valid SIN number. Keep it safe to yourself and only yourself.");
        }

    }

}
