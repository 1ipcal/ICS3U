/*
 * Name: Calvin Ip
 * Date: October 2, 2019
 * Version: 0.1
 * Description: This program that asks for the amount of 
 * purchases, then calculates the discounted price.
 */
package edu.hdsb.gwss.ip.ics3.u3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Variables
        double purchaseAmount, price;

        //Constants
        final double DISCOUNT = 0.10;

        //Splash Screen
        System.out.println("Hello user, today we have a special sale!\n");
        System.out.println("If your purchace amount is over $10.00,\n\n");
        System.out.println("we will give you a %10 discount!");

        //Input
        System.out.println("How much is your purchase?");
        purchaseAmount = input.nextDouble();

        //Proccessing
        if (purchaseAmount > 10.00) {
            price = purchaseAmount * (1 - DISCOUNT);            
        }
        else {
            price = purchaseAmount;
        }

        //Output
        if (purchaseAmount > 10.00) {
            System.out.println("DISCOUNT PRICE " + money.format(price) );
        }
        else {
            System.out.println("REGULAR PRICE " + money.format(price) );
        }
        
    }

}
