/*
 * Name: Calvin Ip
 * Date: December 19, 2019
 * Version: 1.0
 * Description: This program records the inputed temperature and finds the average
 *              
 */
package edu.hdsb.gwss.ip.ics3.u7;

import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureStats {

    public static void main(String[] args) {
        //Variables
        final String[] DAYS_OF_THE_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double maxTemperature[] = new double[7];

        //Splash Screen
        displaySplashScreen();

        //Input
        getUserInput(DAYS_OF_THE_WEEK, maxTemperature);

        //Processing and Output
        displayResult(DAYS_OF_THE_WEEK, maxTemperature, average(maxTemperature));

    }

    public static void displaySplashScreen() {
        System.out.println("TEMPERATURE STATS\n");
        System.out.println("This program will record a daily maximum temperature\n");
    }

    public static void getUserInput(String DAYS_OF_THE_WEEK[], double maxTemperature[]) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < DAYS_OF_THE_WEEK.length; i++) {
            System.out.println("Please Enter the Maximum Temperature for " + DAYS_OF_THE_WEEK[i] + ":");
            maxTemperature[i] = Double.parseDouble(input.nextLine());
        }
    }

    public static void displayResult(String DAYS_OF_THE_WEEK[], double maxTemperature[], double sum) {
        //Displays Arrays and Average
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMaximumFractionDigits(2);

        for (int i = 0; i < maxTemperature.length; i++) {
            System.out.println(DAYS_OF_THE_WEEK[i] + ": " + decimal.format(maxTemperature[i]));
        }

        System.out.println();
        System.out.println("Average: " + decimal.format(sum));

    }

    public static double average(double maxTemperature[]) {
        double sum = 0;

        for (int i = 0; i < maxTemperature.length; i++) {
            sum += maxTemperature[i];
        }
        return sum / maxTemperature.length;
    }

}
