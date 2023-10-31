/*
 * Name: Calvin Ip
 * Date: Sept. 23, 2019
 * Version: 0.2
 * Description: This Program will tell the user the gratuity and total added on.             
 */
package edu.hdsb.gwss.ip.ics3.u2;

public class TipCalculator {

    public static void main(String[] args) {
        //Splash Screen
        System.out.println("This program will tell you the gratuity and the total\n");

        //Variables
        //s = subtotal, r = Gratuity Rate, g = Gratuity, t = Total
        double s, r, g, t;

        //Input
        s = 15;
        r = 0.15;

        //Processing
        g = s * r;
        t = ((s * r) + s);

        //Output
        System.out.println("The Gratuity is " + g + " and the total is " + t);

    }

}
