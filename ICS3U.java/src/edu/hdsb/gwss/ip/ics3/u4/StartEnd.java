/*
 * Name: Calvin Ip
 * Date: October 22, 2019
 * Version: 0.1
 * Description: This program will ask for start  
 *               and end variable and counts up or down 
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class StartEnd {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        int startValue, endValue, i = 1;

        //Splash Screen
        System.out.println("Hello User, You Will Input 2 Values and the");
        System.out.println("Program Will Count Up or Down\n");

        //Input
        System.out.println("Please Enter the Start Value");
        startValue = input.nextInt();
        System.out.println("Please Enter the End Value");
        endValue = input.nextInt();

        //Processing & Output
        if (startValue < endValue) {
            while (startValue <= endValue) {
                System.out.print(startValue + " ");
                startValue = startValue + i;
            }
        } else {
            while (startValue >= endValue) {
                System.out.print(startValue + " ");
                startValue = startValue - i;
            }
        }
        System.out.println("");
    }

}
