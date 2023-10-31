/*
 * Name: Calvin Ip
 * Date: October 16, 2019
 * Version: 1.0
 * Description: This program will calculate the BMI of a person using height and
 *              weight. The User will be able to choose between the Metric System
 *              or the imperial system when asked for measurements
 */
package edu.hdsb.gwss.ip.ics3.u3;

import java.text.NumberFormat;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(3);
        decimal.setMaximumFractionDigits(3);

        //Variables
        double weight, height, BMI = 0;
        String choice = "one", BMIResult = "ERROR";

        //Splash Screen
        System.out.println("BMI CALCULATOR\n");
        System.out.println("This Program Will Calculate Your BMI (Body Mass Index)\n");

        //Input
        System.out.println("To Calculate in Metric,   Type 1");
        System.out.println("To Calculate in Imperial, Type 2");
        choice = input.next();

        switch (choice.toLowerCase()) {
            case "one":
            case "1":
            case "1.":
            case "metric":
                System.out.println("METRIC SOLUTION SELECTED\n");
                System.out.println("Please Enter Your Weight in Kilograms (kg)");
                weight = input.nextDouble();
                System.out.println("Please Enter Your Height in Meters (m)");
                height = input.nextDouble();

                if (weight <= 0 || height <= 0) {
                    System.out.println("INVALID DATA. NUMBERS MUST BE GREATER THAN 0");
                } else if (height < 0.54 || weight < 2.1 || height > 2.7 || weight > 500) {
                    System.out.println("VERY UNLIKELY, PLEASE TRY AGAIN");
                }

                //Proccessing For Metric
                BMI = weight / (height * height);
                break;

            case "two":
            case "2":
            case "2.":
            case "imperial":
                System.out.println("IMPERIAL SOLUTION SELECTED\n");
                System.out.println("Please Enter Your Weight in Pounds (lb)");
                weight = input.nextDouble();
                System.out.println("Please Enter Your Height in Inches (in)");
                height = input.nextDouble();

                if (weight <= 0 || height <= 0) {
                    System.out.println("INVALID DATA. NUMBERS MUST BE GREATER THAN 0");
                } else if (height < 21.51 || weight < 4.7 || height > 107 || weight > 1100) {
                    System.out.println("VERY UNLIKELY, PLEASE TRY AGAIN");
                }
                //Proccessing For Imperial
                BMI = (weight * 703) / (height * height);
                break;
            default:
                System.out.println("UNKNOWN CHOICE");
        }

        //Processing
        if (BMI > 0) {

            if (BMI < 16) {
                BMIResult = "STARVATION";
            } else if (BMI < 18.5) {
                BMIResult = "UNDERWEIGHT";
            } else if (BMI < 25) {
                BMIResult = "IDEAL";
            } else if (BMI < 30) {
                BMIResult = "OVERWEIGHT";
            } else if (BMI < 40) {
                BMIResult = "OBESE";
            } else {
                BMIResult = "MORBIDLY OBESE";
            }

            //Output
            System.out.println("YOUR BMI IS " + decimal.format(BMI) + " - " + BMIResult);
        }
        
    }

}
