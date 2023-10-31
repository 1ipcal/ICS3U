/*
 * Name: Calvin Ip
 * Date: November 7, 2019
 * Version: 0.1
 * Description: This program has the user enter a compass direction and then prints a message.
 */
package edu.hdsb.gwss.ip.ics3.u5;

import java.util.Scanner;

public class Compass {

    public static void main(String[] args) {
        //Object
        Scanner input = new Scanner(System.in);

        //Variables
        String conventionalBearing;
        String dir1 = "", dir2 = "";
        boolean valid;
        int degree;

        //Spash Screen
        System.out.println("COMPASS\n");
        System.out.println("Compass directions are written in the following form: S45W.  This indicates that");
        System.out.println("the direction is determined by facing SOUTH and then turning 45 degrees towards");
        System.out.println("the WEST. This program has the user enter a compass direction and then prints a message.");

        //Processing and Output
        do {

            valid = true;

            //Input
            System.out.println("Please Enter a Direction:");
            conventionalBearing = input.nextLine();

            switch (conventionalBearing.toLowerCase().charAt(0)) {
                case 'n':
                    dir1 = "NORTH";
                    break;
                case 's':
                    dir1 = "SOUTH";
                    break;
                default:
                    valid = false;
                    System.out.println("INVALID DIRECTION. FIRST LETTER MUST BE N (NORTH) OR S (SOUTH)");
            }

            switch (conventionalBearing.toLowerCase().charAt(conventionalBearing.length() - 1)) {
                case 'e':
                    dir2 = "EAST";
                    break;
                case 'w':
                    dir2 = "WEST";
                    break;
                default:
                    valid = false;
                    System.out.println("INVALID DIRECTION. FIRST LETTER MUST BE E (EAST) OR W (WEST)");
            }
            
            degree = Integer.parseInt( conventionalBearing.substring(1, conventionalBearing.length() - 1 ) );
            if (degree < 0 || degree > 45){
                valid = false;
                System.out.println("INVALID DEGREE. MUST BE BETWEEN 0 AND 45");
            }

            if (conventionalBearing.length() > 4 || conventionalBearing.length() < 3) {
                valid = false;
                System.out.println("INVALID FORMAT");
            } else if (degree == 0){
                System.out.println("Face " + dir1 + ". You do not have to turn");
            } else {
                if (valid) {
                    System.out.println("Start Facing " + dir1 + " Turn " + degree + " degrees towards the " + dir2 + ".");
                }
                
            }

        } while (!valid);

    }
}
