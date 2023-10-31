/*
 * Name: Calvin Ip
 * Date: October 24, 2019
 * Version: 0.1
 * Description: This program will ask for 3 side lengths of a triangle
 * and will tell the user if the side lengths can make a triangle. Then it
 * will check to see if a right angle triangle is possible.
 */
package edu.hdsb.gwss.ip.ics3.u4;

import java.util.Scanner;

public class Triangle2 {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //Variables
        double side1, side2, side3, temp;

        //Splash Screen
        System.out.println("TRIANGLE\n");
        System.out.println("Three numbers represent the side lengths of a triangle");
        System.out.println("when the sum of any two sides is greater than the third side.\n");
        System.out.println("This program will calculate if the given side lengths can make a triangle");
        System.out.println("If a triangle is possible, the program will check if it can be a right triangle\n");

        //Input
        do {
            System.out.println("Please Enter Side Length # 1:");
            side1 = input.nextDouble();
            System.out.println("Please Enter Side Length # 2:");
            side2 = input.nextDouble();
            System.out.println("Please Enter Side Length # 3:");
            side3 = input.nextDouble();

            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("Invalid Data. Side Lengths Needs to be Greater Than 0. Please Try Again");
            }
        } while (side1 <= 0 || side2 <= 0 || side3 <= 0);

        //Rearranging the Highest Number to Variable side3 (C)
        if (side1 > side2) {
            temp = side1;
            side1 = side2;
            side2 = temp;
        }
        if (side2 > side3) {
            temp = side2;
            side2 = side3;
            side3 = temp;
        }

        //Proccessing & Output
        if (side1 + side2 > side3) {
            if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
                System.out.println("These Sides CAN Make a Right Triangle");
            } else {
                System.out.println("These Sides CAN Make a Triangle");
            }
        } else {
            System.out.println("These Sides Cannot Make a Triangle");
        }

    } // END OF MAIN

} // END OF CLASS
