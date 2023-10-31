/*
 * Name: Calvin Ip
 * Date: October 16, 2019
 * Version: 1.0
 * Description: This program will tell the user if the  
 *              inputed year is a leap year or not.
 */
package edu.hdsb.gwss.ip.ics3.u3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        int year, remainderWhenDividingBy4, remainderWhenDividingBy100, remainderWhenDividingBy400;

        //Splash Screen
        System.out.println("LEAP YEAR CALCULATOR\n");
        System.out.println("This Program Will Tell you if the Inputed");
        System.out.println("Year is a Leap Year or Not\n");

        //Input
        System.out.println("Please Enter a Year:");
        year = input.nextInt();

        //Proccessing & Output
        remainderWhenDividingBy4 = year % 4;
        remainderWhenDividingBy100 = year % 100;
        remainderWhenDividingBy400 = year % 400;

        if (year < 1752) {
            System.out.println("Sorry! Invalid Data. (The First Leap Year was in 1752)");
        } else if (remainderWhenDividingBy4 != 0) {
            System.out.println(year + " IS NOT a Leap Year");
        } else if (remainderWhenDividingBy100 != 0 || remainderWhenDividingBy400 == 0) {
            System.out.println(year + " IS a Leap Year");
        } else {
            System.out.println(year + " IS NOT a Leap Year");
        }

    }

}
