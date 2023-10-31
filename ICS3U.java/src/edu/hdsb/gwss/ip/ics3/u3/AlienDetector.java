/*
 * Name: Calvin Ip
 * Date: October 7, 2019
 * Version: 0.1
 * Description:
 */
package edu.hdsb.gwss.ip.ics3.u3;

import java.util.Scanner;

public class AlienDetector {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        int antenna, eye;
        boolean found = false;

        //Splash Screen
        System.out.println("Hello Citizen. Report on what alien you saw and we will give\n");

        //Input
        System.out.println("How many Antenna does it have");
        antenna = input.nextInt();
        System.out.println("How many Eyes does it have");
        eye = input.nextInt();

        //Proccessing & Output
        
        if (antenna >= 3 && eye <= 4) {
            found = true;
            System.out.println("The Alien is a ChoMartian");
        }
        if (antenna <= 6 && eye >= 2) {
            found = true;
            System.out.println("The Alien is a SandersonSaturnian");
        }
        if (antenna <= 2 && eye <= 3) {
            found = true;
            System.out.println("The Alien is a SamuelsMercurian");
        }
        if( !found ) {
            System.out.println("UNKNOWN ALIEN! Becareful!");
        }
        

    }
}


