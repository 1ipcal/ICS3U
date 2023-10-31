/*
 * Name: Calvin Ip
 * Date: December 3, 2019
 * Version: 1.0
 * Description: This program will calculate the velocity using the formula: v = d/t
 *              
 */
package edu.hdsb.gwss.ip.ics3.u6;

import java.util.Scanner;

public class Velocity {

    public static double distance;
    public static double time;
    public static double velocity;
    
    public static void main(String[] args) {
        
        displaySplashScreen();
        getDistance();
        getTime();
        calculateVelocity();
        displayVelocity();
        
    }
    
    public static void displaySplashScreen(){
        System.out.println("SPEED\n");
        System.out.println("This Program Will Calculate the Velocity in Meters per Seconds ");
        
    }
    
    public static void getDistance(){
        System.out.println("Please Enter a Distance in Meters");
        Scanner input = new Scanner(System.in);
        distance = input.nextDouble();
        
    }
    
    public static void getTime(){
        System.out.println("Please Enter a Time in Seconds");
        Scanner input = new Scanner(System.in);
        time = input.nextDouble();
    }
    
    public static void calculateVelocity(){
        velocity = distance/time;
    }
    
    public static void displayVelocity(){
        System.out.println("The Velocity is: " + velocity + "m/s");
    }
    
}
