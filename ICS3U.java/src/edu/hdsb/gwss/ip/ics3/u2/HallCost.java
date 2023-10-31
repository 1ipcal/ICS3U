/*
 * Name: Calvin Ip
 * Date: Sept. 25, 2019
 * Version: 0.3
 * Description: This program will asks the user for their name, number of
 * guests and cost per person to have dinner at the local banquet hall.
 */
package edu.hdsb.gwss.ip.ics3.u2;

import java.text.NumberFormat;
import java.util.Scanner;

public class HallCost {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //Splash Screen
        System.out.println("Welcome to my Banquet Hall rental\n");
        System.out.println("The Hall Rental costs $350 and it is $50 per person");

        //Constant
        final double RENT = 350;
        final double HST = 0.13;

        //Variables
        String name;
        double subtotal, guestCost, total, tax;
        int people;

        //Input
        System.out.println("Please tell me your name:");
        name = input.nextLine();
        System.out.println("Please tell me how many people are attending: ");
        people = input.nextInt();

        //Processing
        guestCost = people * 50;
        subtotal = 350 + (people * 50);
        tax = HST * subtotal;
        total = tax + subtotal;

        //Output
        System.out.println("----------Recipt----------\n");
        System.out.format("%5s %15s\n", "Name:", name);
        System.out.format("%15s %5s\n", "Number of Guests:", people);
        System.out.println("----------Cost------------\n");
        System.out.format("%11s %15s\n", "Rent:", money.format(RENT));
        System.out.format("%11s %15s\n", "Guest Cost:", money.format(guestCost));
        System.out.format("%11s %15s\n", "Subtotal:", money.format(subtotal));
        System.out.format("%11s %15s\n\n", "Tax:", money.format(tax));
        System.out.format("%11s %15s\n\n", "Total Cost:", money.format(total));
        System.out.println("--------------------------\n");
        System.out.println("Thank You, Come again!\n");

    }

}
