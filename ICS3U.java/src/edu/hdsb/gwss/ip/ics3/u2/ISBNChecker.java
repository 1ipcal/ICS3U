/*
 * Name: Calvin Ip
 * Date: Sept. 27, 2019
 * Version: 0.1
 * Description: 
 * 
 */
package edu.hdsb.gwss.ip.ics3.u2;

import java.util.Scanner;

public class ISBNChecker {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Constant
        final int SUMTEN;
        String OneToTen = "9780921418";

        //Variables
        int digit11, digit12, digit13, finalDigit;

        //Splash Screen
        System.out.println("This program will computer the 1-3 sum of a 13 digit number\n");
        System.out.println("The number will be 9780921418***\n");
        System.out.println("Please help use finish the number\n\n");

        //Input
        System.out.println("Please enter the 11th digit:");
        digit11 = input.nextInt();
        System.out.println("Please enter the 12th digit:");
        digit12 = input.nextInt();
        System.out.println("Please ender the 13th digit:");
        digit13 = input.nextInt();

        //Processing
        SUMTEN = 9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3 + 9 * 1 + 4 * 3 + 8 * 1;
        finalDigit = SUMTEN + digit11 * 3 + digit12 * 1 + digit13 * 3;
        
        //Output
        System.out.println("The 1-3 sum of " + OneToTen + digit11 + digit12 + digit13 + " is " + finalDigit);
        
    }

}
