/*
 * Name: Calvin Ip
 * Date: December 17, 2019
 * Version: 1.0
 * Description: This program records the scores for a round of 18 holes of golf
 *              
 */
package edu.hdsb.gwss.ip.ics3.u7;

import java.util.Scanner;

public class Golf {

    public static void main(String[] args) {
        //Variables
        int[] golfScores = new int[18];

        //Splash Screen
        displaySplashScreen();

        //Input
        getUserInput(golfScores);

        //Processing and Output
        displayScores(golfScores);
        displayMaxMinSum(maxValue(golfScores), minValue(golfScores), sum(golfScores));
    }

    public static void displaySplashScreen() {
        System.out.println("GOLF SCORES\n");
        System.out.println("This program records the scores for a round of 18 holes of golf\n");
    }

    public static void getUserInput(int golfScores[]) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < golfScores.length; i++) {
            System.out.println("Please Enter a Score for Hole # " + (i + 1) + ":");
            golfScores[i] = Integer.parseInt(input.nextLine());

        }
    }

    public static void displayScores(int golfScores[]) {
        for (int i = 0; i < golfScores.length; i++) {
            System.out.println("Hole " + (i + 1) + ": " + golfScores[i]);
        }
    }

    public static int maxValue(int golfScores[]) {
        int max = golfScores[0];
        for (int i = 1; i < golfScores.length; i++) {
            if (golfScores[i] > max) {
                max = golfScores[i];
            }
        }
        return max;
    }

    public static int minValue(int golfScores[]) {
        int min = golfScores[0];
        for (int i = 1; i < golfScores.length; i++) {
            if (golfScores[i] < min) {
                min = golfScores[i];
            }
        }
        return min;
    }

    public static int sum(int golfScores[]) {
        int sum = 0;
        for (int i = 0; i < golfScores.length; i++) {
            sum += golfScores[i];
        }
        return sum;
    }

    public static void displayMaxMinSum(int max, int min, int sum) {
        System.out.println();
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
        System.out.println("Total: " + sum);
    }

}
