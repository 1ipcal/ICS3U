/*
 * Name: Calvin Ip
 * Date: Sept. 27, 2019
 * Version: 1.0
 * Description: This program will calculate the surface area
 *              and the volume of a square based pyramid
 */
package edu.hdsb.gwss.ip.ics3.u2;

import java.text.NumberFormat;
import java.util.Scanner;

public class VolumeAndAreaRightSquarePyramidCalculator {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat decimalFormatter = NumberFormat.getNumberInstance();
        decimalFormatter.setMaximumFractionDigits(3);
        decimalFormatter.setMinimumFractionDigits(3);

        //Variables
        double baseEdge, height, area, volume;

        //Splash Screen
        System.out.println("SQUARE BASED PYRAMID");
        System.out.println("SURFACE AREA AND VOULME CALCULATOR");
        System.out.println("VERSION 1.0");
        System.out.println("------------------------------------------------");
        System.out.println("This Program Will Calculate the Surface Area");
        System.out.println("and the Volume of a Square Based Pyramid\n");

        //Input
        System.out.println("Please input how long the base edge is in Meters:");
        baseEdge = input.nextDouble();
        System.out.println("Please input how long the height is in Meters:");
        height = input.nextDouble();

        //Processing
        area = Math.pow(baseEdge, 2) + (2 * baseEdge) * (Math.sqrt((Math.pow(baseEdge, 2) / 4) + Math.pow(height, 2)));
        volume = Math.pow(baseEdge, 2) * (height / 3);

        //Output
        System.out.println("------------------------------------------------");
        System.out.println("The Surface Area of the Square Base Pyramid is : " + decimalFormatter.format(area) + " m" + (char) 0x00B2);
        System.out.println("The Volume of the Square Base Pyramid is       : " + decimalFormatter.format(volume) + " m" + (char) 0x00B3);

    }

}
