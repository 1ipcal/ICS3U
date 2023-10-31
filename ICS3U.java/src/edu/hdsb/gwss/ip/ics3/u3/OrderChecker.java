/*
 * Name: Calvin Ip
 * Date: October 4, 2019
 * Version: 0.1
 * Description: This program will asks the user for the number of bolts, nuts, 
 * and washers in their purchase and then calculates and prints out the total.
 * It will also tell the user if they inputed the wrong amount of nuts, bolts, and/or washers
 */
package edu.hdsb.gwss.ip.ics3.u3;

import java.text.NumberFormat;
import java.util.Scanner;

public class OrderChecker {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Variables
        int bolts, nuts, washers;
        double totalCost;

        //Constants
        final double BOLT_PRICE = 0.05;
        final double NUT_PRICE = 0.03;
        final double WASHER_PRICE = 0.01;

        //Splash Screen
        System.out.println("Bolts, Nuts, and Washer Buy Order\n");
        System.out.println("You need at least as many nuts as bolts");
        System.out.println("and at least twice as many washers as blots\n");

        //Input
        System.out.println("Please enter the amount of Bolts you are buying");
        bolts = input.nextInt();
        System.out.println("Please enter the amount of Nuts you are buying");
        nuts = input.nextInt();
        System.out.println("Please enter the amount of Washers you are buying");
        washers = input.nextInt();

        //Proccessing
        totalCost = (bolts * BOLT_PRICE) + (nuts * NUT_PRICE) + (washers * WASHER_PRICE);

        //Output 
        System.out.println("----------------------------------");
        System.out.format("%20s %5s\n", "Number of Bolts:", bolts);
        System.out.format("%20s %5s\n", "Number of Nuts:", nuts);
        System.out.format("%20s %5s\n\n", "Number of Washers:", washers);
        
        if (nuts < bolts) {
            System.out.println("Check the Order: Too few Nuts");
        }

        if (washers < bolts * 2) {
            System.out.println("Check the Order: Too few Washers\n");
        }

        System.out.format("%20s %5s\n", "Total Cost:", money.format(totalCost));
    }

}

