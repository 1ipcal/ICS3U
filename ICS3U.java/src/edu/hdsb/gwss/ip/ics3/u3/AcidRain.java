/*
 * Name: Calvin Ip
 * Date: October 16, 2019
 * Version: 1.0
 * Description: This program will tell the user if the  
 *              lake's pH is safe for the fish or not
 */
package edu.hdsb.gwss.ip.ics3.u3;

import java.util.Scanner;

public class AcidRain {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        double pH;

        //Splash Screen
        System.out.println("pH Lake Checker\n");
        System.out.println("Acid Rain is an environmental problem.");
        System.out.println("This Program will Check if the pH");
        System.out.println("Level of the Lake is Safe for the Fish\n");

        //Input
        System.out.println("Please Enter The pH Level of The Lake:");
        pH = input.nextDouble();

        //Proccessing & Output
        if (pH < 0 || pH > 14) {
            System.out.println("Sorry! Invalid Data. (The pH Scale Ranges From 0 to 14)");
        } else if (pH < 4) {
            System.out.println("TOO UNLIKELY - CHECK INSTRUMENT.");
        } else if (pH < 6.45) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH <= 7.45) {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        } else if (pH < 10) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else {
            System.out.println("TOO UNLIKELY - CHECK INSTRUMENT.");
        }

    }

}
