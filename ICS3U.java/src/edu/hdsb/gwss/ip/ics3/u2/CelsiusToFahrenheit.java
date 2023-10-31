/*
 * Name: Calvin Ip
 * Date: Sept. 23, 2019
 * Version: 0.1
 * Description: This program is used to convert 
 *              Celcius to Fahhrenheit
 */
package edu.hdsb.gwss.ip.ics3.u2;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        //Splash Screen
        System.out.println("This program will convert Celsius to Fahrenheit\n");

        //Variables
        double c, f;

        //Input
        c = 5;

        //Processing
        f = 9.0 / 5.0 * c + 32;
        
        //Output
        System.out.println(c + " degrees Celsius is " + f + " degrees Fahrenheit");
        
    }

}
