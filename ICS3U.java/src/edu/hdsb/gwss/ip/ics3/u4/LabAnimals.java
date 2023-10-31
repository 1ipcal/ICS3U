/*
 * Name: Calvin Ip
 * Date: November 3, 2019
 * Version: 1.0
 * Description: This program will print out a table and tells the user how long will the animals
 * `            last with x amount of food 
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class LabAnimals {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        int startPopulation = 0, foodAtStart = 0, foodAddEachHour = 0, endPopulation = 0, foodAtEnd = 0;
        int hour = 1;

        //Splash Screen
        System.out.println("Lab Animals\n");
        System.out.println("At present there are X animals in the lab and enough food for Y animals.  At the end of every hour");
        System.out.println("the population doubles, and enough food is added to support Z more animals. During any hour the");
        System.out.println("animals will eat enough food for only themselves. The program will determine when the population");
        System.out.println("will outgrow the food supply.\n");

        //Input
        do {
            System.out.println("Please Enter the Initial Population");
            startPopulation = input.nextInt();

            if (startPopulation < 1) {
                System.out.println("INVAID YEARLY INITIAL POPULATION, THERE NEEDS TO BE AT LEAST 1 ANIMAL");
            }
        } while (startPopulation < 1);

        do {
            System.out.println("Please Enter the Initial Food Supply");
            foodAtStart = input.nextInt();

            if (foodAtStart < 0) {
                System.out.println("INVAID INITIAL FOOD SUPPLY, TRY AGAIN");
            }
        } while (foodAtStart < 0);

        do {
            System.out.println("Please Enter the Food Added Each Hour");
            foodAddEachHour = input.nextInt();

            if (foodAddEachHour < 0) {
                System.out.println("INVAID NUMBER OF FOOD, TRY AGAIN");
            }
        } while (foodAddEachHour < 0);

        //Processing & Output
        System.out.format("%5s | %17s | %17s | %13s | %17s\n", "Hour", "Animals At Start", "Food At Start", "Food At End", "Animals At End");
        do {
            foodAtEnd = (foodAtStart + foodAddEachHour) - startPopulation;
            endPopulation = startPopulation * 2;

            System.out.format("%5s | %17s | %17s | %13s | %17s\n", hour, startPopulation, foodAtStart, foodAtEnd, endPopulation);

            startPopulation = endPopulation;
            foodAtStart = foodAtEnd;
            hour++;

        } while (startPopulation <= foodAtStart);

    }

}
