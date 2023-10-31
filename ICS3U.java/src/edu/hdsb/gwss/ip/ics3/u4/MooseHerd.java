/*
 * Name: Calvin Ip
 * Date: October 25, 2019
 * Version: 0.1
 * Description: this program will print moose pop every year and say when we need to supervise them until
 *           
 */
package edu.hdsb.gwss.ip.ics3.u4;

public class MooseHerd {

    public static void main(String[] args) {
        //Objects

        //Variables
        int year = 0, yearSupervise = 0;
        double numberOfMoose;

        //Splash Screen
        System.out.println("A breeding group of 20 moose is released in a protected area in Ontario.");
        System.out.println("This program will print out the estimated population of moose in 25 years");
        System.out.println("and print out how many years we need to supervise them");

        //Processing and Output
        for (double multiplier = 1; year <= 25; year = year + 1, multiplier = multiplier * 0.83) {
            numberOfMoose = 220 / (1 + (10 * multiplier));
            System.out.format("%5s %5s %10s %5s\n", "Year", year, "Mooses", (int) numberOfMoose);

            if (numberOfMoose <= 80) {
                yearSupervise = year;
            }
        }
        System.out.println("We Need to Supervise The Moose Until Year " + yearSupervise);

    }

}
